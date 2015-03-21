
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
      <link type="text/css" rel="stylesheet" href=""""),_display_(/*8.53*/routes/*8.59*/.Assets.at("stylesheets/materialize.css")),format.raw/*8.100*/(""""  media="screen,projection"/>
	  <link type="text/css" rel="stylesheet" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.at("stylesheets/main.css")),format.raw/*9.90*/(""""/>	
	  <link type="text/css" rel="stylesheet" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.at("stylesheets/font-awesome.min.css")),format.raw/*10.102*/(""""/>	
      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    </head>

    <body>
      <!--Import jQuery before materialize.js-->
      <script type="text/javascript" src=""""),_display_(/*17.44*/routes/*17.50*/.Assets.at("javascripts/jquery-2.1.3.min.js")),format.raw/*17.95*/(""""></script>
      <script type="text/javascript" src=""""),_display_(/*18.44*/routes/*18.50*/.Assets.at("javascripts/materialize.js")),format.raw/*18.90*/(""""></script>
      <script type="text/javascript" src=""""),_display_(/*19.44*/routes/*19.50*/.Assets.at("javascripts/main.js")),format.raw/*19.83*/(""""></script>
    </body>
    	"""),_display_(/*21.7*/navbar()),format.raw/*21.15*/("""
    	  		
    		"""),_display_(/*23.8*/content),format.raw/*23.15*/("""
       		
       	
       	"""),_display_(/*26.10*/footer()),format.raw/*26.18*/("""
    """),format.raw/*27.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Mar 21 16:48:33 CET 2015
                  SOURCE: /home/stefano/Repository/PlayFrameworkTemperature/app/views/main.scala.html
                  HASH: fbc06295f360ddb813c527abd0f46b8fe62402e5
                  MATRIX: 727->1|845->31|874->34|1022->156|1036->162|1098->203|1204->283|1218->289|1272->323|1353->377|1368->383|1436->429|1761->727|1776->733|1842->778|1924->833|1939->839|2000->879|2082->934|2097->940|2151->973|2207->1003|2236->1011|2280->1029|2308->1036|2364->1065|2393->1073|2425->1078
                  LINES: 26->1|29->1|32->4|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|51->23|51->23|54->26|54->26|55->27
                  -- GENERATED --
              */
          