
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
				"""),format.raw/*16.5*/("""tickDecimals: 0,
				tickSize: 1
			"""),format.raw/*18.4*/("""}"""),format.raw/*18.5*/("""
		"""),format.raw/*19.3*/("""}"""),format.raw/*19.4*/(""";

		var data = [];

		$.plot("#placeholder", data, options);

		// Fetch one series, adding to what we already have

		var alreadyFetched = """),format.raw/*27.24*/("""{"""),format.raw/*27.25*/("""}"""),format.raw/*27.26*/(""";

		$("button.fetchSeries").click(function () """),format.raw/*29.45*/("""{"""),format.raw/*29.46*/("""

			"""),format.raw/*31.4*/("""var button = $(this);

			// Find the URL in the link right next to us, then fetch the data

			var dataurl = button.siblings("a").attr("href");

			function onDataReceived(series) """),format.raw/*37.36*/("""{"""),format.raw/*37.37*/("""

				"""),format.raw/*39.5*/("""// Extract the first coordinate pair; jQuery has parsed it, so
				// the data is now just an ordinary JavaScript object

				var firstcoordinate = "(" + series.data[0][0] + ", " + series.data[0][1] + ")";
				button.siblings("span").text("Fetched " + series.label + ", first point: " + firstcoordinate);

				// Push the new data onto our existing data array

				if (!alreadyFetched[series.label]) """),format.raw/*47.40*/("""{"""),format.raw/*47.41*/("""
					"""),format.raw/*48.6*/("""alreadyFetched[series.label] = true;
					data.push(series);
				"""),format.raw/*50.5*/("""}"""),format.raw/*50.6*/("""

				"""),format.raw/*52.5*/("""$.plot("#placeholder", data, options);
			"""),format.raw/*53.4*/("""}"""),format.raw/*53.5*/("""

			"""),format.raw/*55.4*/("""$.ajax("""),format.raw/*55.11*/("""{"""),format.raw/*55.12*/("""
				"""),format.raw/*56.5*/("""url: dataurl,
				type: "GET",
				dataType: "json",
				success: onDataReceived
			"""),format.raw/*60.4*/("""}"""),format.raw/*60.5*/(""");
		"""),format.raw/*61.3*/("""}"""),format.raw/*61.4*/(""");

		// Initiate a recurring data update

		$("button.dataUpdate").click(function () """),format.raw/*65.44*/("""{"""),format.raw/*65.45*/("""

			"""),format.raw/*67.4*/("""data = [];
			alreadyFetched = """),format.raw/*68.21*/("""{"""),format.raw/*68.22*/("""}"""),format.raw/*68.23*/(""";

			$.plot("#placeholder", data, options);

			var iteration = 0;

			function fetchData() """),format.raw/*74.25*/("""{"""),format.raw/*74.26*/("""

				"""),format.raw/*76.5*/("""++iteration;

				function onDataReceived(series) """),format.raw/*78.37*/("""{"""),format.raw/*78.38*/("""

					"""),format.raw/*80.6*/("""// Load all the data in one pass; if we only got partial
					// data we could merge it with what we already have.

					data = [ series ];
					$.plot("#placeholder", data, options);
				"""),format.raw/*85.5*/("""}"""),format.raw/*85.6*/("""

				"""),format.raw/*87.5*/("""// Normally we call the same URL - a script connected to a
				// database - but in this case we only have static example
				// files, so we need to modify the URL.

				$.ajax("""),format.raw/*91.12*/("""{"""),format.raw/*91.13*/("""
					"""),format.raw/*92.6*/("""url: "data-eu-gdp-growth-" + iteration + ".json",
					type: "GET",
					dataType: "json",
					success: onDataReceived
				"""),format.raw/*96.5*/("""}"""),format.raw/*96.6*/(""");

				if (iteration < 5) """),format.raw/*98.24*/("""{"""),format.raw/*98.25*/("""
					"""),format.raw/*99.6*/("""setTimeout(fetchData, 1000);
				"""),format.raw/*100.5*/("""}"""),format.raw/*100.6*/(""" """),format.raw/*100.7*/("""else """),format.raw/*100.12*/("""{"""),format.raw/*100.13*/("""
					"""),format.raw/*101.6*/("""data = [];
					alreadyFetched = """),format.raw/*102.23*/("""{"""),format.raw/*102.24*/("""}"""),format.raw/*102.25*/(""";
				"""),format.raw/*103.5*/("""}"""),format.raw/*103.6*/("""
			"""),format.raw/*104.4*/("""}"""),format.raw/*104.5*/("""

			"""),format.raw/*106.4*/("""setTimeout(fetchData, 1000);
		"""),format.raw/*107.3*/("""}"""),format.raw/*107.4*/(""");

		// Load the first series by default, so we don't have an empty plot

		$("button.fetchSeries:first").click();

		// Add the Flot version string to the footer

		$("#footer").prepend("Flot " + $.plot.version + " &ndash; ");
	"""),format.raw/*116.2*/("""}"""),format.raw/*116.3*/(""");</script>
	<div class="row">
    	
    		<div class="col l6 m12 s12  ">
	    		
	    		<div class="col s12">
	    				<p>
			<button class="fetchSeries">First dataset</button>
			[ <a href="http://www.flotcharts.org/flot/examples/ajax/data-eu-gdp-growth.json">see data</a> ]
			<span></span>
		</p>

		<p>
			<button class="fetchSeries">Second dataset</button>
			[ <a href="http://www.flotcharts.org/flot/examples/ajax/data-japan-gdp-growth.json">see data</a> ]
			<span></span>
		</p>

		<p>
			<button class="fetchSeries">Third dataset</button>
			[ <a href="http://www.flotcharts.org/flot/examples/ajax/data-usa-gdp-growth.json">see data</a> ]
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
	    				"""),_display_(/*156.11*/loader()),format.raw/*156.19*/("""
	    			"""),format.raw/*157.9*/("""</div>
	    		</div>
    		
    		</div>
    		<div class="col l6 m12 s12">
    			<input type="date" class="datepicker">
    		</div>	
         
    </div>   

