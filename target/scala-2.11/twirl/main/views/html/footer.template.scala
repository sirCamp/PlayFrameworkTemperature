
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
object footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<footer class="page-footer">
          
            <div class="row">
              <div class="col l6 s12">
                <h5 class="white-text">Temperature Monitor Footer</h5>
                <p class="grey-text text-lighten-4">You can see the used technologies by clicking on near links.</p>
              </div>
              <div class="col l4 offset-l2 s12">
                <h5 class="white-text">Used Technologies Links</h5>
                <ul>
                  <li><a class="grey-text text-lighten-3" href="http://www.flotcharts.org/"><span class="fa fa-area-chart fa-material-footer"></span>FlotChart JS</a></li>
                  <li><a class="grey-text text-lighten-3" href="https://jquery.com/"><span class="fa fa-jsfiddle fa-material-footer"></span>jQuery 2.1.3</a></li>
                  <li><a class="grey-text text-lighten-3" href="https://www.playframework.com/"><span class="fa fa-play fa-material-footer"></span>Play Framework</a></li>
                  <li><a class="grey-text text-lighten-3" href="http://materializecss.com/"><span class="fa fa-css3 fa-material-footer"></span>Materialize CSS</a></li>
                  <li><a class="grey-text text-lighten-3" href="http://coffeescript.org/"><span class="fa fa-coffee fa-material-footer"></span>CoffeScript</a></li>
                </ul>
              </div>
            </div>
          </div>
          <div class="footer-copyright">
            <div class="container">
           
            <a class="grey-text text-lighten-4 right" href="http://stefanocampese.xyz/">
            <span class="fa fa-globe fa-material-footer"></span>
            My WebSites</a>
            </div>
         
        </footer>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 26 14:42:07 CET 2015
                  SOURCE: /home/stefano/Repository/PlayFrameworkTemperature/app/views/footer.scala.html
                  HASH: bca889506cf02c89b61fc92adf48244a83f0e3f1
                  MATRIX: 799->0
                  LINES: 29->1
                  -- GENERATED --
              */
          