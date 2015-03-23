
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

				"""),format.raw/*104.5*/("""// Extract the first coordinate pair; jQuery has parsed it, so
				// the data is now just an ordinary JavaScript object

				var firstcoordinate = "(" + series.data[0][0] + ", " + series.data[0][1] + ")";
				button.siblings("span").text("Fetched " + series.label + ", first point: " + firstcoordinate);

				// Push the new data onto our existing data array

				if (!alreadyFetched[series.label]) """),format.raw/*112.40*/("""{"""),format.raw/*112.41*/("""
					"""),format.raw/*113.6*/("""alreadyFetched[series.label] = true;
					data.push(series);
				"""),format.raw/*115.5*/("""}"""),format.raw/*115.6*/("""

				"""),format.raw/*117.5*/("""$.plot("#placeholder", data, options);
			"""),format.raw/*118.4*/("""}"""),format.raw/*118.5*/("""

			"""),format.raw/*120.4*/("""$.ajax("""),format.raw/*120.11*/("""{"""),format.raw/*120.12*/("""
				"""),format.raw/*121.5*/("""url: dataurl,
				type: "GET",
				dataType: "json",
				success: onDataReceived
			"""),format.raw/*125.4*/("""}"""),format.raw/*125.5*/(""");
		"""),format.raw/*126.3*/("""}"""),format.raw/*126.4*/(""");

		// Initiate a recurring data update

		$("button.dataUpdate").click(function () """),format.raw/*130.44*/("""{"""),format.raw/*130.45*/("""

			"""),format.raw/*132.4*/("""data = [];
			alreadyFetched = """),format.raw/*133.21*/("""{"""),format.raw/*133.22*/("""}"""),format.raw/*133.23*/(""";

			//$.plot("#placeholder", data, options);

			var iteration = 0;

			function fetchData() """),format.raw/*139.25*/("""{"""),format.raw/*139.26*/("""

				"""),format.raw/*141.5*/("""++iteration;

				function onDataReceived(series) """),format.raw/*143.37*/("""{"""),format.raw/*143.38*/("""

					"""),format.raw/*145.6*/("""// Load all the data in one pass; if we only got partial
					// data we could merge it with what we already have.

					data = [ series ];

					$.plot("#placeholder", data, options);
				"""),format.raw/*151.5*/("""}"""),format.raw/*151.6*/("""

				"""),format.raw/*153.5*/("""// Normally we call the same URL - a script connected to a
				// database - but in this case we only have static example
				// files, so we need to modify the URL.

				$.ajax("""),format.raw/*157.12*/("""{"""),format.raw/*157.13*/("""
					"""),format.raw/*158.6*/("""url: "data-eu-gdp-growth-" + iteration + ".json",
					type: "GET",
					dataType: "json",
					success: onDataReceived
				"""),format.raw/*162.5*/("""}"""),format.raw/*162.6*/(""");

				if (iteration < 5) """),format.raw/*164.24*/("""{"""),format.raw/*164.25*/("""
					"""),format.raw/*165.6*/("""setTimeout(fetchData, 1000);
				"""),format.raw/*166.5*/("""}"""),format.raw/*166.6*/(""" """),format.raw/*166.7*/("""else """),format.raw/*166.12*/("""{"""),format.raw/*166.13*/("""
					"""),format.raw/*167.6*/("""data = [];
					alreadyFetched = """),format.raw/*168.23*/("""{"""),format.raw/*168.24*/("""}"""),format.raw/*168.25*/(""";
				"""),format.raw/*169.5*/("""}"""),format.raw/*169.6*/("""
			"""),format.raw/*170.4*/("""}"""),format.raw/*170.5*/("""

			"""),format.raw/*172.4*/("""setTimeout(fetchData, 1000);
		"""),format.raw/*173.3*/("""}"""),format.raw/*173.4*/(""");

		// Load the first series by default, so we don't have an empty plot

		$("button.fetchSeries:first").click();

		// Add the Flot version string to the footer

		$("#footer").prepend("Flot " + $.plot.version + " &ndash; ");
	"""),format.raw/*182.2*/("""}"""),format.raw/*182.3*/(""");</script>
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
	    				"""),_display_(/*222.11*/loader()),format.raw/*222.19*/("""
	    			"""),format.raw/*223.9*/("""</div>
	    		</div>
    		
    		</div>
    		<div class="col l6 m12 s12">
    			<input type="date" class="datepicker">
    		</div>	
         
    </div>   

