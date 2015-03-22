$(document).ready ->
	
	## MOBILE SIDE-BAR ##
	$(".button-collapse").sideNav();
	
	## DATE PICKER MODEDD ##
	$input = $('.datepicker').pickadate()
	$('.datepicker').hide()
	picker = $input.pickadate('picker');
	picker.open();
	picker.on 'set', (data) ->
  		console.log data ## AJAX REQUEST
  		return
 	return