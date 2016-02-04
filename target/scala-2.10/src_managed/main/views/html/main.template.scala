
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
  <head>
    <title>"""),_display_(Seq[Any](/*7.13*/title)),format.raw/*7.18*/("""</title>
    <link href=""""),_display_(Seq[Any](/*8.18*/routes/*8.24*/.Assets.at("bootstrap/css/bootstrap.min.css"))),format.raw/*8.69*/("""" rel="stylesheet" media="screen">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.55*/routes/*9.61*/.Assets.at("images/favicon.png"))),format.raw/*9.93*/("""">
    <script src=""""),_display_(Seq[Any](/*10.19*/routes/*10.25*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*10.70*/("""" type="text/javascript"></script>
  </head>
  <body class="container">
    """),_display_(Seq[Any](/*13.6*/if(flash.containsKey("success"))/*13.38*/{_display_(Seq[Any](format.raw/*13.39*/("""
      <div class="alert alert-success">
      """),_display_(Seq[Any](/*15.8*/flash/*15.13*/.get("success"))),format.raw/*15.28*/("""
      </div>
    """)))})),format.raw/*17.6*/("""

    """),_display_(Seq[Any](/*19.6*/if(flash.containsKey("error"))/*19.36*/{_display_(Seq[Any](format.raw/*19.37*/("""
      <div class="alert alert-error">
      """),_display_(Seq[Any](/*21.8*/flash/*21.13*/.get("error"))),format.raw/*21.26*/("""
      </div>
    """)))})),format.raw/*23.6*/("""
  """),_display_(Seq[Any](/*24.4*/content)),format.raw/*24.11*/("""
  </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.Html = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 04 15:30:17 IST 2016
                    SOURCE: /home/siddhardha/Areas/app/views/main.scala.html
                    HASH: fa9b8a478da73b198fffe192499abdf29c33a18c
                    MATRIX: 727->1|834->31|916->78|942->83|1003->109|1017->115|1083->160|1207->249|1221->255|1274->287|1331->308|1346->314|1413->359|1525->436|1566->468|1605->469|1688->517|1702->522|1739->537|1789->556|1831->563|1870->593|1909->594|1990->640|2004->645|2039->658|2089->677|2128->681|2157->688
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|41->13|41->13|41->13|43->15|43->15|43->15|45->17|47->19|47->19|47->19|49->21|49->21|49->21|51->23|52->24|52->24
                    -- GENERATED --
                */
            