""")))}),format.raw/*167.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Mar 22 22:27:24 CET 2015
                  SOURCE: /home/stefano/Repository/PlayFrameworkTemperature/app/views/index.scala.html
                  HASH: 6270444f4315199b9471b906d31a8b241c648f8e
                  MATRIX: 723->1|828->18|856->21|876->33|915->35|943->37|1017->84|1045->85|1075->89|1116->103|1144->104|1174->108|1208->115|1236->116|1268->121|1309->135|1337->136|1378->149|1407->150|1439->155|1480->169|1508->170|1548->182|1577->183|1609->188|1672->224|1700->225|1730->228|1758->229|1927->370|1956->371|1985->372|2060->419|2089->420|2121->425|2330->606|2359->607|2392->613|2820->1013|2849->1014|2882->1020|2974->1085|3002->1086|3035->1092|3104->1134|3132->1135|3164->1140|3199->1147|3228->1148|3260->1153|3371->1237|3399->1238|3431->1243|3459->1244|3573->1330|3602->1331|3634->1336|3693->1367|3722->1368|3751->1369|3872->1462|3901->1463|3934->1469|4012->1519|4041->1520|4075->1527|4290->1715|4318->1716|4351->1722|4557->1900|4586->1901|4619->1907|4770->2031|4798->2032|4853->2059|4882->2060|4915->2066|4976->2099|5005->2100|5034->2101|5068->2106|5098->2107|5132->2113|5194->2146|5224->2147|5254->2148|5288->2154|5317->2155|5349->2159|5378->2160|5411->2165|5470->2196|5499->2197|5757->2427|5786->2428|7189->3803|7219->3811|7256->3820|7449->3982
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|39->11|39->11|40->12|40->12|41->13|42->14|42->14|43->15|43->15|44->16|46->18|46->18|47->19|47->19|55->27|55->27|55->27|57->29|57->29|59->31|65->37|65->37|67->39|75->47|75->47|76->48|78->50|78->50|80->52|81->53|81->53|83->55|83->55|83->55|84->56|88->60|88->60|89->61|89->61|93->65|93->65|95->67|96->68|96->68|96->68|102->74|102->74|104->76|106->78|106->78|108->80|113->85|113->85|115->87|119->91|119->91|120->92|124->96|124->96|126->98|126->98|127->99|128->100|128->100|128->100|128->100|128->100|129->101|130->102|130->102|130->102|131->103|131->103|132->104|132->104|134->106|135->107|135->107|144->116|144->116|184->156|184->156|185->157|195->167
                  -- GENERATED --
              */
          