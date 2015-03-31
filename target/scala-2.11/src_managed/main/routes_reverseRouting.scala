// @SOURCE:/home/stefano/Repository/PlayFrameworkTemperature/conf/routes
// @HASH:845bd418a7c1625eead2a7eada38898eb27ff80d
// @DATE:Tue Mar 31 09:55:04 CEST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:22
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseTemperatureController {


// @LINE:10
def delete(data:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "temperature/delete/" + implicitly[PathBindable[Long]].unbind("data", data))
}
                        

// @LINE:9
def show(data:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "temperature/show/" + implicitly[PathBindable[Long]].unbind("data", data))
}
                        

// @LINE:13
def create(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "temperature/create")
}
                        

// @LINE:12
def edit(data:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "temperature/edit/" + implicitly[PathBindable[Long]].unbind("data", data))
}
                        

// @LINE:11
def update(data:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "temperature/update/" + implicitly[PathBindable[Long]].unbind("data", data))
}
                        

// @LINE:8
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "temperature")
}
                        

}
                          

// @LINE:22
class ReverseAssets {


// @LINE:22
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:18
// @LINE:17
// @LINE:16
class ReverseFailureController {


// @LINE:18
def create(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "failure/create")
}
                        

// @LINE:16
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "failure")
}
                        

// @LINE:17
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
                  


// @LINE:22
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseTemperatureController {


// @LINE:10
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TemperatureController.delete",
   """
      function(data) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "temperature/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("data", data)})
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
                        

// @LINE:13
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TemperatureController.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "temperature/create"})
      }
   """
)
                        

// @LINE:12
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TemperatureController.edit",
   """
      function(data) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "temperature/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("data", data)})
      }
   """
)
                        

// @LINE:11
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TemperatureController.update",
   """
      function(data) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "temperature/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("data", data)})
      }
   """
)
                        

// @LINE:8
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TemperatureController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "temperature"})
      }
   """
)
                        

}
              

// @LINE:22
class ReverseAssets {


// @LINE:22
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:18
// @LINE:17
// @LINE:16
class ReverseFailureController {


// @LINE:18
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FailureController.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "failure/create"})
      }
   """
)
                        

// @LINE:16
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FailureController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "failure"})
      }
   """
)
                        

// @LINE:17
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
        


// @LINE:22
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseTemperatureController {


// @LINE:10
def delete(data:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemperatureController.delete(data), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemperatureController", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """temperature/delete/$data<[^/]+>""")
)
                      

// @LINE:9
def show(data:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemperatureController.show(data), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemperatureController", "show", Seq(classOf[Long]), "GET", """""", _prefix + """temperature/show/$data<[^/]+>""")
)
                      

// @LINE:13
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemperatureController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemperatureController", "create", Seq(), "POST", """""", _prefix + """temperature/create""")
)
                      

// @LINE:12
def edit(data:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemperatureController.edit(data), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemperatureController", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """temperature/edit/$data<[^/]+>""")
)
                      

// @LINE:11
def update(data:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemperatureController.update(data), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemperatureController", "update", Seq(classOf[Long]), "GET", """""", _prefix + """temperature/update/$data<[^/]+>""")
)
                      

// @LINE:8
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TemperatureController.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TemperatureController", "index", Seq(), "GET", """""", _prefix + """temperature""")
)
                      

}
                          

// @LINE:22
class ReverseAssets {


// @LINE:22
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:18
// @LINE:17
// @LINE:16
class ReverseFailureController {


// @LINE:18
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FailureController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FailureController", "create", Seq(), "POST", """""", _prefix + """failure/create""")
)
                      

// @LINE:16
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FailureController.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.FailureController", "index", Seq(), "GET", """""", _prefix + """failure""")
)
                      

// @LINE:17
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
        
    