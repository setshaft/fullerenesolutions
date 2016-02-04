
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Area],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(areas: List[Area]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.21*/("""
"""),_display_(Seq[Any](/*2.2*/main("Areas catalogue")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""

<h2>All areas</h2>
<link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">

<script>
 function del(urlToDelete) """),format.raw/*8.28*/("""{"""),format.raw/*8.29*/("""
  $.ajax("""),format.raw/*9.10*/("""{"""),format.raw/*9.11*/("""
    url: urlToDelete,
    type: 'DELETE',
    success: function(results) """),format.raw/*12.32*/("""{"""),format.raw/*12.33*/("""
            // Refresh the page
            location.reload();
          """),format.raw/*15.11*/("""}"""),format.raw/*15.12*/("""
        """),format.raw/*16.9*/("""}"""),format.raw/*16.10*/(""");
"""),format.raw/*17.1*/("""}"""),format.raw/*17.2*/("""
</script>

<table id="myTable">
  <thead>
    <tr><th>Name</th><th>Category</th><th>Rating</th><th>Location(Latitude, Longitude)</th><th></th></tr>
  </thead>
  <tbody>
    """),_display_(Seq[Any](/*25.6*/for(area <- areas) yield /*25.24*/ {_display_(Seq[Any](format.raw/*25.26*/("""

      <tr>
        <td><a href=""""),_display_(Seq[Any](/*28.23*/routes/*28.29*/.Areas.details(area.name))),format.raw/*28.54*/("""">"""),_display_(Seq[Any](/*28.57*/area/*28.61*/.name)),format.raw/*28.66*/("""</a></td>
        <td><a href=""""),_display_(Seq[Any](/*29.23*/routes/*29.29*/.Areas.details(area.name))),format.raw/*29.54*/("""">"""),_display_(Seq[Any](/*29.57*/area/*29.61*/.category)),format.raw/*29.70*/("""</a></td>
        <td><a href=""""),_display_(Seq[Any](/*30.23*/routes/*30.29*/.Areas.details(area.name))),format.raw/*30.54*/("""">"""),_display_(Seq[Any](/*30.57*/area/*30.61*/.rating)),format.raw/*30.68*/("""</a></td>
        <td><a href=""""),_display_(Seq[Any](/*31.23*/routes/*31.29*/.Areas.details(area.name))),format.raw/*31.54*/("""">"""),_display_(Seq[Any](/*31.57*/area/*31.61*/.latitude)),format.raw/*31.70*/(""" , """),_display_(Seq[Any](/*31.74*/area/*31.78*/.longitude)),format.raw/*31.88*/("""</a></td>
        <td>
          <a href=""""),_display_(Seq[Any](/*33.21*/routes/*33.27*/.Areas.details(area.name))),format.raw/*33.52*/(""""><i class="icon icon-pencil"></i></a> 
          <a onclick="javascript:del('"""),_display_(Seq[Any](/*34.40*/routes/*34.46*/.Areas.delete(area.name))),format.raw/*34.70*/("""')"><i class="icon icon-trash"></i></a> 
        </td>
      </tr>
    """)))})),format.raw/*37.6*/("""
  </tbody>
</table>

<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>

""")))})),format.raw/*44.2*/("""
<script type="text/javascript">

  $(document).ready(function()"""),format.raw/*47.31*/("""{"""),format.raw/*47.32*/("""
    $('#myTable').DataTable();
  """),format.raw/*49.3*/("""}"""),format.raw/*49.4*/(""");
  
</script>
<br>
<br>
<a href=""""),_display_(Seq[Any](/*54.11*/routes/*54.17*/.Areas.newArea())),format.raw/*54.33*/("""" class="btn"><i class="icon-plus"></i> New area</a>
"""))}
    }
    
    def render(areas:List[Area]): play.api.templates.Html = apply(areas)
    
    def f:((List[Area]) => play.api.templates.Html) = (areas) => apply(areas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 04 15:41:10 IST 2016
                    SOURCE: /home/siddhardha/Areas/app/views/areas/list.scala.html
                    HASH: cef084cf34bc20e3b09ed617f7547e98a5e38dd4
                    MATRIX: 732->1|828->20|864->22|895->45|934->47|1147->233|1175->234|1212->244|1240->245|1342->319|1371->320|1473->394|1502->395|1538->404|1567->405|1597->408|1625->409|1835->584|1869->602|1909->604|1980->639|1995->645|2042->670|2081->673|2094->677|2121->682|2189->714|2204->720|2251->745|2290->748|2303->752|2334->761|2402->793|2417->799|2464->824|2503->827|2516->831|2545->838|2613->870|2628->876|2675->901|2714->904|2727->908|2758->917|2798->921|2811->925|2843->935|2922->978|2937->984|2984->1009|3099->1088|3114->1094|3160->1118|3263->1190|3580->1476|3672->1540|3701->1541|3762->1575|3790->1576|3862->1612|3877->1618|3915->1634
                    LINES: 26->1|29->1|30->2|30->2|30->2|36->8|36->8|37->9|37->9|40->12|40->12|43->15|43->15|44->16|44->16|45->17|45->17|53->25|53->25|53->25|56->28|56->28|56->28|56->28|56->28|56->28|57->29|57->29|57->29|57->29|57->29|57->29|58->30|58->30|58->30|58->30|58->30|58->30|59->31|59->31|59->31|59->31|59->31|59->31|59->31|59->31|59->31|61->33|61->33|61->33|62->34|62->34|62->34|65->37|72->44|75->47|75->47|77->49|77->49|82->54|82->54|82->54
                    -- GENERATED --
                */
            