
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

"""),_display_(/*9.2*/form(action=routes.AdminProductCtrl.updateProductSubmit(id), 'class -> "form-vertical", 
'role -> "form",'enctype -> "multipart/form-data")/*10.51*/ {_display_(Seq[Any](format.raw/*10.53*/("""
   
    """),_display_(/*12.6*/CSRF/*12.10*/.formField),format.raw/*12.20*/("""

    """),format.raw/*14.5*/("""<div class="form-group">
            """),_display_(/*15.14*/inputText(productForm("album_name"), '_label -> "", 
            'class -> "form-control input-xs", 'placeholder -> "Album name")),format.raw/*16.77*/("""
        """),format.raw/*17.9*/("""</div>

    <div class="form-group">
            """),_display_(/*20.14*/inputText(productForm("year"), '_label -> "", 
            'class -> "form-control input-xs", 'placeholder -> "Year")),format.raw/*21.71*/("""
       """),format.raw/*22.8*/("""</div>

    """),_display_(/*24.6*/for((value, genre) <- Artist.options) yield /*24.43*/ {_display_(Seq[Any](format.raw/*24.45*/("""
        """),format.raw/*25.9*/("""<input type="checkbox" genre="artSelect[]" value=""""),_display_(/*25.60*/value),format.raw/*25.65*/(""""
        """),_display_(/*26.10*/if(Artist.inArtist(value.toLong, id))/*26.47*/ {_display_(Seq[Any](format.raw/*26.49*/("""
            """),format.raw/*27.13*/("""checked
        """)))}),format.raw/*28.10*/("""
        """),format.raw/*29.9*/("""/>"""),_display_(/*29.12*/genre),format.raw/*29.17*/("""<br>        
    """)))}),format.raw/*30.6*/("""  

    """),format.raw/*32.5*/("""<div class="form-group">
            """),_display_(/*33.14*/inputText(productForm("art_name"), '_label -> "", 
            'class -> "form-control input-xs", 'placeholder -> "Artist")),format.raw/*34.73*/("""
        """),format.raw/*35.9*/("""</div>


    <div class="form-group">
                """),_display_(/*39.18*/inputText(productForm("price"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Price")),format.raw/*40.76*/("""
            """),format.raw/*41.13*/("""</div>
        
    <div class="form-group">
                """),_display_(/*44.18*/inputText(productForm("stock"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Stock")),format.raw/*45.76*/("""
            """),format.raw/*46.13*/("""</div>

    <label>Image Upload</label>
    <input class="btn-sm btn-default" type="file" name="upload">
    <br><br>
  

    <div class="actions">
        <input type="submit" value="Update Product" class="btn btn-primary">
        <a href=""""),_display_(/*55.19*/routes/*55.25*/.AdminProductCtrl.listProduct(0)),format.raw/*55.57*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*59.3*/("""
""")))}),format.raw/*60.2*/("""
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
                  DATE: Tue Apr 03 18:15:53 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/adminProduct/updateProduct.scala.html
                  HASH: a06b2b99478db872180fbff9f37b9f755f6f9d7b
                  MATRIX: 664->1|702->33|739->64|1126->92|1280->175|1325->173|1352->192|1390->222|1428->223|1455->224|1518->262|1666->401|1706->403|1742->413|1755->417|1786->427|1819->433|1884->471|2034->600|2070->609|2147->659|2285->776|2320->784|2359->797|2412->834|2452->836|2488->845|2566->896|2592->901|2630->912|2676->949|2716->951|2757->964|2805->981|2841->990|2871->993|2897->998|2945->1016|2980->1024|3045->1062|3189->1185|3225->1194|3307->1249|3451->1372|3492->1385|3581->1447|3725->1570|3766->1583|4036->1826|4051->1832|4104->1864|4237->1967|4269->1969
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|38->6|38->6|39->7|41->9|42->10|42->10|44->12|44->12|44->12|46->14|47->15|48->16|49->17|52->20|53->21|54->22|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|59->27|60->28|61->29|61->29|61->29|62->30|64->32|65->33|66->34|67->35|71->39|72->40|73->41|76->44|77->45|78->46|87->55|87->55|87->55|91->59|92->60
                  -- GENERATED --
              */
          