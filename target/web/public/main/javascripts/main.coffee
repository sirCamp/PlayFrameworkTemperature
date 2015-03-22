$(document).ready ->
	
	## MOBILE SIDE-BAR ##
	$(".button-collapse").sideNav();
	
	## DATE PICKER MODEDD ##
	$input = $('.datepicker').pickadate()
	$('.datepicker').hide()
	picker = $input.pickadate('picker');
	picker.open();
	picker.on 'set', (data) ->
	  
 	if data.select != undefined
  	
	  $.get('/temperature/show/' + data.select).done((data) ->
				console.log 'second success'
				return
		).fail((data) ->
				  console.log 'error'
				  return
		).always (data) ->
				  $('.fa-spin').hide()
				  return

 	
 		$.get('/failure/show/' + data.select).done((data) ->
				console.log 'second success'
				return
		).fail((data) ->
				  console.log 'error'
				  return
		).always (data) ->
				  $('.fa-spin').hide()
				  return
  		return
	 $(".fa-spin").show();
	 console.log 'creao oggetto e stampo';
return