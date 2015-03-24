
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
		

		var data = [];

		$.plot("#placeholder", data, options);

		// Fetch one series, adding to what we already have

		var alreadyFetched = """),format.raw/*92.24*/("""{"""),format.raw/*92.25*/("""}"""),format.raw/*92.26*/(""";

		$("button.fetchSeries").click(function () """),format.raw/*94.45*/("""{"""),format.raw/*94.46*/("""

			"""),format.raw/*96.4*/("""var button = $(this);

			// Find the URL in the link right next to us, then fetch the data

			var dataurl = button.siblings("a").attr("href");

			function onDataReceived(series) """),format.raw/*102.36*/("""{"""),format.raw/*102.37*/("""
				
				"""),format.raw/*104.5*/("""var dataReal = []
				console.log("stampo tutti i sotto array");
				$.each( series.data, function( key, value )"""),format.raw/*106.48*/("""{"""),format.raw/*106.49*/("""
					"""),format.raw/*107.6*/("""console.log(value);
					dataReal.push([value[0],value[1]]);
				"""),format.raw/*109.5*/("""}"""),format.raw/*109.6*/(""")
				
				series.data = dataReal;
				
				console.log(series);
				
				console.log("stampo la fine");
				console.log(dataReal);
				
				// Extract the first coordinate pair; jQuery has parsed it, so
				// the data is now just an ordinary JavaScript object

				var firstcoordinate = "(" + series.data[0][0] + ", " + series.data[0][1] + ")";
				console.log(firstcoordinate);
				button.siblings("span").text("Fetched " + series.label + ", first point: " + firstcoordinate);

				// Push the new data onto our existing data array

				if (!alreadyFetched[series.label]) """),format.raw/*127.40*/("""{"""),format.raw/*127.41*/("""
					"""),format.raw/*128.6*/("""alreadyFetched[series.label] = true;
					data.push(series);
				"""),format.raw/*130.5*/("""}"""),format.raw/*130.6*/("""

				"""),format.raw/*132.5*/("""$.plot("#placeholder", data, options);
			"""),format.raw/*133.4*/("""}"""),format.raw/*133.5*/("""

			"""),format.raw/*135.4*/("""$.ajax("""),format.raw/*135.11*/("""{"""),format.raw/*135.12*/("""
				"""),format.raw/*136.5*/("""url: dataurl,
				type: "GET",
				dataType: "json",
				success: onDataReceived
			"""),format.raw/*140.4*/("""}"""),format.raw/*140.5*/(""");
		"""),format.raw/*141.3*/("""}"""),format.raw/*141.4*/(""");

		// Initiate a recurring data update

		$("button.dataUpdate").click(function () """),format.raw/*145.44*/("""{"""),format.raw/*145.45*/("""

			"""),format.raw/*147.4*/("""data = [];
			alreadyFetched = """),format.raw/*148.21*/("""{"""),format.raw/*148.22*/("""}"""),format.raw/*148.23*/(""";

			//$.plot("#placeholder", data, options);

			var iteration = 0;

			function fetchData() """),format.raw/*154.25*/("""{"""),format.raw/*154.26*/("""

				"""),format.raw/*156.5*/("""++iteration;

				function onDataReceived(series) """),format.raw/*158.37*/("""{"""),format.raw/*158.38*/("""

					"""),format.raw/*160.6*/("""// Load all the data in one pass; if we only got partial
					// data we could merge it with what we already have.

					data = [ series ];

					$.plot("#placeholder", data, options);
				"""),format.raw/*166.5*/("""}"""),format.raw/*166.6*/("""

				"""),format.raw/*168.5*/("""// Normally we call the same URL - a script connected to a
				// database - but in this case we only have static example
				// files, so we need to modify the URL.

				$.ajax("""),format.raw/*172.12*/("""{"""),format.raw/*172.13*/("""
					"""),format.raw/*173.6*/("""url: "data-eu-gdp-growth-" + iteration + ".json",
					type: "GET",
					dataType: "json",
					success: onDataReceived
				"""),format.raw/*177.5*/("""}"""),format.raw/*177.6*/(""");

				if (iteration < 5) """),format.raw/*179.24*/("""{"""),format.raw/*179.25*/("""
					"""),format.raw/*180.6*/("""setTimeout(fetchData, 1000);
				"""),format.raw/*181.5*/("""}"""),format.raw/*181.6*/(""" """),format.raw/*181.7*/("""else """),format.raw/*181.12*/("""{"""),format.raw/*181.13*/("""
					"""),format.raw/*182.6*/("""data = [];
					alreadyFetched = """),format.raw/*183.23*/("""{"""),format.raw/*183.24*/("""}"""),format.raw/*183.25*/(""";
				"""),format.raw/*184.5*/("""}"""),format.raw/*184.6*/("""
			"""),format.raw/*185.4*/("""}"""),format.raw/*185.5*/("""

			"""),format.raw/*187.4*/("""setTimeout(fetchData, 1000);
		"""),format.raw/*188.3*/("""}"""),format.raw/*188.4*/(""");

		// Load the first series by default, so we don't have an empty plot

		$("button.fetchSeries:first").click();

		// Add the Flot version string to the footer

		$("#footer").prepend("Flot " + $.plot.version + " &ndash; ");
	"""),format.raw/*197.2*/("""}"""),format.raw/*197.3*/(""");</script>
	<div class="row">
    	
    		<div class="col l6 m12 s12  ">
	    		
	    		<div class="col s12">
	    				<p>
			<button class="fetchSeries">First dataset</button>
			[ <a href="http://sviluppo1.shellrent.com/data.php">see data</a> ]
			<span></span>
		</p>

		<p>
			<button class="fetchSeries">Second dataset</button>
			[ <a href="http://sviluppo1.shellrent.com/data.php">see data</a> ]
			<span></span>
		</p>

		<p>
			<button class="fetchSeries">Third dataset</button>
			[ <a href="http://sviluppo1.shellrent.com/data.php">see data</a> ]
			<span></span>
		</p>
	    			<h3><span class="fa fa-file"></span>Misuration</h3>
	    			<div id="placeholder"style="border:1px solid black; min-height:200px;">
	    <div class="preloader-wrapper big active">
      <div class="spinner-layer spinner-blue">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div></div>
	    			</div>
	    		</div>
	    		<div class="col s12">
	    			<h3><span class="fa fa-warning"></span>Failure</h3>
	    			<div style="border:1px solid black; min-height:200px;">
	    				"""),_display_(/*237.11*/loader()),format.raw/*237.19*/("""
	    			"""),format.raw/*238.9*/("""</div>
	    		</div>
    		
    		</div>
    		<div class="col l6 m12 s12">
    			<input type="date" class="datepicker">
    		</div>	
         
    </div>   

