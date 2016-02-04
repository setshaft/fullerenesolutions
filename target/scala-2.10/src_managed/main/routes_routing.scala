// @SOURCE:/home/siddhardha/Areas/conf/routes
// @HASH:d955a6512f1c53ab5696a5f528c8a5dd3c521edd
// @DATE:Thu Feb 04 15:56:37 IST 2016


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Areas_list1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("areas/"))))
        

// @LINE:9
private[this] lazy val controllers_Areas_newArea2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("areas/new"))))
        

// @LINE:10
private[this] lazy val controllers_Areas_details3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("areas/"),DynamicPart("ean", """[^/]+"""))))
        

// @LINE:11
private[this] lazy val controllers_Areas_jsondetails4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("areas/json/"),DynamicPart("ean", """[^/]+"""))))
        

// @LINE:12
private[this] lazy val controllers_Areas_jsonDetailsAllAreas5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("areas/json/"))))
        

// @LINE:13
private[this] lazy val controllers_Areas_totalAreas6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("area/count"))))
        

// @LINE:14
private[this] lazy val controllers_Areas_save7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("areas/"))))
        

// @LINE:15
private[this] lazy val controllers_Areas_delete8 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("areas/"),DynamicPart("ean", """[^/]+"""))))
        

// @LINE:18
private[this] lazy val controllers_Assets_at9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+"""))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """areas/""","""controllers.Areas.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """areas/new""","""controllers.Areas.newArea()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """areas/$ean<[^/]+>""","""controllers.Areas.details(ean:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """areas/json/$ean<[^/]+>""","""controllers.Areas.jsondetails(ean:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """areas/json/""","""controllers.Areas.jsonDetailsAllAreas()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """area/count""","""controllers.Areas.totalAreas()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """areas/""","""controllers.Areas.save()"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """areas/$ean<[^/]+>""","""controllers.Areas.delete(ean:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Areas_list1(params) => {
   call { 
        invokeHandler(controllers.Areas.list(), HandlerDef(this, "controllers.Areas", "list", Nil,"GET", """""", Routes.prefix + """areas/"""))
   }
}
        

// @LINE:9
case controllers_Areas_newArea2(params) => {
   call { 
        invokeHandler(controllers.Areas.newArea(), HandlerDef(this, "controllers.Areas", "newArea", Nil,"GET", """""", Routes.prefix + """areas/new"""))
   }
}
        

// @LINE:10
case controllers_Areas_details3(params) => {
   call(params.fromPath[String]("ean", None)) { (ean) =>
        invokeHandler(controllers.Areas.details(ean), HandlerDef(this, "controllers.Areas", "details", Seq(classOf[String]),"GET", """""", Routes.prefix + """areas/$ean<[^/]+>"""))
   }
}
        

// @LINE:11
case controllers_Areas_jsondetails4(params) => {
   call(params.fromPath[String]("ean", None)) { (ean) =>
        invokeHandler(controllers.Areas.jsondetails(ean), HandlerDef(this, "controllers.Areas", "jsondetails", Seq(classOf[String]),"GET", """""", Routes.prefix + """areas/json/$ean<[^/]+>"""))
   }
}
        

// @LINE:12
case controllers_Areas_jsonDetailsAllAreas5(params) => {
   call { 
        invokeHandler(controllers.Areas.jsonDetailsAllAreas(), HandlerDef(this, "controllers.Areas", "jsonDetailsAllAreas", Nil,"GET", """""", Routes.prefix + """areas/json/"""))
   }
}
        

// @LINE:13
case controllers_Areas_totalAreas6(params) => {
   call { 
        invokeHandler(controllers.Areas.totalAreas(), HandlerDef(this, "controllers.Areas", "totalAreas", Nil,"GET", """""", Routes.prefix + """area/count"""))
   }
}
        

// @LINE:14
case controllers_Areas_save7(params) => {
   call { 
        invokeHandler(controllers.Areas.save(), HandlerDef(this, "controllers.Areas", "save", Nil,"POST", """""", Routes.prefix + """areas/"""))
   }
}
        

// @LINE:15
case controllers_Areas_delete8(params) => {
   call(params.fromPath[String]("ean", None)) { (ean) =>
        invokeHandler(controllers.Areas.delete(ean), HandlerDef(this, "controllers.Areas", "delete", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """areas/$ean<[^/]+>"""))
   }
}
        

// @LINE:18
case controllers_Assets_at9(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        