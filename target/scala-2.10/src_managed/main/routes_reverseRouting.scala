// @SOURCE:/home/siddhardha/Areas/conf/routes
// @HASH:d955a6512f1c53ab5696a5f528c8a5dd3c521edd
// @DATE:Thu Feb 04 15:56:37 IST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:18
class ReverseAssets {
    

// @LINE:18
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseAreas {
    

// @LINE:10
def details(ean:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "areas/" + implicitly[PathBindable[String]].unbind("ean", ean))
}
                                                

// @LINE:11
def jsondetails(ean:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "areas/json/" + implicitly[PathBindable[String]].unbind("ean", ean))
}
                                                

// @LINE:15
def delete(ean:String): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "areas/" + implicitly[PathBindable[String]].unbind("ean", ean))
}
                                                

// @LINE:12
def jsonDetailsAllAreas(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "areas/json/")
}
                                                

// @LINE:13
def totalAreas(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "area/count")
}
                                                

// @LINE:9
def newArea(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "areas/new")
}
                                                

// @LINE:8
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "areas/")
}
                                                

// @LINE:14
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "areas/")
}
                                                
    
}
                          
}
                  


// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

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
              

// @LINE:18
class ReverseAssets {
    

// @LINE:18
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseAreas {
    

// @LINE:10
def details : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Areas.details",
   """
      function(ean) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "areas/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ean", ean)})
      }
   """
)
                        

// @LINE:11
def jsondetails : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Areas.jsondetails",
   """
      function(ean) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "areas/json/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ean", ean)})
      }
   """
)
                        

// @LINE:15
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Areas.delete",
   """
      function(ean) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "areas/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ean", ean)})
      }
   """
)
                        

// @LINE:12
def jsonDetailsAllAreas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Areas.jsonDetailsAllAreas",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "areas/json/"})
      }
   """
)
                        

// @LINE:13
def totalAreas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Areas.totalAreas",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "area/count"})
      }
   """
)
                        

// @LINE:9
def newArea : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Areas.newArea",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "areas/new"})
      }
   """
)
                        

// @LINE:8
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Areas.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "areas/"})
      }
   """
)
                        

// @LINE:14
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Areas.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "areas/"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:18
class ReverseAssets {
    

// @LINE:18
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseAreas {
    

// @LINE:10
def details(ean:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Areas.details(ean), HandlerDef(this, "controllers.Areas", "details", Seq(classOf[String]), "GET", """""", _prefix + """areas/$ean<[^/]+>""")
)
                      

// @LINE:11
def jsondetails(ean:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Areas.jsondetails(ean), HandlerDef(this, "controllers.Areas", "jsondetails", Seq(classOf[String]), "GET", """""", _prefix + """areas/json/$ean<[^/]+>""")
)
                      

// @LINE:15
def delete(ean:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Areas.delete(ean), HandlerDef(this, "controllers.Areas", "delete", Seq(classOf[String]), "DELETE", """""", _prefix + """areas/$ean<[^/]+>""")
)
                      

// @LINE:12
def jsonDetailsAllAreas(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Areas.jsonDetailsAllAreas(), HandlerDef(this, "controllers.Areas", "jsonDetailsAllAreas", Seq(), "GET", """""", _prefix + """areas/json/""")
)
                      

// @LINE:13
def totalAreas(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Areas.totalAreas(), HandlerDef(this, "controllers.Areas", "totalAreas", Seq(), "GET", """""", _prefix + """area/count""")
)
                      

// @LINE:9
def newArea(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Areas.newArea(), HandlerDef(this, "controllers.Areas", "newArea", Seq(), "GET", """""", _prefix + """areas/new""")
)
                      

// @LINE:8
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Areas.list(), HandlerDef(this, "controllers.Areas", "list", Seq(), "GET", """""", _prefix + """areas/""")
)
                      

// @LINE:14
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Areas.save(), HandlerDef(this, "controllers.Areas", "save", Seq(), "POST", """""", _prefix + """areas/""")
)
                      
    
}
                          
}
                  
      