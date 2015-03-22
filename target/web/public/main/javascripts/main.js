(function() {
  $(document).ready(function() {
    var $input, picker;
    $(".button-collapse").sideNav();
    $input = $('.datepicker').pickadate();
    $('.datepicker').hide();
    picker = $input.pickadate('picker');
    picker.open();
    picker.on('set', function(data) {
      $.get('/temperature/show/' + thingValue).done(function(data) {
        console.log('second success');
      }).fail(function(data) {
        console.log('error');
      }).always(function(data) {
        $('.fa-spin').hide();
      });
    });
    $(".fa-spin").show();
    return console.log('creao oggetto e stampo');
  });

  return;

}).call(this);

//# sourceMappingURL=main.js.map
