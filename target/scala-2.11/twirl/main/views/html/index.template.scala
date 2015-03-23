
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
			"""),format.raw/*9.4*/("""lines: """),format.raw/*9.11*/("""{"""),format.raw/*9.12*/("""
				"""),format.raw/*10.5*/("""show: true
			"""),format.raw/*11.4*/("""}"""),format.raw/*11.5*/(""",
			points: """),format.raw/*12.12*/("""{"""),format.raw/*12.13*/("""
				"""),format.raw/*13.5*/("""show: true
			"""),format.raw/*14.4*/("""}"""),format.raw/*14.5*/(""",
			xaxis: """),format.raw/*15.11*/("""{"""),format.raw/*15.12*/("""
						"""),format.raw/*16.7*/("""color: '#eee',
			          	axisLabel: "Ore ",
			          	axisLabelUseCanvas: true,
			          	axisLabelFontSizePixels: 12,
			          	axisLabelFontFamily: 'Verdana, Arial',
			          	axisLabelPadding: 10,
			          	mode: "time",
			          	timeformat: "%H"
						//minTickSize: [1, "hour"]
			"""),format.raw/*25.4*/("""}"""),format.raw/*25.5*/("""
		"""),format.raw/*26.3*/("""}"""),format.raw/*26.4*/(""";

		var data = [];

		$.plot("#placeholder", data, options);

		// Fetch one series, adding to what we already have

		var alreadyFetched = """),format.raw/*34.24*/("""{"""),format.raw/*34.25*/("""}"""),format.raw/*34.26*/(""";

		$("button.fetchSeries").click(function () """),format.raw/*36.45*/("""{"""),format.raw/*36.46*/("""

			"""),format.raw/*38.4*/("""var button = $(this);

			// Find the URL in the link right next to us, then fetch the data

			var dataurl = button.siblings("a").attr("href");

			function onDataReceived(series) """),format.raw/*44.36*/("""{"""),format.raw/*44.37*/("""

				"""),format.raw/*46.5*/("""// Extract the first coordinate pair; jQuery has parsed it, so
				// the data is now just an ordinary JavaScript object

				var firstcoordinate = "(" + series.data[0][0] + ", " + series.data[0][1] + ")";
				button.siblings("span").text("Fetched " + series.label + ", first point: " + firstcoordinate);

				// Push the new data onto our existing data array

				if (!alreadyFetched[series.label]) """),format.raw/*54.40*/("""{"""),format.raw/*54.41*/("""
					"""),format.raw/*55.6*/("""alreadyFetched[series.label] = true;
					data.push(series);
				"""),format.raw/*57.5*/("""}"""),format.raw/*57.6*/("""

				"""),format.raw/*59.5*/("""$.plot("#placeholder", data, options);
			"""),format.raw/*60.4*/("""}"""),format.raw/*60.5*/("""

			"""),format.raw/*62.4*/("""$.ajax("""),format.raw/*62.11*/("""{"""),format.raw/*62.12*/("""
				"""),format.raw/*63.5*/("""url: dataurl,
				type: "GET",
				dataType: "json",
				success: onDataReceived
			"""),format.raw/*67.4*/("""}"""),format.raw/*67.5*/(""");
		"""),format.raw/*68.3*/("""}"""),format.raw/*68.4*/(""");

		// Initiate a recurring data update

		$("button.dataUpdate").click(function () """),format.raw/*72.44*/("""{"""),format.raw/*72.45*/("""

			"""),format.raw/*74.4*/("""data = [];
			alreadyFetched = """),format.raw/*75.21*/("""{"""),format.raw/*75.22*/("""}"""),format.raw/*75.23*/(""";

			//$.plot("#placeholder", data, options);

			var iteration = 0;

			function fetchData() """),format.raw/*81.25*/("""{"""),format.raw/*81.26*/("""

				"""),format.raw/*83.5*/("""++iteration;

				function onDataReceived(series) """),format.raw/*85.37*/("""{"""),format.raw/*85.38*/("""

					"""),format.raw/*87.6*/("""// Load all the data in one pass; if we only got partial
					// data we could merge it with what we already have.

					data = [ series ];

					$.plot("#placeholder", data, options);
				"""),format.raw/*93.5*/("""}"""),format.raw/*93.6*/("""

				"""),format.raw/*95.5*/("""// Normally we call the same URL - a script connected to a
				// database - but in this case we only have static example
				// files, so we need to modify the URL.

				$.ajax("""),format.raw/*99.12*/("""{"""),format.raw/*99.13*/("""
					"""),format.raw/*100.6*/("""url: "data-eu-gdp-growth-" + iteration + ".json",
					type: "GET",
					dataType: "json",
					success: onDataReceived
				"""),format.raw/*104.5*/("""}"""),format.raw/*104.6*/(""");

				if (iteration < 5) """),format.raw/*106.24*/("""{"""),format.raw/*106.25*/("""
					"""),format.raw/*107.6*/("""setTimeout(fetchData, 1000);
				"""),format.raw/*108.5*/("""}"""),format.raw/*108.6*/(""" """),format.raw/*108.7*/("""else """),format.raw/*108.12*/("""{"""),format.raw/*108.13*/("""
					"""),format.raw/*109.6*/("""data = [];
					alreadyFetched = """),format.raw/*110.23*/("""{"""),format.raw/*110.24*/("""}"""),format.raw/*110.25*/(""";
				"""),format.raw/*111.5*/("""}"""),format.raw/*111.6*/("""
			"""),format.raw/*112.4*/("""}"""),format.raw/*112.5*/("""

			"""),format.raw/*114.4*/("""setTimeout(fetchData, 1000);
		"""),format.raw/*115.3*/("""}"""),format.raw/*115.4*/(""");

		// Load the first series by default, so we don't have an empty plot

		$("button.fetchSeries:first").click();

		// Add the Flot version string to the footer

		$("#footer").prepend("Flot " + $.plot.version + " &ndash; ");
	"""),format.raw/*124.2*/("""}"""),format.raw/*124.3*/(""");</script>
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
	    				"""),_display_(/*164.11*/loader()),format.raw/*164.19*/("""
	    			"""),format.raw/*165.9*/("""</div>
	    		</div>
    		
    		</div>
    		<div class="col l6 m12 s12">
    			<input type="date" class="datepicker">
    		</div>	
         
    </div>   