""")))}),format.raw/*248.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 24 09:14:26 CET 2015
                  SOURCE: /home/stefano/Repository/PlayFrameworkTemperature/app/views/index.scala.html
                  HASH: 48225ea95ea03b40c7dde731bf6f8a7e2ab909eb
                  MATRIX: 723->1|828->18|856->21|876->33|915->35|943->37|1017->84|1045->85|1075->89|1116->103|1144->104|1179->112|1215->120|1244->121|1279->129|1314->136|1343->137|1389->155|1517->255|1546->256|1593->275|1651->305|1680->306|1709->307|1767->337|1796->338|1845->359|1874->360|1903->361|1944->374|1973->375|2022->396|2051->397|2080->398|2121->411|2150->412|2199->433|2228->434|2257->435|2298->448|2327->449|2376->470|2405->471|2434->472|2475->485|2504->486|2553->507|2582->508|2611->509|2652->522|2681->523|2733->547|2762->548|2791->549|2832->562|2861->563|2908->582|2955->601|2984->602|3028->618|3057->619|3101->635|3130->636|3175->653|3228->678|3257->679|3319->714|3347->715|3398->738|3427->739|3468->752|3522->778|3551->779|3592->792|3621->793|3663->807|3879->995|3908->996|3952->1012|3981->1013|4024->1029|4290->1268|4318->1269|4361->1284|4390->1285|4422->1290|4709->1550|4737->1551|4784->1570|4813->1571|4847->1578|4897->1601|4925->1602|4965->1614|4994->1615|5028->1622|5078->1645|5106->1646|5137->1650|5165->1651|5232->1690|5261->1691|5293->1696|5465->1841|5493->1842|5683->2004|5712->2005|5741->2006|5816->2053|5845->2054|5877->2059|6087->2240|6117->2241|6155->2251|6296->2363|6326->2364|6360->2370|6453->2435|6482->2436|7086->3011|7116->3012|7150->3018|7243->3083|7272->3084|7306->3090|7376->3132|7405->3133|7438->3138|7474->3145|7504->3146|7537->3151|7649->3235|7678->3236|7711->3241|7740->3242|7855->3328|7885->3329|7918->3334|7978->3365|8008->3366|8038->3367|8162->3462|8192->3463|8226->3469|8305->3519|8335->3520|8370->3527|8587->3716|8616->3717|8650->3723|8857->3901|8887->3902|8921->3908|9073->4032|9102->4033|9158->4060|9188->4061|9222->4067|9283->4100|9312->4101|9341->4102|9375->4107|9405->4108|9439->4114|9501->4147|9531->4148|9561->4149|9595->4155|9624->4156|9656->4160|9685->4161|9718->4166|9777->4197|9806->4198|10064->4428|10093->4429|11405->5713|11435->5721|11472->5730|11665->5892
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|34->6|34->6|36->8|36->8|36->8|38->10|38->10|38->10|39->11|39->11|39->11|40->12|43->15|43->15|44->16|45->17|45->17|45->17|45->17|45->17|46->18|46->18|46->18|46->18|46->18|47->19|47->19|47->19|47->19|47->19|48->20|48->20|48->20|48->20|48->20|49->21|49->21|49->21|49->21|49->21|50->22|50->22|50->22|50->22|50->22|51->23|51->23|51->23|51->23|51->23|52->24|53->25|53->25|54->26|54->26|55->27|55->27|56->28|57->29|57->29|59->31|59->31|61->33|61->33|62->34|63->35|63->35|64->36|64->36|65->37|71->43|71->43|73->45|73->45|75->47|85->57|85->57|86->58|86->58|87->59|96->68|96->68|97->69|97->69|98->70|99->71|99->71|100->72|100->72|101->73|102->74|102->74|103->75|103->75|104->76|104->76|105->77|111->83|111->83|120->92|120->92|120->92|122->94|122->94|124->96|130->102|130->102|132->104|134->106|134->106|135->107|137->109|137->109|155->127|155->127|156->128|158->130|158->130|160->132|161->133|161->133|163->135|163->135|163->135|164->136|168->140|168->140|169->141|169->141|173->145|173->145|175->147|176->148|176->148|176->148|182->154|182->154|184->156|186->158|186->158|188->160|194->166|194->166|196->168|200->172|200->172|201->173|205->177|205->177|207->179|207->179|208->180|209->181|209->181|209->181|209->181|209->181|210->182|211->183|211->183|211->183|212->184|212->184|213->185|213->185|215->187|216->188|216->188|225->197|225->197|265->237|265->237|266->238|276->248
                  -- GENERATED --
              */
          