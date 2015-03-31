
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

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""

	"""),format.raw/*5.2*/("""<div class="container">
	<div class="row" style="margin-top:50px;">
    	    		
	    		<div class="col l12 m12 s12">
	    			<div class="col l6 m6 s12">
		    			<button class="btn waves-effect waves-light datepicker" type="button" name="selectDay">
		    				Change Day
	    					<i class="mdi-action-schedule left"></i>
	  					</button>
	  				</div>
	  				<div class="col l6 m6 s12">

						<p class="flow-text description">Press <em style="color:#26a69a"> Change Day </em>  button to change the date and see the temperature readings of the selected day.
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

         </div>
    </div>   

""")))}),format.raw/*132.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 31 11:48:00 CEST 2015
                  SOURCE: /home/stefano/Repository/PlayFrameworkTemperature/app/views/index.scala.html
                  HASH: 578b8358c6f2378f2e3df5d96483e99a286b39d4
                  MATRIX: 723->1|828->18|856->21|877->34|916->36|945->39|5916->4979
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|160->132
                  -- GENERATED --
              */
          