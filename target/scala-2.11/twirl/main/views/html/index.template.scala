
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

	"""),format.raw/*5.2*/("""<div class="row">
    	
    		<div class="col l6 m12 s12  ">
	    		
	    		<div class="col s12">
	    			<h2>Misuration</h2>
	    			<div style="border:1px solid black; min-height:200px;">
	    				"""),_display_(/*12.11*/loader()),format.raw/*12.19*/("""
	    			"""),format.raw/*13.9*/("""</div>
	    		</div>
	    		<div class="col s12">
	    			<h2>Failure</h2>
	    			<div style="border:1px solid black; min-height:200px;">
	    				"""),_display_(/*18.11*/loader()),format.raw/*18.19*/("""
	    			"""),format.raw/*19.9*/("""</div>
	    		</div>
    		
    		</div>
    		<div class="col l6 m12 s12">
    			<input type="date" class="datepicker">
    		</div>	
         
    </div>   

""")))}),format.raw/*29.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Mar 21 16:54:04 CET 2015
                  SOURCE: /home/stefano/Repository/PlayFrameworkTemperature/app/views/index.scala.html
                  HASH: a86a690883cea4b4127d5b6ee97353730136f47c
                  MATRIX: 723->1|828->18|856->21|876->33|915->35|944->38|1171->238|1200->246|1236->255|1412->404|1441->412|1477->421|1669->583
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|40->12|40->12|41->13|46->18|46->18|47->19|57->29
                  -- GENERATED --
              */
          