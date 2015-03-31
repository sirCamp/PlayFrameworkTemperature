
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""


"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
    <head>
      
      <title>"""),_display_(/*8.15*/title),format.raw/*8.20*/("""</title>
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href=""""),_display_(/*10.53*/routes/*10.59*/.Assets.at("stylesheets/materialize.min.css")),format.raw/*10.104*/(""""  media="screen,projection"/>
	  <link type="text/css" rel="stylesheet" href=""""),_display_(/*11.50*/routes/*11.56*/.Assets.at("stylesheets/main.css")),format.raw/*11.90*/(""""/>	
	  <link type="text/css" rel="stylesheet" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.at("stylesheets/font-awesome.min.css")),format.raw/*12.102*/(""""/>	
      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    </head>

    <body>
      <!--Import jQuery before materialize.js-->
      <script type="text/javascript" src=""""),_display_(/*19.44*/routes/*19.50*/.Assets.at("javascripts/jquery-2.1.3.min.js")),format.raw/*19.95*/(""""></script>
      <script type="text/javascript" src=""""),_display_(/*20.44*/routes/*20.50*/.Assets.at("javascripts/materialize.min.js")),format.raw/*20.94*/(""""></script>
      <script type="text/javascript" src=""""),_display_(/*21.44*/routes/*21.50*/.Assets.at("javascripts/main.js")),format.raw/*21.83*/(""""></script>
      
      <script type="text/javascript" src=""""),_display_(/*23.44*/routes/*23.50*/.Assets.at("javascripts/excanvas.min.js")),format.raw/*23.91*/(""""></script>
      <script type="text/javascript" src=""""),_display_(/*24.44*/routes/*24.50*/.Assets.at("javascripts/jquery.flot.min.js")),format.raw/*24.94*/(""""></script>
      <script type="text/javascript" src=""""),_display_(/*25.44*/routes/*25.50*/.Assets.at("javascripts/jquery.flot.time.min.js")),format.raw/*25.99*/(""""></script>
       <script type="text/javascript" src=""""),_display_(/*26.45*/routes/*26.51*/.Assets.at("javascripts/jquery.flot.resize.min.js")),format.raw/*26.102*/(""""></script>
    </body>
    	"""),_display_(/*28.7*/navbar()),format.raw/*28.15*/("""
    	  		
    		"""),_display_(/*30.8*/content),format.raw/*30.15*/("""
       		
       	
       	"""),_display_(/*33.10*/footer()),format.raw/*33.18*/("""
    """),format.raw/*34.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 31 11:00:04 CEST 2015
                  SOURCE: /home/stefano/Repository/PlayFrameworkTemperature/app/views/main.scala.html
                  HASH: e26dd7832d5de009bd7ffde702ae1a581f08e662
                  MATRIX: 727->1|845->31|874->34|955->89|980->94|1104->191|1119->197|1186->242|1293->322|1308->328|1363->362|1444->416|1459->422|1527->468|1852->766|1867->772|1933->817|2015->872|2030->878|2095->922|2177->977|2192->983|2246->1016|2335->1078|2350->1084|2412->1125|2494->1180|2509->1186|2574->1230|2656->1285|2671->1291|2741->1340|2824->1396|2839->1402|2912->1453|2968->1483|2997->1491|3041->1509|3069->1516|3125->1545|3154->1553|3186->1558
                  LINES: 26->1|29->1|32->4|36->8|36->8|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|56->28|56->28|58->30|58->30|61->33|61->33|62->34
                  -- GENERATED --
              */
          