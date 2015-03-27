
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
object navbar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="navbar-fixed">
  <nav>
    <div class="nav-wrapper">
      <a href="#!" class="brand-logo center"><i class="fa fa-fire" style="color:white"></i><span class="hide-on-small-only">TemperatureMonitor</span></a>
      <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="mdi-navigation-menu"></i></a>
      <ul class="right hide-on-med-and-down">
        <li><i class="fa fa-book left"style="color:white;"></i><a href="http://materializecss.com/">MaterilizeCSS Docs</a></li>
        <li><i class="fa fa-github left"style="color:white;"></i><a href="https://github.com/Dogfalo/materialize">MaterilizeCSS Repo</a></li>
      </ul>
      <ul class="side-nav"></ul>

    </div>
  </nav>
</div>
  <div class="mobile-side-nav-custom">
     <ul class="side-nav " id="mobile-demo">
        <li><i class="fa fa-book left"style="color:#444;"></i><a href="http://materializecss.com/">MaterilizeCSS Docs</a></li>
        <li><i class="fa fa-github left"style="color:#444;"></i><a href="https://github.com/Dogfalo/materialize">MaterilizeCSS Repo</a></li>
      </ul>
  </div>
  """))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Mar 27 15:18:14 CET 2015
                  SOURCE: /home/stefano/Repository/PlayFrameworkTemperature/app/views/navbar.scala.html
                  HASH: b032f6082f27d2f2387dba24d7310ab2b8d3c3d5
                  MATRIX: 799->0
                  LINES: 29->1
                  -- GENERATED --
              */
          