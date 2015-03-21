// @SOURCE:/home/stefano/Repository/PlayFrameworkTemperature/conf/routes
// @HASH:6cb5b8d2e27bd0de95a42cedda9a2b74c0377556
// @DATE:Sat Mar 21 16:44:20 CET 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:9
// @LINE:8
class ReverseTemperatureController {


// @LINE:8
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "temperature")
}
                        

// @LINE:9
def show(data:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "temperature/show/" + implicitly[PathBindable[Long]].unbind("data", data))
}
                        

}
                          

// @LINE:16
class ReverseAssets {


// @LINE:16
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:12
// @LINE:11
class ReverseFailureController {


// @LINE:11
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "failure")
}
                        

// @LINE:12
def show(data:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "failure/show/" + implicitly[PathBindable[Long]].unbind("data", data))
}
                        

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:9
// @LINE:8
class ReverseTemperatureController {


// @LINE:8
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TemperatureController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "temperature"})
      }
   """
)
                        

// @LINE:9
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TemperatureController.show",
   """
      function(data) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "temperature/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("data", data)})
      }
   """
)
                        

}
              

// @LINE:16
class ReverseAssets {


// @LINE:16
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:12
// @LINE:11
class ReverseFailureController {


// @LINE:11
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FailureController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "failure"})
      }
   """
)
                        

// @LINE:12
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FailureController.show",
   """
      function(data) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "failure/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("data", data)})
      }
   """
)
                        

}
              

// @LINE:6
class ReverseApplication {


// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:9
// @LINE:8
class ReverseTemperatureController {


// @LINE:8
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemperatureController.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemperatureController", "index", Seq(), "GET", """""", _prefix + """temperature""")
)
                      

// @LINE:9
def show(data:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemperatureController.show(data), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemperatureController", "show", Seq(classOf[Long]), "GET", """""", _prefix + """temperature/show/$data<[^/]+>""")
)
                      

}
                          

// @LINE:16
class ReverseAssets {


// @LINE:16
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:12
// @LINE:11
class ReverseFailureController {


// @LINE:11
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FailureController.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FailureController", "index", Seq(), "GET", """""", _prefix + """failure""")
)
                      

// @LINE:12
def show(data:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FailureController.show(data), HandlerDef(this.getClass.getClassLoader, "", "controllers.FailureController", "show", Seq(classOf[Long]), "GET", """""", _prefix + """failure/show/$data<[^/]+>""")
)
                      

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    