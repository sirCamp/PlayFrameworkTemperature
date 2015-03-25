
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Home")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
	"""),format.raw/*4.2*/("""<script type="text/javascript">

	$(function() """),format.raw/*6.15*/("""{"""),format.raw/*6.16*/("""

		"""),format.raw/*8.3*/("""var options = """),format.raw/*8.17*/("""{"""),format.raw/*8.18*/("""

						"""),format.raw/*10.7*/("""series: """),format.raw/*10.15*/("""{"""),format.raw/*10.16*/("""
							"""),format.raw/*11.8*/("""lines: """),format.raw/*11.15*/("""{"""),format.raw/*11.16*/("""
					            """),format.raw/*12.18*/("""show: true,
					            fill: true,
					            lineWidth: 1,
					            fillColor: """),format.raw/*15.29*/("""{"""),format.raw/*15.30*/("""
						            """),format.raw/*16.19*/("""colors: [ 
						            	"""),format.raw/*17.20*/("""{"""),format.raw/*17.21*/(""" """),format.raw/*17.22*/("""color: "#FFA500",opacity: 0.5 """),format.raw/*17.52*/("""}"""),format.raw/*17.53*/(""",
						            	"""),format.raw/*18.20*/("""{"""),format.raw/*18.21*/(""" """),format.raw/*18.22*/("""opacity: 0.5 """),format.raw/*18.35*/("""}"""),format.raw/*18.36*/(""",
						            	"""),format.raw/*19.20*/("""{"""),format.raw/*19.21*/(""" """),format.raw/*19.22*/("""opacity: 0.5 """),format.raw/*19.35*/("""}"""),format.raw/*19.36*/(""",
						            	"""),format.raw/*20.20*/("""{"""),format.raw/*20.21*/(""" """),format.raw/*20.22*/("""opacity: 0.5 """),format.raw/*20.35*/("""}"""),format.raw/*20.36*/(""",
						            	"""),format.raw/*21.20*/("""{"""),format.raw/*21.21*/(""" """),format.raw/*21.22*/("""opacity: 0.5 """),format.raw/*21.35*/("""}"""),format.raw/*21.36*/(""",
						            	"""),format.raw/*22.20*/("""{"""),format.raw/*22.21*/(""" """),format.raw/*22.22*/("""opacity: 0.5 """),format.raw/*22.35*/("""}"""),format.raw/*22.36*/(""",
						                """),format.raw/*23.23*/("""{"""),format.raw/*23.24*/(""" """),format.raw/*23.25*/("""opacity: 0.5 """),format.raw/*23.38*/("""}"""),format.raw/*23.39*/("""
						            """),format.raw/*24.19*/("""]
					            """),format.raw/*25.18*/("""}"""),format.raw/*25.19*/("""
				          	"""),format.raw/*26.16*/("""}"""),format.raw/*26.17*/(""",
						points: """),format.raw/*27.15*/("""{"""),format.raw/*27.16*/("""
			            	"""),format.raw/*28.17*/("""show: true
			          	"""),format.raw/*29.15*/("""}"""),format.raw/*29.16*/(""",
			          	shadowSize: 1
					"""),format.raw/*31.6*/("""}"""),format.raw/*31.7*/(""",
					  
					legend: """),format.raw/*33.14*/("""{"""),format.raw/*33.15*/("""
			        	"""),format.raw/*34.13*/("""position: 'nw'
			        """),format.raw/*35.12*/("""}"""),format.raw/*35.13*/(""",
					grid: """),format.raw/*36.12*/("""{"""),format.raw/*36.13*/("""
			          """),format.raw/*37.14*/("""hoverable: true,
			          clickable: true,
			          borderColor: '#ddd',
			          borderWidth: 1,
			          labelMargin: 10,
			          backgroundColor: '#fff'
			        """),format.raw/*43.12*/("""}"""),format.raw/*43.13*/(""",
			
			yaxis: """),format.raw/*45.11*/("""{"""),format.raw/*45.12*/("""
					  
			    """),format.raw/*47.8*/("""/*min: -70,
			    max: 70,*/
			    color: '#eee',
				axisLabel: "Temperature",
				axisLabelUseCanvas: true,
				axisLabelFontSizePixels: 12,
				axisLabelFontFamily: 'Verdana, Arial',
				axisLabelPadding: 5,
				tickSize: 5     	

			"""),format.raw/*57.4*/("""}"""),format.raw/*57.5*/(""",			
			xaxis: """),format.raw/*58.11*/("""{"""),format.raw/*58.12*/("""
				"""),format.raw/*59.5*/("""color: '#eee',
			    axisLabel: "Ore ",
			    axisLabelUseCanvas: true,
			    axisLabelFontSizePixels: 12,
			    axisLabelFontFamily: 'Verdana, Arial',
			    axisLabelPadding: 10,
			    mode: "time",
			    timeformat: "%H",
				tickSize: [1, "hour"]
			"""),format.raw/*68.4*/("""}"""),format.raw/*68.5*/(""",
			        zoom: """),format.raw/*69.18*/("""{"""),format.raw/*69.19*/("""
						"""),format.raw/*70.7*/("""interactive: true
					"""),format.raw/*71.6*/("""}"""),format.raw/*71.7*/(""",
					pan: """),format.raw/*72.11*/("""{"""),format.raw/*72.12*/("""
						"""),format.raw/*73.7*/("""interactive: true
					"""),format.raw/*74.6*/("""}"""),format.raw/*74.7*/("""
			"""),format.raw/*75.4*/("""}"""),format.raw/*75.5*/(""";
			$("<div id='tooltip'></div>").css("""),format.raw/*76.38*/("""{"""),format.raw/*76.39*/("""
				"""),format.raw/*77.5*/("""position: "absolute",
				display: "none",
				border: "1px solid #fdd",
				padding: "2px",
				"background-color": "#fee",
				opacity: 0.9
			"""),format.raw/*83.4*/("""}"""),format.raw/*83.5*/(""").appendTo("body");
		

		/*var data = [];

		$.plot("#placeholder", data, options);

		// Fetch one series, adding to what we already have

		var alreadyFetched = """),format.raw/*92.24*/("""{"""),format.raw/*92.25*/("""}"""),format.raw/*92.26*/(""";

		$("button.fetchSeries").click(function () """),format.raw/*94.45*/("""{"""),format.raw/*94.46*/("""

			"""),format.raw/*96.4*/("""var button = $(this);

			// Find the URL in the link right next to us, then fetch the data

			var dataurl = button.siblings("a").attr("href");

			function onDataReceived(series) """),format.raw/*102.36*/("""{"""),format.raw/*102.37*/("""
				
				"""),format.raw/*104.5*/("""/*
				*
				* ESTRAZIONE DATI DAL JSON OBCJET
				*
				*
				*
				*/
				/*console.log("DEBUG: RICEVUTO IL JSON E TRADOTTO A OBJECT -> ARRAY");
				
				var dataReal = []
				console.log("DEBUG: INIZIO ESTRAZIONE OBJECT");
				$.each( series.data, function( key, value )"""),format.raw/*115.48*/("""{"""),format.raw/*115.49*/("""
					"""),format.raw/*116.6*/("""console.log(value);
					dataReal.push([value[0],value[1]]);
				"""),format.raw/*118.5*/("""}"""),format.raw/*118.6*/(""")
				console.log("DEBUG: FINE ESTRAZIONE OBJECT");
				series.data = dataReal;
				console.log(dataReal);
				
				// Extract the first coordinate pair; jQuery has parsed it, so
				// the data is now just an ordinary JavaScript object

				var firstcoordinate = "(" + series.data[0][0] + ", " + series.data[0][1] + ")";
				console.log(firstcoordinate);
				button.siblings("span").text("Fetched " + series.label + ", first point: " + firstcoordinate);

				// Push the new data onto our existing data array

				if (!alreadyFetched[series.label]) """),format.raw/*132.40*/("""{"""),format.raw/*132.41*/("""
					"""),format.raw/*133.6*/("""alreadyFetched[series.label] = true;
					data.push(series);
				"""),format.raw/*135.5*/("""}"""),format.raw/*135.6*/("""

				"""),format.raw/*137.5*/("""$.plot("#placeholder", data, options);
			"""),format.raw/*138.4*/("""}"""),format.raw/*138.5*/("""

			"""),format.raw/*140.4*/("""$.ajax("""),format.raw/*140.11*/("""{"""),format.raw/*140.12*/("""
				"""),format.raw/*141.5*/("""url: dataurl,
				type: "GET",
				dataType: "json",
				success: onDataReceived
			"""),format.raw/*145.4*/("""}"""),format.raw/*145.5*/(""");
		"""),format.raw/*146.3*/("""}"""),format.raw/*146.4*/(""");

		// Initiate a recurring data update

		$("button.dataUpdate").click(function () """),format.raw/*150.44*/("""{"""),format.raw/*150.45*/("""

			"""),format.raw/*152.4*/("""data = [];
			alreadyFetched = """),format.raw/*153.21*/("""{"""),format.raw/*153.22*/("""}"""),format.raw/*153.23*/(""";

			//$.plot("#placeholder", data, options);

			var iteration = 0;

			function fetchData() """),format.raw/*159.25*/("""{"""),format.raw/*159.26*/("""

				"""),format.raw/*161.5*/("""++iteration;

				function onDataReceived(series) """),format.raw/*163.37*/("""{"""),format.raw/*163.38*/("""

					"""),format.raw/*165.6*/("""// Load all the data in one pass; if we only got partial
					// data we could merge it with what we already have.

					data = [ series ];

					$.plot("#placeholder", data, options);
				"""),format.raw/*171.5*/("""}"""),format.raw/*171.6*/("""

				"""),format.raw/*173.5*/("""// Normally we call the same URL - a script connected to a
				// database - but in this case we only have static example
				// files, so we need to modify the URL.

				$.ajax("""),format.raw/*177.12*/("""{"""),format.raw/*177.13*/("""
					"""),format.raw/*178.6*/("""url: "data-eu-gdp-growth-" + iteration + ".json",
					type: "GET",
					dataType: "json",
					success: onDataReceived
				"""),format.raw/*182.5*/("""}"""),format.raw/*182.6*/(""");

				if (iteration < 5) """),format.raw/*184.24*/("""{"""),format.raw/*184.25*/("""
					"""),format.raw/*185.6*/("""setTimeout(fetchData, 1000);
				"""),format.raw/*186.5*/("""}"""),format.raw/*186.6*/(""" """),format.raw/*186.7*/("""else """),format.raw/*186.12*/("""{"""),format.raw/*186.13*/("""
					"""),format.raw/*187.6*/("""data = [];
					alreadyFetched = """),format.raw/*188.23*/("""{"""),format.raw/*188.24*/("""}"""),format.raw/*188.25*/(""";
				"""),format.raw/*189.5*/("""}"""),format.raw/*189.6*/("""
			"""),format.raw/*190.4*/("""}"""),format.raw/*190.5*/("""

			"""),format.raw/*192.4*/("""setTimeout(fetchData, 1000);
		"""),format.raw/*193.3*/("""}"""),format.raw/*193.4*/(""");

		// Load the first series by default, so we don't have an empty plot

		$("button.fetchSeries:first").click();

		// Add the Flot version string to the footer

		$("#footer").prepend("Flot " + $.plot.version + " &ndash; ");*/
	"""),format.raw/*202.2*/("""}"""),format.raw/*202.3*/(""");</script>

	<style>

	</style>
	<div class="container">
	<div class="row" style="margin-top:50px;">
    	
    		<!--<div class="col l12 m12 s12  ">-->
	    		
	    		<div class="col l12 m12 s12">
	    			<div class="col l6 m6 s12">
		    			<button class="btn waves-effect waves-light datepicker" type="button" name="selectDay">
		    				Change Data
	    					<i class="mdi-action-schedule left"></i>
	  					</button>
	  				</div>
	  				<div class="col l6 m6 s12">
						<p class="flow-text description">Press the <em>Change Data</em> button for change the 	day and see the measuration of the day.
						</p>
	  				</div>
	    		</div>
	    		<div class="col l12 m12 s12">
	    			<h4><span class="fa fa-file-o" style="margin-right:10px;"></span>Misuration</h4>
	    			
	    			<div id="placeholder1"style=" min-height:200px;">
    				
    					<div class="col s6 custom-preloader hide" id="temperature_loader">

							<div class="preloader-wrapper big active">
				              <div class="spinner-layer spinner-blue">
				                <div class="circle-clipper left">
				                  <div class="circle"></div>
				                </div><div class="gap-patch">
				                  <div class="circle"></div>
				                </div><div class="circle-clipper right">
				                  <div class="circle"></div>
				                </div>
				              </div>

				              <div class="spinner-layer spinner-red">
				                <div class="circle-clipper left">
				                  <div class="circle"></div>
				                </div><div class="gap-patch">
				                  <div class="circle"></div>
				                </div><div class="circle-clipper right">
				                  <div class="circle"></div>
				                </div>
				              </div>

				              <div class="spinner-layer spinner-yellow">
				                <div class="circle-clipper left">
				                  <div class="circle"></div>
				                </div><div class="gap-patch">
				                  <div class="circle"></div>
				                </div><div class="circle-clipper right">
				                  <div class="circle"></div>
				                </div>
				              </div>

				              <div class="spinner-layer spinner-green">
				                <div class="circle-clipper left">
				                  <div class="circle"></div>
				                </div><div class="gap-patch">
				                  <div class="circle"></div>
				                </div><div class="circle-clipper right">
				                  <div class="circle"></div>
				                </div>
				              </div>
            				</div>
						</div>
						<div id="temperature_graph" style="height: 200px;"></div>
						</div>
					</div>
	    			
					
	    	</div>
	    	<div class="col l12 m12 s12">
	    			<h4><span class="fa fa-warning" style="margin-right: 5px;"></span>Failures</h4>
	    			<div style=" min-height:200px;">	

	    				<div class="col s6 custom-preloader hide" id="failure_loader" >
	    					
							<div class="preloader-wrapper big active">
				              <div class="spinner-layer spinner-blue">
				                <div class="circle-clipper left">
				                  <div class="circle"></div>
				                </div><div class="gap-patch">
				                  <div class="circle"></div>
				                </div><div class="circle-clipper right">
				                  <div class="circle"></div>
				                </div>
				              </div>

				              <div class="spinner-layer spinner-red">
				                <div class="circle-clipper left">
				                  <div class="circle"></div>
				                </div><div class="gap-patch">
				                  <div class="circle"></div>
				                </div><div class="circle-clipper right">
				                  <div class="circle"></div>
				                </div>
				              </div>

				              <div class="spinner-layer spinner-yellow">
				                <div class="circle-clipper left">
				                  <div class="circle"></div>
				                </div><div class="gap-patch">
				                  <div class="circle"></div>
				                </div><div class="circle-clipper right">
				                  <div class="circle"></div>
				                </div>
				              </div>

				              <div class="spinner-layer spinner-green">
				                <div class="circle-clipper left">
				                  <div class="circle"></div>
				                </div><div class="gap-patch">
				                  <div class="circle"></div>
				                </div><div class="circle-clipper right">
				                  <div class="circle"></div>
				                </div>
				              </div>
            				</div>
						</div>
						<div id="failure_graph" style="height: 200px;"></div>
						
	    			</div>
	    	</div>
	    <!--	</div>
    		
    		</div>
    		<div class="col l6 m12 s12">-->
    			<!--<input type="date" class="datepicker">-->
    			<!--<button class="btn waves-effect waves-light" type="button" name="selectDay">Submit
    				<i class="mdi-content-send right"></i>
  				</button>
    		</div>-->	
         </div>
    </div>   

""")))}),format.raw/*343.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 25 16:43:42 CET 2015
                  SOURCE: /home/stefano/Repository/PlayFrameworkTemperature/app/views/index.scala.html
                  HASH: 0a16dd2c425337e6bd7d4f80405dfe7eec284c25
                  MATRIX: 723->1|828->18|856->21|876->33|915->35|943->37|1017->84|1045->85|1075->89|1116->103|1144->104|1179->112|1215->120|1244->121|1279->129|1314->136|1343->137|1389->155|1517->255|1546->256|1593->275|1651->305|1680->306|1709->307|1767->337|1796->338|1845->359|1874->360|1903->361|1944->374|1973->375|2022->396|2051->397|2080->398|2121->411|2150->412|2199->433|2228->434|2257->435|2298->448|2327->449|2376->470|2405->471|2434->472|2475->485|2504->486|2553->507|2582->508|2611->509|2652->522|2681->523|2733->547|2762->548|2791->549|2832->562|2861->563|2908->582|2955->601|2984->602|3028->618|3057->619|3101->635|3130->636|3175->653|3228->678|3257->679|3319->714|3347->715|3398->738|3427->739|3468->752|3522->778|3551->779|3592->792|3621->793|3663->807|3879->995|3908->996|3952->1012|3981->1013|4024->1029|4290->1268|4318->1269|4361->1284|4390->1285|4422->1290|4709->1550|4737->1551|4784->1570|4813->1571|4847->1578|4897->1601|4925->1602|4965->1614|4994->1615|5028->1622|5078->1645|5106->1646|5137->1650|5165->1651|5232->1690|5261->1691|5293->1696|5465->1841|5493->1842|5685->2006|5714->2007|5743->2008|5818->2055|5847->2056|5879->2061|6089->2242|6119->2243|6157->2253|6459->2526|6489->2527|6523->2533|6616->2598|6645->2599|7224->3149|7254->3150|7288->3156|7381->3221|7410->3222|7444->3228|7514->3270|7543->3271|7576->3276|7612->3283|7642->3284|7675->3289|7787->3373|7816->3374|7849->3379|7878->3380|7993->3466|8023->3467|8056->3472|8116->3503|8146->3504|8176->3505|8300->3600|8330->3601|8364->3607|8443->3657|8473->3658|8508->3665|8725->3854|8754->3855|8788->3861|8995->4039|9025->4040|9059->4046|9211->4170|9240->4171|9296->4198|9326->4199|9360->4205|9421->4238|9450->4239|9479->4240|9513->4245|9543->4246|9577->4252|9639->4285|9669->4286|9699->4287|9733->4293|9762->4294|9794->4298|9823->4299|9856->4304|9915->4335|9944->4336|10204->4568|10233->4569|15549->9854
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|34->6|34->6|36->8|36->8|36->8|38->10|38->10|38->10|39->11|39->11|39->11|40->12|43->15|43->15|44->16|45->17|45->17|45->17|45->17|45->17|46->18|46->18|46->18|46->18|46->18|47->19|47->19|47->19|47->19|47->19|48->20|48->20|48->20|48->20|48->20|49->21|49->21|49->21|49->21|49->21|50->22|50->22|50->22|50->22|50->22|51->23|51->23|51->23|51->23|51->23|52->24|53->25|53->25|54->26|54->26|55->27|55->27|56->28|57->29|57->29|59->31|59->31|61->33|61->33|62->34|63->35|63->35|64->36|64->36|65->37|71->43|71->43|73->45|73->45|75->47|85->57|85->57|86->58|86->58|87->59|96->68|96->68|97->69|97->69|98->70|99->71|99->71|100->72|100->72|101->73|102->74|102->74|103->75|103->75|104->76|104->76|105->77|111->83|111->83|120->92|120->92|120->92|122->94|122->94|124->96|130->102|130->102|132->104|143->115|143->115|144->116|146->118|146->118|160->132|160->132|161->133|163->135|163->135|165->137|166->138|166->138|168->140|168->140|168->140|169->141|173->145|173->145|174->146|174->146|178->150|178->150|180->152|181->153|181->153|181->153|187->159|187->159|189->161|191->163|191->163|193->165|199->171|199->171|201->173|205->177|205->177|206->178|210->182|210->182|212->184|212->184|213->185|214->186|214->186|214->186|214->186|214->186|215->187|216->188|216->188|216->188|217->189|217->189|218->190|218->190|220->192|221->193|221->193|230->202|230->202|371->343
                  -- GENERATED --
              */
          