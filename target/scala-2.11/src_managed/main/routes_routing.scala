// @SOURCE:/home/stefano/Repository/PlayFrameworkTemperature/conf/routes
// @HASH:e420c29881c4d922bc7beb73ab6bf15fad6d3341
// @DATE:Fri Mar 27 16:05:38 CET 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:8
private[this] lazy val controllers_TemperatureController_index1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("temperature"))))
private[this] lazy val controllers_TemperatureController_index1_invoker = createInvoker(
controllers.TemperatureController.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TemperatureController", "index", Nil,"GET", """""", Routes.prefix + """temperature"""))
        

// @LINE:9
private[this] lazy val controllers_TemperatureController_show2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("temperature/show/"),DynamicPart("data", """[^/]+""",true))))
private[this] lazy val controllers_TemperatureController_show2_invoker = createInvoker(
controllers.TemperatureController.show(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TemperatureController", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """temperature/show/$data<[^/]+>"""))
        

// @LINE:10
private[this] lazy val controllers_TemperatureController_create3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("temperature/create"))))
private[this] lazy val controllers_TemperatureController_create3_invoker = createInvoker(
controllers.TemperatureController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TemperatureController", "create", Nil,"POST", """""", Routes.prefix + """temperature/create"""))
        

// @LINE:13
private[this] lazy val controllers_FailureController_index4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("failure"))))
private[this] lazy val controllers_FailureController_index4_invoker = createInvoker(
controllers.FailureController.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FailureController", "index", Nil,"GET", """""", Routes.prefix + """failure"""))
        

// @LINE:14
private[this] lazy val controllers_FailureController_show5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("failure/show/"),DynamicPart("data", """[^/]+""",true))))
private[this] lazy val controllers_FailureController_show5_invoker = createInvoker(
controllers.FailureController.show(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FailureController", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """failure/show/$data<[^/]+>"""))
        

// @LINE:15
private[this] lazy val controllers_FailureController_create6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("failure/create"))))
private[this] lazy val controllers_FailureController_create6_invoker = createInvoker(
controllers.FailureController.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FailureController", "create", Nil,"POST", """""", Routes.prefix + """failure/create"""))
        

// @LINE:19
private[this] lazy val controllers_Assets_at7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """temperature""","""controllers.TemperatureController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """temperature/show/$data<[^/]+>""","""controllers.TemperatureController.show(data:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """temperature/create""","""controllers.TemperatureController.create()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """failure""","""controllers.FailureController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """failure/show/$data<[^/]+>""","""controllers.FailureController.show(data:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """failure/create""","""controllers.FailureController.create()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:8
case controllers_TemperatureController_index1_route(params) => {
   call { 
        controllers_TemperatureController_index1_invoker.call(controllers.TemperatureController.index())
   }
}
        

// @LINE:9
case controllers_TemperatureController_show2_route(params) => {
   call(params.fromPath[Long]("data", None)) { (data) =>
        controllers_TemperatureController_show2_invoker.call(controllers.TemperatureController.show(data))
   }
}
        

// @LINE:10
case controllers_TemperatureController_create3_route(params) => {
   call { 
        controllers_TemperatureController_create3_invoker.call(controllers.TemperatureController.create())
   }
}
        

// @LINE:13
case controllers_FailureController_index4_route(params) => {
   call { 
        controllers_FailureController_index4_invoker.call(controllers.FailureController.index())
   }
}
        

// @LINE:14
case controllers_FailureController_show5_route(params) => {
   call(params.fromPath[Long]("data", None)) { (data) =>
        controllers_FailureController_show5_invoker.call(controllers.FailureController.show(data))
   }
}
        

// @LINE:15
case controllers_FailureController_create6_route(params) => {
   call { 
        controllers_FailureController_create6_invoker.call(controllers.FailureController.create())
   }
}
        

// @LINE:19
case controllers_Assets_at7_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     