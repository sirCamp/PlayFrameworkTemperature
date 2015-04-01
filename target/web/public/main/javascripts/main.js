(function() {
  $(document).ready(function() {
    var $input, ajaxRequest, init, onEmptySuccess, onError, onFailureSuccess, onTemperatureSuccess;
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
      }).fail(function(jqXHR, textStatus) {
        console.error('[DEBUG]: RICHIESTA TEMPERATURA FALLITA');
        onError('temperature_graph', jQuery.parseJSON(jqXHR.responseText));
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
      }).fail(function(jqXHR, textStatus) {
        console.error('[DEBUG]: RICHIESTA FAILURE FALLITA');
        onError('failure_graph', jQuery.parseJSON(jqXHR.responseText));
        return $('#failure_loader').removeClass('show').addClass('hide');
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
      return $(".fa-spin").show();
    });
    init = function() {
      var dateObject;
      console.debug('[DEBUG]: INIZIALIZZO CON DATA DI TEST LA PRIMA CHIAMATA (2015-04-01)');
      dateObject = {
        'select': new Date().getTime()
      };
      return ajaxRequest(dateObject);
    };
    init();
    onEmptySuccess = function(element, message) {
      switch (element) {
        case 'temperature_graph':
          $('#' + element).html('<blockquote ><span class="fa fa-warning" style="margin-right:5px; color:#EF9A9A"></span>' + message + '</blockquote>');
          $('#temperature_loader').removeClass('show').addClass('hide');
          break;
        case 'failure_graph':
          $('#' + element).html('<blockquote style=" border-color:#a5d6a7"><span class="fa fa-check" style="margin-right:5px; color:#a5d6a7"></span>' + message + '</blockquote>');
          $('#failure_loader').removeClass('show').addClass('hide');
      }
      return console.log(message);
    };
    onError = function(element, data) {
      switch (element) {
        case 'temperature_graph':
          $('#' + element).html('<blockquote style="border-color:#a94442;"><span class="fa fa-exclamation-circle" style="margin-right:5px; color:#a94442"></span>' + data.message + '</blockquote>');
          return $('#temperature_loader').removeClass('show').addClass('hide');
        case 'failure_graph':
          $('#' + element).html('<blockquote style="border-color:#a94442;"><span class="fa fa-exclamation-circle" style="margin-right:5px; color:#a94442"></span>' + data.message + '</blockquote>');
          return $('#failure_loader').removeClass('show').addClass('hide');
      }
    };
    onTemperatureSuccess = function(series) {
      var alreadyFetched, data, dataReal, firstcoordinate, options, plot;
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
        dataReal.push([value.timestamp * 1000, value.temperature]);
      });
      console.debug('[DEBUG]: FINE ESTRAZIONE OBJECT');
      series.data = dataReal;
      series.label = 'Daily temperature';
      series.color = '#4db6ac';
      window.dataReal = dataReal;
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
          shadowSize: 1,
          legend: {
            position: 'nw'
          }
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
          tickSize: [1, 'hour'],
          timezone: 'browser'
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
    return onFailureSuccess = function(series) {
      var alreadyFetched, data, dataReal, firstcoordinate, options, plot;
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
        dataReal.push([value.timestamp * 1000, 1]);
      });
      console.debug('[DEBUG]: FINE ESTRAZIONE OBJECT');
      series.data = dataReal;
      series.label = 'Daily failure';
      series.color = '#ee6e73';
      window.dataReal = dataReal;
      console.log(series.data[0]);
      console.debug('[DEBUG]: INIZIALIZZO L\'OGGETTO GRAFICO');
      options = {
        series: {
          lines: {
            show: false,
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
          tickSize: 1
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
          tickSize: [1, 'hour'],
          timezone: 'browser'
        },
        zoom: {
          interactive: true
        },
        pan: {
          interactive: true
        }
      };
      firstcoordinate = '(' + series.data[0][0] + ', ' + series.data[0][1] + ')';
      if (!alreadyFetched[series.label]) {
        alreadyFetched[series.label] = true;
        data.push(series);
      }
      plot = $.plot('#failure_graph', data, options);
      $('#failure_graph').bind('plothover', function(event, pos, item) {
        var str, x, y;
        str = '(' + pos.x.toFixed(2) + ', ' + pos.y.toFixed(2) + ')';
        $('#hoverdata').text(str);
        if (item) {
          x = new Date(item.datapoint[0]).toTimeString();
          console.log(item.datapoint[0]);
          y = item.datapoint[1];
          $('#tooltip').html('Failure  on ' + x.toString()).css({
            top: item.pageY + 5,
            left: item.pageX + 5,
            'background-color': '#ee6e73'
          }).fadeIn(200);
        } else {
          $('#tooltip').hide();
        }
      });
      $('#failure_graph').bind('plotclick', function(event, pos, item) {
        if (item) {
          $('#clickdata').text(' - click point ' + item.dataIndex + ' in ' + item.series.label);
          plot.highlight(item.series, item.datapoint);
        }
      });
    };
  });

  return;

}).call(this);

//# sourceMappingURL=main.js.map
