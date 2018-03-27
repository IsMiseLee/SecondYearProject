
package views.html

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

object updateProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.products.Product],models.users.Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long,productForm: Form[models.products.Product],member: models.users.Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.83*/("""
"""),_display_(/*3.2*/main("Update Product", member)/*3.32*/{_display_(Seq[Any](format.raw/*3.33*/("""
"""),format.raw/*4.1*/("""<p class="lead"> Update Product</p>

"""),_display_(/*6.2*/form(action=routes.AdminProductCtrl.updateProductSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""
    """),format.raw/*8.33*/("""
    """),_display_(/*9.6*/CSRF/*9.10*/.formField),format.raw/*9.20*/("""
    """),_display_(/*10.6*/inputText(productForm("album_name"),'_label -> "Album name", 'class -> "form-control")),format.raw/*10.92*/("""
    """),_display_(/*11.6*/inputText(productForm("year"),'_label -> "Year", 'class -> "form-control")),format.raw/*11.80*/("""
    """),_display_(/*12.6*/inputText(productForm("type"),'_label -> "Type", 'class -> "form-control")),format.raw/*12.80*/("""
    """),_display_(/*13.6*/inputText(productForm("price"),'_label -> "Price", 'class -> "form-control")),format.raw/*13.82*/("""
    """),_display_(/*14.6*/inputText(productForm("stock"),'_label -> "Stock", 'class -> "form-control")),format.raw/*14.82*/("""

    """),format.raw/*16.5*/("""<label>Image Upload</label>
    <input class="btn-sm btn-default" type="file" name="upload">
    <br><br>
  

    <div class="actions">
        <input type="submit" value="Update Project" class="btn btn-primary">
        <a href=""""),_display_(/*23.19*/routes/*23.25*/.ProductCtrl.listProduct()),format.raw/*23.51*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*27.3*/("""
""")))}),format.raw/*28.2*/("""
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
                  DATE: Tue Mar 27 15:57:11 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/updateProduct.scala.html
                  HASH: ef309cdc2c9d21c4574d5a8210262e954d11787a
                  MATRIX: 1004->1|1158->84|1203->82|1230->101|1268->131|1306->132|1333->133|1396->171|1545->312|1584->314|1616->347|1647->353|1659->357|1689->367|1721->373|1828->459|1860->465|1955->539|1987->545|2082->619|2114->625|2211->701|2243->707|2340->783|2373->789|2631->1020|2646->1026|2693->1052|2826->1155|2858->1157
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|39->7|39->7|40->8|41->9|41->9|41->9|42->10|42->10|43->11|43->11|44->12|44->12|45->13|45->13|46->14|46->14|48->16|55->23|55->23|55->23|59->27|60->28
                  -- GENERATED --
              */
          