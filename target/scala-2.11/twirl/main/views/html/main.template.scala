
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
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href=""""),_display_(/*8.53*/routes/*8.59*/.Assets.at("stylesheets/materialize.min.css")),format.raw/*8.104*/(""""  media="screen,projection"/>
	  <link type="text/css" rel="stylesheet" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.at("stylesheets/main.css")),format.raw/*9.90*/(""""/>	
	  <link type="text/css" rel="stylesheet" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.at("stylesheets/font-awesome.min.css")),format.raw/*10.102*/(""""/>	
      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    </head>

    <body>
      <!--Import jQuery before materialize.js-->
      <script type="text/javascript" src=""""),_display_(/*17.44*/routes/*17.50*/.Assets.at("javascripts/jquery-2.1.3.min.js")),format.raw/*17.95*/(""""></script>
      <script type="text/javascript" src=""""),_display_(/*18.44*/routes/*18.50*/.Assets.at("javascripts/materialize.min.js")),format.raw/*18.94*/(""""></script>
      <script type="text/javascript" src=""""),_display_(/*19.44*/routes/*19.50*/.Assets.at("javascripts/main.js")),format.raw/*19.83*/(""""></script>
      
      <script type="text/javascript" src=""""),_display_(/*21.44*/routes/*21.50*/.Assets.at("javascripts/excanvas.min.js")),format.raw/*21.91*/(""""></script>
      <script type="text/javascript" src=""""),_display_(/*22.44*/routes/*22.50*/.Assets.at("javascripts/jquery.flot.min.js")),format.raw/*22.94*/(""""></script>
      <script type="text/javascript" src=""""),_display_(/*23.44*/routes/*23.50*/.Assets.at("javascripts/jquery.flot.time.min.js")),format.raw/*23.99*/(""""></script>
       <script type="text/javascript" src=""""),_display_(/*24.45*/routes/*24.51*/.Assets.at("javascripts/jquery.flot.resize.min.js")),format.raw/*24.102*/(""""></script>
    </body>
    	"""),_display_(/*26.7*/navbar()),format.raw/*26.15*/("""
    	  		
    		"""),_display_(/*28.8*/content),format.raw/*28.15*/("""
       		
       	
       	"""),_display_(/*31.10*/footer()),format.raw/*31.18*/("""
    """),format.raw/*32.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 25 17:30:07 CET 2015
                  SOURCE: /home/stefano/Repository/PlayFrameworkTemperature/app/views/main.scala.html
                  HASH: 70ce725a7d2fa666666cce8d4447a1f7d22a16fb
                  MATRIX: 727->1|845->31|874->34|1022->156|1036->162|1102->207|1208->287|1222->293|1276->327|1357->381|1372->387|1440->433|1765->731|1780->737|1846->782|1928->837|1943->843|2008->887|2090->942|2105->948|2159->981|2248->1043|2263->1049|2325->1090|2407->1145|2422->1151|2487->1195|2569->1250|2584->1256|2654->1305|2737->1361|2752->1367|2825->1418|2881->1448|2910->1456|2954->1474|2982->1481|3038->1510|3067->1518|3099->1523
                  LINES: 26->1|29->1|32->4|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|54->26|54->26|56->28|56->28|59->31|59->31|60->32
                  -- GENERATED --
              */
          