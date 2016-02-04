
package views.html.areas

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
object details extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Area],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(areaForm: Form[Area]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.24*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Area form")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""
  <h1>Area form</h1>
  """),_display_(Seq[Any](/*7.4*/helper/*7.10*/.form(action = routes.Areas.save())/*7.45*/ {_display_(Seq[Any](format.raw/*7.47*/("""
    <fieldset>
      <legend>Area ("""),_display_(Seq[Any](/*9.22*/areaForm("name")/*9.38*/.valueOr("New"))),format.raw/*9.53*/(""")</legend>
      """),_display_(Seq[Any](/*10.8*/helper/*10.14*/.inputText(areaForm("name"), '_label -> "Name"))),format.raw/*10.61*/("""
      """),_display_(Seq[Any](/*11.8*/helper/*11.14*/.inputText(areaForm("category"),'_label -> "Category"))),format.raw/*11.68*/("""
      """),_display_(Seq[Any](/*12.8*/helper/*12.14*/.textarea(areaForm("rating"), '_label -> "Rating"))),format.raw/*12.64*/("""
      """),_display_(Seq[Any](/*13.8*/helper/*13.14*/.textarea(areaForm("latitude"), '_label -> "Latitude"))),format.raw/*13.68*/("""
      """),_display_(Seq[Any](/*14.8*/helper/*14.14*/.textarea(areaForm("longitude"), '_label -> "Longitude"))),format.raw/*14.70*/("""

    </fieldset>
      <input type="submit" class="btn btn-primary" value="Save">
    <a class="btn" href=""""),_display_(Seq[Any](/*18.27*/routes/*18.33*/.Application.index())),format.raw/*18.53*/("""">Cancel</a>
  """)))})),format.raw/*19.4*/("""
""")))})),format.raw/*20.2*/("""
"""))}
    }
    
    def render(areaForm:Form[Area]): play.api.templates.Html = apply(areaForm)
    
    def f:((Form[Area]) => play.api.templates.Html) = (areaForm) => apply(areaForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 04 15:39:04 IST 2016
                    SOURCE: /home/siddhardha/Areas/app/views/areas/details.scala.html
                    HASH: fc766f7d680f6d886b71a6d7670c852dfa362742
                    MATRIX: 735->1|884->23|911->75|947->77|972->94|1011->96|1070->121|1084->127|1127->162|1166->164|1238->201|1262->217|1298->232|1351->250|1366->256|1435->303|1478->311|1493->317|1569->371|1612->379|1627->385|1699->435|1742->443|1757->449|1833->503|1876->511|1891->517|1969->573|2114->682|2129->688|2171->708|2218->724|2251->726
                    LINES: 26->1|32->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|36->7|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|47->18|47->18|47->18|48->19|49->20
                    -- GENERATED --
                */
            