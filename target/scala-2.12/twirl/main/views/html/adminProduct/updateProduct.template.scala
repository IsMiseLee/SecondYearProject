
package views.html.adminProduct

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import models.products.Product
/*2.2*/import models.products.Artist
/*3.2*/import models.users.Member

object updateProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.products.Product],models.users.Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(id: Long,productForm: Form[models.products.Product],member: models.users.Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*4.83*/("""
"""),_display_(/*6.2*/main("Update Product", member)/*6.32*/{_display_(Seq[Any](format.raw/*6.33*/("""
"""),format.raw/*7.1*/("""<p class="lead"> Update Product</p>

"""),_display_(/*9.2*/form(action=routes.AdminProductCtrl.updateProductSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*10.51*/ {_display_(Seq[Any](format.raw/*10.53*/("""
    """),format.raw/*11.33*/("""
    """),_display_(/*12.6*/CSRF/*12.10*/.formField),format.raw/*12.20*/("""
    """),_display_(/*13.6*/inputText(productForm("album_name"),'_label -> "Album name", 'class -> "form-control")),format.raw/*13.92*/("""
    """),_display_(/*14.6*/inputText(productForm("year"),'_label -> "Year", 'class -> "form-control")),format.raw/*14.80*/("""

    """),_display_(/*16.6*/for((value, genre) <- Artist.options) yield /*16.43*/ {_display_(Seq[Any](format.raw/*16.45*/("""
        """),format.raw/*17.9*/("""<input type="checkbox" genre="artSelect[]" value=""""),_display_(/*17.60*/value),format.raw/*17.65*/(""""
        """),_display_(/*18.10*/if(Artist.inArtist(value.toLong, id))/*18.47*/ {_display_(Seq[Any](format.raw/*18.49*/("""
            """),format.raw/*19.13*/("""checked
        """)))}),format.raw/*20.10*/("""
        """),format.raw/*21.9*/("""/>"""),_display_(/*21.12*/genre),format.raw/*21.17*/("""<br>        
    """)))}),format.raw/*22.6*/("""  
    """),_display_(/*23.6*/inputText(productForm("art_name"),'_label -> "Artist", 'class -> "form-control")),format.raw/*23.86*/("""
    """),_display_(/*24.6*/inputText(productForm("price"),'_label -> "Price", 'class -> "form-control")),format.raw/*24.82*/("""
    """),_display_(/*25.6*/inputText(productForm("stock"),'_label -> "Stock", 'class -> "form-control")),format.raw/*25.82*/("""

    """),format.raw/*27.5*/("""<label>Image Upload</label>
    <input class="btn-sm btn-default" type="file" name="upload">
    <br><br>
  

    <div class="actions">
        <input type="submit" value="Update Product" class="btn btn-primary">
        <a href=""""),_display_(/*34.19*/routes/*34.25*/.AdminProductCtrl.listProduct(0)),format.raw/*34.57*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*38.3*/("""
""")))}),format.raw/*39.2*/("""
"""))
      }
    }
  }

  def render(id:Long,productForm:Form[models.products.Product],member:models.users.Member): play.twirl.api.HtmlFormat.Appendable = apply(id,productForm,member)

  def f:((Long,Form[models.products.Product],models.users.Member) => play.twirl.api.HtmlFormat.Appendable) = (id,productForm,member) => apply(id,productForm,member)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 30 20:58:39 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/adminProduct/updateProduct.scala.html
                  HASH: 3438b92775a243e60be081d3c2403b63fb083d8d
                  MATRIX: 664->1|702->33|739->64|1126->92|1280->175|1325->173|1352->192|1390->222|1428->223|1455->224|1518->262|1668->403|1708->405|1741->438|1773->444|1786->448|1817->458|1849->464|1956->550|1988->556|2083->630|2116->637|2169->674|2209->676|2245->685|2323->736|2349->741|2387->752|2433->789|2473->791|2514->804|2562->821|2598->830|2628->833|2654->838|2702->856|2736->864|2837->944|2869->950|2966->1026|2998->1032|3095->1108|3128->1114|3386->1345|3401->1351|3454->1383|3587->1486|3619->1488
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|38->6|38->6|39->7|41->9|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|46->14|46->14|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|52->20|53->21|53->21|53->21|54->22|55->23|55->23|56->24|56->24|57->25|57->25|59->27|66->34|66->34|66->34|70->38|71->39
                  -- GENERATED --
              */
          