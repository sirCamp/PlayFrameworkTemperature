(function() {
  $(document).ready(function() {
    var $input, onTemperatureError, onTemperatureSuccess, picker;
    $(".button-collapse").sideNav();
    $input = $('.datepicker').pickadate();
    $('.datepicker').hide();
    picker = $input.pickadate('picker');
    picker.open();
    picker.on('set', function(data) {
      if (data.select !== void 0) {
        $.get('/temperature/show/' + data.select).done(function(data) {
          console.log('second success');
          onTemperatureSuccess(data);
        }).fail(function(data) {
          console.log('error');
          onTemperatureError();
        }).always(function(data) {
          $('.fa-spin').hide();
        });
        $.get('/failure/show/' + data.select).done(function(data) {
          console.log('second success');
        }).fail(function(data) {
          console.log('error');
        }).always(function(data) {
          $('.fa-spin').hide();
        });
      }
      $(".fa-spin").show();
      return console.log('Creo Oggetto e stampo');
    });
    onTemperatureError = function() {
      return console.log('MERDA');
    };
    return onTemperatureSuccess = function(series) {
      var dataReal, firstcoordinate;
      console.debug('STAMPO');
      console.log(series.data);

      /*
      	  *
      	  * ESTRAZIONE DATI DAL JSON OBCJET
      	  *
      	  *
      	  *
       */
      console.debug('DEBUG: RICEVUTO IL JSON E TRADOTTO A OBJECT -> ARRAY');
      dataReal = [];
      console.debug('DEBUG: INIZIO ESTRAZIONE OBJECT');
      $.each(series.data, function(key, value) {
        dataReal.push([value[0], value[1]]);
      });
      console.debug('DEBUG: FINE ESTRAZIONE OBJECT');
      series.data = dataReal;
      firstcoordinate = '(' + series.data[0][0] + ', ' + series.data[0][1] + ')';
      console.log(firstcoordinate);
      button.siblings('span').text('Fetched ' + series.label + ', first point: ' + firstcoordinate);
      if (!alreadyFetched[series.label]) {
        alreadyFetched[series.label] = true;
        data.push(series);
      }
      $.plot('#placeholder', data, options);
    };
  });

  return;

}).call(this);

//# sourceMappingURL=main.js.map
