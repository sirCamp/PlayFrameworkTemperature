(function() {
  $(document).ready(function() {
    var $input, picker;
    $(".button-collapse").sideNav();
    $input = $('.datepicker').pickadate();
    $('.datepicker').hide();
    picker = $input.pickadate('picker');
    picker.open();
    picker.on('set', function(data) {
      console.log(data);
    });
  });

}).call(this);

//# sourceMappingURL=main.js.map
