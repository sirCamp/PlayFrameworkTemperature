(function() {
  $(document).ready(function() {
    var $input, ajaxRequest, init, onEmptySuccess, onTemperatureError, onTemperatureSuccess;
    ajaxRequest = function(data) {
      $('#failure_loader').removeClass('hide').addClass('show');
      $('#temperature_loader').removeClass('hide').addClass('show');
      $('#temperature_graph').html('');
      $('#failure_graph').html('');
      $.get('/temperature/show/' + data.select).done(function(data) {
        console.debug('[DEBUG]: RICHIESTA TEMPERATURA AVVENUTA CON SUCCESSO');
        window.m = data;
        if (data.data.length === 0) {
          onEmptySuccess('temperature_graph', 'DataSet is empty, select another day...');
        } else {
          onTemperatureSuccess(data);
        }
        return $('#temperature_loader').removeClass('show').addClass('hide');
      }).fail(function(data) {
        console.error('[DEBUG]: RICHIESTA TEMPERATURA FALLITA');
        onTemperatureError();
        return $('#temperature_loader').removeClass('show').addClass('hide');
      });
      $.get('/failure/show/' + data.select).done(function(data) {
        console.debug('[DEBUG]: RICHIESTA TEMPERATURA AVVENUTA CON SUCCESSO');
        window.m = data;
        if (data.data.length === 0) {
          onEmptySuccess('failure_graph', 'Failure DataSet is empty, well done!');
        } else {
          onFailureSuccess(data);
        }
        return $('#failure_loader').removeClass('show').addClass('hide');
      }).fail(function(data) {
        return console.error('[DEBUG]: RICHIESTA FAILURE FALLITA');
      });
    };
    $(".button-collapse").sideNav();
    $input = $('.datepicker').pickadate();
    window.picker = $input.pickadate('picker');
    picker.on('set', function(data) {
      if (data.select !== void 0) {
        ajaxRequest(data);
        this.close();
      }
      $(".fa-spin").show();
      return console.log('Creo Oggetto e stampo');
    });
    init = function() {
      var dateObject;
      console.debug('[DEBUG]: INIZIALIZZO CON DATA DI TEST LA PRIMA CHIAMATA (2015-04-01)');
      dateObject = {
        'select': new Date("2015-4-1").getTime()
      };
      return ajaxRequest(dateObject);
    };
    init();
    onEmptySuccess = function(element, message) {
      switch (element) {
        case 'temperature_graph':
          $('#' + element).html('<blockquote style="font-size: 2em;"><span class="fa fa-warning" style="margin-right:5px; color:#EF9A9A"></span>' + message + '</blockquote>');
          $('#temperature_loader').removeClass('show').addClass('hide');
          break;
        case 'failure_graph':
          $('#' + element).html('<blockquote style="font-size: 2em; border-color:#a5d6a7"><span class="fa fa-check" style="margin-right:5px; color:#a5d6a7"></span>' + message + '</blockquote>');
          $('#failure_loader').removeClass('show').addClass('hide');
      }
      return console.log(message);
    };
    onTemperatureError = function() {
      return console.log('MERDA');
    };
    return onTemperatureSuccess = function(series) {
      var alreadyFetched, data, dataReal, firstcoordinate, onFailureSuccess, options, plot;
      console.debug('[DEBUG]: STAMPO L\'OGGETTO ');
      console.log(series.data);

      /*
      	  *
      	  * ESTRAZIONE DATI DAL JSON OBCJET
      	  *
      	  *
      	  *
       */
      alreadyFetched = {};
      data = [];
      console.debug('[DEBUG]: RICEVUTO IL JSON E TRADOTTO A OBJECT -> ARRAY');
      dataReal = [];
      console.debug('[DEBUG]: INIZIO ESTRAZIONE OBJECT');
      $.each(series.data, function(key, value) {
        dataReal.push([value.timestamp, value.temperature]);
      });
      console.debug('[DEBUG]: FINE ESTRAZIONE OBJECT');
      series.data = dataReal;
      series.label = 'Daily temperature';
      series.color = '#4db6ac';
      window.dataReal = dataReal;
      console.log(series.data[0]);
      console.debug('[DEBUG]: INIZIALIZZO L\'OGGETTO GRAFICO');
      options = {
        series: {
          lines: {
            show: true,
            fill: true,
            lineWidth: 1,
            fillColor: {
              colors: [
                {
                  color: '#FFA500',
                  opacity: 0.5
                }, {
                  opacity: 0.5
                }, {
                  opacity: 0.5
                }, {
                  opacity: 0.5
                }, {
                  opacity: 0.5
                }, {
                  opacity: 0.5
                }, {
                  opacity: 0.5
                }
              ]
            }
          },
          points: {
            show: true
          },
          shadowSize: 1
        },
        legend: {
          position: 'sw'
        },
        grid: {
          hoverable: true,
          clickable: true,
          borderColor: '#ddd',
          borderWidth: 1,
          labelMargin: 10,
          backgroundColor: '#fff'
        },
        yaxis: {
          color: '#eee',
          axisLabel: 'Temperature',
          axisLabelUseCanvas: true,
          axisLabelFontSizePixels: 12,
          axisLabelFontFamily: 'Verdana, Arial',
          axisLabelPadding: 5,
          tickSize: 5
        },
        xaxis: {
          color: '#eee',
          axisLabel: 'Ore ',
          axisLabelUseCanvas: true,
          axisLabelFontSizePixels: 12,
          axisLabelFontFamily: 'Verdana, Arial',
          axisLabelPadding: 10,
          mode: 'time',
          timeformat: '%H',
          tickSize: [1, 'hour']
        },
        zoom: {
          interactive: true
        },
        pan: {
          interactive: true
        }
      };
      firstcoordinate = '(' + series.data[0][0] + ', ' + series.data[0][1] + ')';
      console.log(firstcoordinate);
      if (!alreadyFetched[series.label]) {
        alreadyFetched[series.label] = true;
        data.push(series);
      }
      plot = $.plot('#temperature_graph', data, options);
      $('#temperature_graph').bind('plothover', function(event, pos, item) {
        var str, x, y;
        str = '(' + pos.x.toFixed(2) + ', ' + pos.y.toFixed(2) + ')';
        $('#hoverdata').text(str);
        if (item) {
          x = new Date(item.datapoint[0]).toTimeString();
          y = item.datapoint[1];
          $('#tooltip').html('Temprature at ' + x + ' is ' + y.toString() + '&deg;C').css({
            top: item.pageY + 5,
            left: item.pageX + 5,
            'background-color': '#AAE2DD'
          }).fadeIn(200);
        } else {
          $('#tooltip').hide();
        }
      });
      $('#temperature_graph').bind('plotclick', function(event, pos, item) {
        if (item) {
          $('#clickdata').text(' - click point ' + item.dataIndex + ' in ' + item.series.label);
          plot.highlight(item.series, item.datapoint);
        }
      });
      return;
      return onFailureSuccess = function(series) {
        console.debug('[DEBUG]: STAMPO L\'OGGETTO ');
        console.log(series.data);

        /*
        	    *
        	    * ESTRAZIONE DATI DAL JSON OBCJET
        	    *
        	    *
        	    *
         */
        alreadyFetched = {};
        data = [];
        console.debug('[DEBUG]: RICEVUTO IL JSON E TRADOTTO A OBJECT -> ARRAY');
        dataReal = [];
        console.debug('[DEBUG]: INIZIO ESTRAZIONE OBJECT');
        $.each(series.data, function(key, value) {
          dataReal.push([value.timestamp, value.temperature]);
        });
        console.debug('[DEBUG]: FINE ESTRAZIONE OBJECT');
        series.data = dataReal;
        series.label = 'Daily temperature';
        series.color = '#4db6ac';
        window.dataReal = dataReal;
        console.log(series.data[0]);
        console.debug('[DEBUG]: INIZIALIZZO L\'OGGETTO GRAFICO');
        options = {
          series: {
            lines: {
              show: true,
              fill: true,
              lineWidth: 1,
              fillColor: {
                colors: [
                  {
                    color: '#FFA500',
                    opacity: 0.5
                  }, {
                    opacity: 0.5
                  }, {
                    opacity: 0.5
                  }, {
                    opacity: 0.5
                  }, {
                    opacity: 0.5
                  }, {
                    opacity: 0.5
                  }, {
                    opacity: 0.5
                  }
                ]
              }
            },
            points: {
              show: true
            },
            shadowSize: 1
          },
          legend: {
            position: 'sw'
          },
          grid: {
            hoverable: true,
            clickable: true,
            borderColor: '#ddd',
            borderWidth: 1,
            labelMargin: 10,
            backgroundColor: '#fff'
          },
          yaxis: {
            color: '#eee',
            axisLabel: 'Temperature',
            axisLabelUseCanvas: true,
            axisLabelFontSizePixels: 12,
            axisLabelFontFamily: 'Verdana, Arial',
            axisLabelPadding: 5,
            tickSize: 5
          },
          xaxis: {
            color: '#eee',
            axisLabel: 'Ore ',
            axisLabelUseCanvas: true,
            axisLabelFontSizePixels: 12,
            axisLabelFontFamily: 'Verdana, Arial',
            axisLabelPadding: 10,
            mode: 'time',
            timeformat: '%H',
            tickSize: [1, 'hour']
          },
          zoom: {
            interactive: true
          },
          pan: {
            interactive: true
          }
        };
        firstcoordinate = '(' + series.data[0][0] + ', ' + series.data[0][1] + ')';
        console.log(firstcoordinate);
        if (!alreadyFetched[series.label]) {
          alreadyFetched[series.label] = true;
          data.push(series);
        }
        plot = $.plot('#temperature_graph', data, options);
        $('#temperature_graph').bind('plothover', function(event, pos, item) {
          var str, x, y;
          str = '(' + pos.x.toFixed(2) + ', ' + pos.y.toFixed(2) + ')';
          $('#hoverdata').text(str);
          if (item) {
            x = new Date(item.datapoint[0]).toTimeString();
            y = item.datapoint[1];
            $('#tooltip').html('Temprature at ' + x + ' is ' + y.toString() + '&deg;C').css({
              top: item.pageY + 5,
              left: item.pageX + 5,
              'background-color': '#AAE2DD'
            }).fadeIn(200);
          } else {
            $('#tooltip').hide();
          }
        });
        $('#temperature_graph').bind('plotclick', function(event, pos, item) {
          if (item) {
            $('#clickdata').text(' - click point ' + item.dataIndex + ' in ' + item.series.label);
            plot.highlight(item.series, item.datapoint);
          }
        });
      };
    };
  });

  return;

}).call(this);

//# sourceMappingURL=main.js.map