""")))}),format.raw/*233.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 23 11:53:39 CET 2015
                  SOURCE: /home/stefano/Repository/PlayFrameworkTemperature/app/views/index.scala.html
                  HASH: b2bd8d1195401f6a887836143e263a78ef243ab8
                  MATRIX: 723->1|828->18|856->21|876->33|915->35|943->37|1017->84|1045->85|1075->89|1116->103|1144->104|1179->112|1215->120|1244->121|1279->129|1314->136|1343->137|1389->155|1517->255|1546->256|1593->275|1651->305|1680->306|1709->307|1767->337|1796->338|1845->359|1874->360|1903->361|1944->374|1973->375|2022->396|2051->397|2080->398|2121->411|2150->412|2199->433|2228->434|2257->435|2298->448|2327->449|2376->470|2405->471|2434->472|2475->485|2504->486|2553->507|2582->508|2611->509|2652->522|2681->523|2733->547|2762->548|2791->549|2832->562|2861->563|2908->582|2955->601|2984->602|3028->618|3057->619|3101->635|3130->636|3175->653|3228->678|3257->679|3319->714|3347->715|3398->738|3427->739|3468->752|3522->778|3551->779|3592->792|3621->793|3663->807|3879->995|3908->996|3952->1012|3981->1013|4024->1029|4290->1268|4318->1269|4361->1284|4390->1285|4422->1290|4709->1550|4737->1551|4784->1570|4813->1571|4847->1578|4897->1601|4925->1602|4965->1614|4994->1615|5028->1622|5078->1645|5106->1646|5137->1650|5165->1651|5232->1690|5261->1691|5293->1696|5465->1841|5493->1842|5683->2004|5712->2005|5741->2006|5816->2053|5845->2054|5877->2059|6087->2240|6117->2241|6151->2247|6580->2647|6610->2648|6644->2654|6737->2719|6766->2720|6800->2726|6870->2768|6899->2769|6932->2774|6968->2781|6998->2782|7031->2787|7143->2871|7172->2872|7205->2877|7234->2878|7349->2964|7379->2965|7412->2970|7472->3001|7502->3002|7532->3003|7656->3098|7686->3099|7720->3105|7799->3155|7829->3156|7864->3163|8081->3352|8110->3353|8144->3359|8351->3537|8381->3538|8415->3544|8567->3668|8596->3669|8652->3696|8682->3697|8716->3703|8777->3736|8806->3737|8835->3738|8869->3743|8899->3744|8933->3750|8995->3783|9025->3784|9055->3785|9089->3791|9118->3792|9150->3796|9179->3797|9212->3802|9271->3833|9300->3834|9558->4064|9587->4065|10899->5349|10929->5357|10966->5366|11159->5528
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|34->6|34->6|36->8|36->8|36->8|38->10|38->10|38->10|39->11|39->11|39->11|40->12|43->15|43->15|44->16|45->17|45->17|45->17|45->17|45->17|46->18|46->18|46->18|46->18|46->18|47->19|47->19|47->19|47->19|47->19|48->20|48->20|48->20|48->20|48->20|49->21|49->21|49->21|49->21|49->21|50->22|50->22|50->22|50->22|50->22|51->23|51->23|51->23|51->23|51->23|52->24|53->25|53->25|54->26|54->26|55->27|55->27|56->28|57->29|57->29|59->31|59->31|61->33|61->33|62->34|63->35|63->35|64->36|64->36|65->37|71->43|71->43|73->45|73->45|75->47|85->57|85->57|86->58|86->58|87->59|96->68|96->68|97->69|97->69|98->70|99->71|99->71|100->72|100->72|101->73|102->74|102->74|103->75|103->75|104->76|104->76|105->77|111->83|111->83|120->92|120->92|120->92|122->94|122->94|124->96|130->102|130->102|132->104|140->112|140->112|141->113|143->115|143->115|145->117|146->118|146->118|148->120|148->120|148->120|149->121|153->125|153->125|154->126|154->126|158->130|158->130|160->132|161->133|161->133|161->133|167->139|167->139|169->141|171->143|171->143|173->145|179->151|179->151|181->153|185->157|185->157|186->158|190->162|190->162|192->164|192->164|193->165|194->166|194->166|194->166|194->166|194->166|195->167|196->168|196->168|196->168|197->169|197->169|198->170|198->170|200->172|201->173|201->173|210->182|210->182|250->222|250->222|251->223|261->233
                  -- GENERATED --
              */
          