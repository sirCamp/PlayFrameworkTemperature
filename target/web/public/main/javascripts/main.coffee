$(document).ready ->
	


	ajaxRequest = (data) ->
	  
	  $('#failure_loader').removeClass('hide').addClass( 'show' );
	  $('#temperature_loader').removeClass('hide').addClass('show');
	  $('#temperature_graph').html('');
	  $('#failure_graph').html('');

	  $.get('/temperature/show/' + data.select).done((data) ->
	    console.debug '[DEBUG]: RICHIESTA TEMPERATURA AVVENUTA CON SUCCESSO'
	    window.m = data
	    if data.data.length == 0
	    	onEmptySuccess('temperature_graph','DataSet is empty, select another day...')
	    else
	    	onTemperatureSuccess data
	    $('#temperature_loader').removeClass('show').addClass('hide');
	    
	  ).fail((jqXHR, textStatus) ->
	    console.error '[DEBUG]: RICHIESTA TEMPERATURA FALLITA'	    
	    onError('temperature_graph',jQuery.parseJSON(jqXHR.responseText))
	    $('#temperature_loader').removeClass('show').addClass('hide');
	  )
	  
	  $.get('/failure/show/' + data.select).done((data) ->
	    console.debug '[DEBUG]: RICHIESTA TEMPERATURA AVVENUTA CON SUCCESSO'
	    window.m = data
	    if data.data.length == 0
	    	onEmptySuccess('failure_graph','Failure DataSet is empty, well done!')
	    else
	    	onFailureSuccess data
	    $('#failure_loader').removeClass('show').addClass('hide');
	  ).fail((jqXHR, textStatus) ->
	    console.error '[DEBUG]: RICHIESTA FAILURE FALLITA'
	    onError('failure_graph',jQuery.parseJSON(jqXHR.responseText))
	    $('#failure_loader').removeClass('show').addClass('hide');
	  )
	  return
				   
	

	## MOBILE SIDE-BAR ##
	$(".button-collapse").sideNav();
	
	## DATE PICKER MODEDD ##
	$input = $('.datepicker').pickadate()
	#$('.datepicker').hide()
	window.picker = $input.pickadate('picker');
	#picker.open();

	picker.on 'set', (data) ->
	  
 	if data.select != undefined
  	
  	  	ajaxRequest(data);
  	  	this.close();
	  
  		#return
	 $(".fa-spin").show();
	 console.log 'Creo Oggetto e stampo';

	init = () ->
		
		console.debug '[DEBUG]: INIZIALIZZO CON DATA DI TEST LA PRIMA CHIAMATA (2015-04-01)'
		#OGGETTO DI TEST
		dateObject = {'select':new Date("2015-4-1").getTime()};
		#dateObject = {'select': new Date().getTime()};
		ajaxRequest(dateObject);
	init();

	onEmptySuccess = (element, message) ->
		
		switch element
		  when 'temperature_graph'
		  	$('#'+element).html('<blockquote ><span class="fa fa-warning" style="margin-right:5px; color:#EF9A9A"></span>'+message+'</blockquote>');
		  	$('#temperature_loader').removeClass('show').addClass('hide');

		  when 'failure_graph'
		  	$('#'+element).html('<blockquote style=" border-color:#a5d6a7"><span class="fa fa-check" style="margin-right:5px; color:#a5d6a7"></span>'+message+'</blockquote>');
		  	$('#failure_loader').removeClass('show').addClass('hide');

		console.log message

	onError = (element,data) ->
		switch element
		  when 'temperature_graph'
		  	$('#'+element).html('<blockquote style="border-color:#a94442;"><span class="fa fa-exclamation-circle" style="margin-right:5px; color:#a94442"></span>'+data.message+'</blockquote>');
		  	$('#temperature_loader').removeClass('show').addClass('hide');

		  when 'failure_graph'
		  	$('#'+element).html('<blockquote style="border-color:#a94442;"><span class="fa fa-exclamation-circle" style="margin-right:5px; color:#a94442"></span>'+data.message+'</blockquote>');
		  	$('#failure_loader').removeClass('show').addClass('hide');

	onTemperatureSuccess = (series) ->
	  console.debug '[DEBUG]: STAMPO L\'OGGETTO '
	  console.log series.data
	  ###
	  *
	  * ESTRAZIONE DATI DAL JSON OBCJET
	  *
	  *
	  *
	  ###
	
	  alreadyFetched = {};
	  data = [];
	  console.debug '[DEBUG]: RICEVUTO IL JSON E TRADOTTO A OBJECT -> ARRAY'
	  dataReal = []
	  console.debug '[DEBUG]: INIZIO ESTRAZIONE OBJECT'
	  $.each series.data, (key, value) ->
	    
	    dataReal.push [
	      value.timestamp*1000
	      value.temperature
	    ]
	    return
	  console.debug '[DEBUG]: FINE ESTRAZIONE OBJECT'
	  series.data = dataReal
	  series.label = 'Daily temperature'
	  series.color = '#4db6ac';
	  window.dataReal = dataReal;
	  console.log series.data[0];
	  
	  console.debug '[DEBUG]: INIZIALIZZO L\'OGGETTO GRAFICO';
	  options = 
	    series:
	      lines:
	        show: true
	        fill: true
	        lineWidth: 1
	        fillColor: colors: [
	          {
	            color: '#FFA500'
	            opacity: 0.5
	          }
	          { opacity: 0.5 }
	          { opacity: 0.5 }
	          { opacity: 0.5 }
	          { opacity: 0.5 }
	          { opacity: 0.5 }
	          { opacity: 0.5 }
	        ]
	      points: show: true
	      shadowSize: 1
	    legend: position: 'sw'
	    grid:
	      hoverable: true
	      clickable: true
	      borderColor: '#ddd'
	      borderWidth: 1
	      labelMargin: 10
	      backgroundColor: '#fff'
	    yaxis:
	      color: '#eee'
	      axisLabel: 'Temperature'
	      axisLabelUseCanvas: true
	      axisLabelFontSizePixels: 12
	      axisLabelFontFamily: 'Verdana, Arial'
	      axisLabelPadding: 5
	      tickSize: 5
	    xaxis:
	      color: '#eee'
	      axisLabel: 'Ore '
	      axisLabelUseCanvas: true
	      axisLabelFontSizePixels: 12
	      axisLabelFontFamily: 'Verdana, Arial'
	      axisLabelPadding: 10
	      mode: 'time'
	      timeformat: '%H'
	      tickSize: [
	        1
	        'hour'
	      ]
	      timezone: 'browser'
	    zoom: interactive: true
	    pan: interactive: true
	  # Estraggo la prima coordinata per printarla
	
	  firstcoordinate = '(' + series.data[0][0] + ', ' + series.data[0][1] + ')'
	  console.log firstcoordinate
	  #button.siblings('span').text 'Fetched ' + series.label + ', first point: ' + firstcoordinate
	  # Push the new data onto our existing data array
	  if !alreadyFetched[series.label]
	    alreadyFetched[series.label] = true
	    data.push series

	  plot = $.plot '#temperature_graph', data, options
	  $('#temperature_graph').bind 'plothover', (event, pos, item) ->
	    str = '(' + pos.x.toFixed(2) + ', ' + pos.y.toFixed(2) + ')'
	    $('#hoverdata').text str
	    if item
	      x = new Date(item.datapoint[0]).toTimeString();
	      y = item.datapoint[1];
	      
	      $('#tooltip').html('Temprature at ' + x + ' is ' + y.toString() + '&deg;C').css(
	        top: item.pageY + 5
	        left: item.pageX + 5
	        'background-color': '#AAE2DD').fadeIn 200
	    else
	      $('#tooltip').hide()
	    return
	  $('#temperature_graph').bind 'plotclick', (event, pos, item) ->
	    if item
	      $('#clickdata').text ' - click point ' + item.dataIndex + ' in ' + item.series.label
	      plot.highlight item.series, item.datapoint
	    return
	  return

	onFailureSuccess = (series) ->
	    console.debug '[DEBUG]: STAMPO L\'OGGETTO '
	    console.log series.data
	    ###
	    *
	    * ESTRAZIONE DATI DAL JSON OBCJET
	    *
	    *
	    *
	    ###
	  
	    alreadyFetched = {};
	    data = [];
	    console.debug '[DEBUG]: RICEVUTO IL JSON E TRADOTTO A OBJECT -> ARRAY'
	    dataReal = []
	    console.debug '[DEBUG]: INIZIO ESTRAZIONE OBJECT'
	    $.each series.data, (key, value) ->
	      
	      dataReal.push [
	        value.timestamp*1000
	        1
	      ]
	      return
	    console.debug '[DEBUG]: FINE ESTRAZIONE OBJECT'
	    series.data = dataReal
	    series.label = 'Daily failure'
	    series.color = '#ee6e73';
	    window.dataReal = dataReal;
	    console.log series.data[0];
	    
	    console.debug '[DEBUG]: INIZIALIZZO L\'OGGETTO GRAFICO';
	    options = 
	      series:
	        lines:
	          show: false
	          fill: true
	          lineWidth: 1
	          fillColor: colors: [
	            {
	              color: '#FFA500'
	              opacity: 0.5
	            }
	            { opacity: 0.5 }
	            { opacity: 0.5 }
	            { opacity: 0.5 }
	            { opacity: 0.5 }
	            { opacity: 0.5 }
	            { opacity: 0.5 }
	          ]
	        points: show: true
	        shadowSize: 1
	      legend: position: 'sw'
	      grid:
	        hoverable: true
	        clickable: true
	        borderColor: '#ddd'
	        borderWidth: 1
	        labelMargin: 10
	        backgroundColor: '#fff'
	      yaxis:
	        color: '#eee'
	        axisLabel: 'Temperature'
	        axisLabelUseCanvas: true
	        axisLabelFontSizePixels: 12
	        axisLabelFontFamily: 'Verdana, Arial'
	        axisLabelPadding: 5
	        tickSize: 1
	      xaxis:
	        color: '#eee'
	        axisLabel: 'Ore '
	        axisLabelUseCanvas: true
	        axisLabelFontSizePixels: 12
	        axisLabelFontFamily: 'Verdana, Arial'
	        axisLabelPadding: 10
	        mode: 'time'
	        timeformat: '%H'
	        tickSize: [
	          1
	          'hour'
	        ]
	        timezone: 'browser'
	      zoom: interactive: true
	      pan: interactive: true
	    # Estraggo la prima coordinata per printarla
	  
	    firstcoordinate = '(' + series.data[0][0] + ', ' + series.data[0][1] + ')'
	    
	    #button.siblings('span').text 'Fetched ' + series.label + ', first point: ' + firstcoordinate
	    # Push the new data onto our existing data array
	    if !alreadyFetched[series.label]
	      alreadyFetched[series.label] = true
	      data.push series

	    plot = $.plot '#failure_graph', data, options
	    $('#failure_graph').bind 'plothover', (event, pos, item) ->
	      str = '(' + pos.x.toFixed(2) + ', ' + pos.y.toFixed(2) + ')'
	      $('#hoverdata').text str
	      if item
	        x = new Date((item.datapoint[0])).toTimeString();
	        console.log item.datapoint[0];
	        y = item.datapoint[1];
	        
	        $('#tooltip').html('Failure  on ' + x.toString() ).css(
	          top: item.pageY + 5
	          left: item.pageX + 5
	          'background-color': '#ee6e73').fadeIn 200
	      else
	        $('#tooltip').hide()
	      return
	    $('#failure_graph').bind 'plotclick', (event, pos, item) ->
	      if item
	        $('#clickdata').text ' - click point ' + item.dataIndex + ' in ' + item.series.label
	        plot.highlight item.series, item.datapoint
	      return
	    return
return