""")))}),format.raw/*175.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 23 11:13:05 CET 2015
                  SOURCE: /home/stefano/Repository/PlayFrameworkTemperature/app/views/index.scala.html
                  HASH: 52f392f12f1c8d80d34616bd37f0d4336d6ef6e0
                  MATRIX: 723->1|828->18|856->21|876->33|915->35|943->37|1017->84|1045->85|1075->89|1116->103|1144->104|1174->108|1208->115|1236->116|1268->121|1309->135|1337->136|1378->149|1407->150|1439->155|1480->169|1508->170|1548->182|1577->183|1611->190|1953->505|1981->506|2011->509|2039->510|2208->651|2237->652|2266->653|2341->700|2370->701|2402->706|2611->887|2640->888|2673->894|3101->1294|3130->1295|3163->1301|3255->1366|3283->1367|3316->1373|3385->1415|3413->1416|3445->1421|3480->1428|3509->1429|3541->1434|3652->1518|3680->1519|3712->1524|3740->1525|3854->1611|3883->1612|3915->1617|3974->1648|4003->1649|4032->1650|4155->1745|4184->1746|4217->1752|4295->1802|4324->1803|4358->1810|4574->1999|4602->2000|4635->2006|4841->2184|4870->2185|4904->2191|5056->2315|5085->2316|5141->2343|5171->2344|5205->2350|5266->2383|5295->2384|5324->2385|5358->2390|5388->2391|5422->2397|5484->2430|5514->2431|5544->2432|5578->2438|5607->2439|5639->2443|5668->2444|5701->2449|5760->2480|5789->2481|6047->2711|6076->2712|7388->3996|7418->4004|7455->4013|7648->4175
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|39->11|39->11|40->12|40->12|41->13|42->14|42->14|43->15|43->15|44->16|53->25|53->25|54->26|54->26|62->34|62->34|62->34|64->36|64->36|66->38|72->44|72->44|74->46|82->54|82->54|83->55|85->57|85->57|87->59|88->60|88->60|90->62|90->62|90->62|91->63|95->67|95->67|96->68|96->68|100->72|100->72|102->74|103->75|103->75|103->75|109->81|109->81|111->83|113->85|113->85|115->87|121->93|121->93|123->95|127->99|127->99|128->100|132->104|132->104|134->106|134->106|135->107|136->108|136->108|136->108|136->108|136->108|137->109|138->110|138->110|138->110|139->111|139->111|140->112|140->112|142->114|143->115|143->115|152->124|152->124|192->164|192->164|193->165|203->175
                  -- GENERATED --
              */
          