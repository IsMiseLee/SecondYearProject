
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
    """),_display_(/*15.6*/inputText(productForm("type"),'_label -> "Type", 'class -> "form-control")),format.raw/*15.80*/("""
    """),_display_(/*16.6*/inputText(productForm("price"),'_label -> "Price", 'class -> "form-control")),format.raw/*16.82*/("""
    """),_display_(/*17.6*/inputText(productForm("stock"),'_label -> "Stock", 'class -> "form-control")),format.raw/*17.82*/("""

    """),format.raw/*19.5*/("""<label>Image Upload</label>
    <input class="btn-sm btn-default" type="file" name="upload">
    <br><br>
  

    <div class="actions">
        <input type="submit" value="Update Project" class="btn btn-primary">
        <a href=""""),_display_(/*26.19*/routes/*26.25*/.AdminProductCtrl.listProduct()),format.raw/*26.56*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*30.3*/("""
""")))}),format.raw/*31.2*/("""
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
                  DATE: Tue Mar 27 19:24:44 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/adminProduct/updateProduct.scala.html
                  HASH: a1a7402ef7e631f12c5b1e31b9c5cf7e464ff23d
                  MATRIX: 664->1|702->34|1089->62|1243->145|1288->143|1315->162|1353->192|1391->193|1418->194|1481->232|1631->373|1671->375|1704->408|1736->414|1749->418|1780->428|1812->434|1919->520|1951->526|2046->600|2078->606|2173->680|2205->686|2302->762|2334->768|2431->844|2464->850|2722->1081|2737->1087|2789->1118|2922->1221|2954->1223
                  LINES: 24->1|25->3|30->4|33->5|36->4|37->6|37->6|37->6|38->7|40->9|41->10|41->10|42->11|43->12|43->12|43->12|44->13|44->13|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|50->19|57->26|57->26|57->26|61->30|62->31
                  -- GENERATED --
              */
          