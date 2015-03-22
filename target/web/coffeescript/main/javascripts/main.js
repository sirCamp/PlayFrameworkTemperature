(function() {
  $(document).ready(function() {
    var $input, picker;
    $(".button-collapse").sideNav();
    $input = $('.datepicker').pickadate();
    $('.datepicker').hide();
    picker = $input.pickadate('picker');
    picker.open();
    return picker.on('set', function(data) {
      if (data.select !== void 0) {
        $.get('/temperature/show/' + data.select).done(function(data) {
          console.log('second success');
        }).fail(function(data) {
          console.log('error');
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
        return;
      }
      $(".fa-spin").show();
      return console.log('creao oggetto e stampo');
    });
  });

  return;

}).call(this);

//# sourceMappingURL=main.js.map
