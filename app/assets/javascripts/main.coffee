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
				onTemperatureSuccess(data);
				return
		).fail((data) ->
				  console.log 'error'
				  onTemperatureError()
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
  		#return
	 $(".fa-spin").show();
	 console.log 'Creo Oggetto e stampo';


	onTemperatureError = () ->
		console.log 'MERDA'

	onTemperatureSuccess = (series) ->
	  console.debug 'STAMPO'
	  console.log series.data
	  ###
	  *
	  * ESTRAZIONE DATI DAL JSON OBCJET
	  *
	  *
	  *
	  ###
	
	  console.debug 'DEBUG: RICEVUTO IL JSON E TRADOTTO A OBJECT -> ARRAY'
	  dataReal = []
	  console.debug 'DEBUG: INIZIO ESTRAZIONE OBJECT'
	  $.each series.data, (key, value) ->
	    
	    dataReal.push [
	      value[0]
	      value[1]
	    ]
	    return
	  console.debug 'DEBUG: FINE ESTRAZIONE OBJECT'
	  series.data = dataReal
	  
	  # Estraggo la prima coordinata per printarla
	
	  firstcoordinate = '(' + series.data[0][0] + ', ' + series.data[0][1] + ')'
	  console.log firstcoordinate
	  button.siblings('span').text 'Fetched ' + series.label + ', first point: ' + firstcoordinate
	  # Push the new data onto our existing data array
	  if !alreadyFetched[series.label]
	    alreadyFetched[series.label] = true
	    data.push series
	  $.plot '#placeholder', data, options
	  return
return