
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

    """),format.raw/*12.33*/("""

    """),_display_(/*14.6*/CSRF/*14.10*/.formField),format.raw/*14.20*/("""

  
    """),format.raw/*17.5*/("""<div class="form-group">
            """),_display_(/*18.14*/inputText(productForm("album_name"), '_label -> "Album name", 
            'class -> "form-control input-xs", 'placeholder -> "")),format.raw/*19.67*/("""
        """),format.raw/*20.9*/("""</div>
 
    <div class="form-group">
            """),_display_(/*23.14*/inputText(productForm("year"), '_label -> "Year", 
            'class -> "form-control input-xs", 'placeholder -> "")),format.raw/*24.67*/("""
       """),format.raw/*25.8*/("""</div>

       <label>Genre</label>
       <br>
    """),_display_(/*29.6*/for((value, genre) <- Artist.options) yield /*29.43*/ {_display_(Seq[Any](format.raw/*29.45*/("""
        """),format.raw/*30.9*/("""<input type="checkbox" genre="artSelect[]" value=""""),_display_(/*30.60*/value),format.raw/*30.65*/(""""
        """),_display_(/*31.10*/if(Artist.inArtist(value.toLong, id))/*31.47*/ {_display_(Seq[Any](format.raw/*31.49*/("""
            """),format.raw/*32.13*/("""checked
        """)))}),format.raw/*33.10*/("""
        """),format.raw/*34.9*/("""/>"""),_display_(/*34.12*/genre),format.raw/*34.17*/("""<br>        
    """)))}),format.raw/*35.6*/("""  
    
    """),format.raw/*37.5*/("""<div class="form-group">
            """),_display_(/*38.14*/inputText(productForm("art_name"), '_label -> "Artist Name", 
            'class -> "form-control input-xs", 'placeholder -> "")),format.raw/*39.67*/("""
        """),format.raw/*40.9*/("""</div>


    <div class="form-group">
                """),_display_(/*44.18*/inputText(productForm("price"), '_label -> "Price", 
                'class -> "form-control input-xs", 'placeholder -> "")),format.raw/*45.71*/("""
            """),format.raw/*46.13*/("""</div>
        
    <div class="form-group">
                """),_display_(/*49.18*/inputText(productForm("stock"), '_label -> "Stock", 
                'class -> "form-control input-xs", 'placeholder -> "")),format.raw/*50.71*/("""
            """),format.raw/*51.13*/("""</div>

    <label>Image Upload</label>
    <input class="btn-sm btn-default" type="file" name="upload">
    <br><br>
  

    <div class="actions">
        <input type="submit" value="Update Product" class="btn btn-primary">
        <a href=""""),_display_(/*60.19*/routes/*60.25*/.AdminProductCtrl.listProduct(0)),format.raw/*60.57*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*64.3*/("""
""")))}),format.raw/*65.2*/("""
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
                  DATE: Sun Apr 22 18:34:41 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/adminProduct/updateProduct.scala.html
                  HASH: 82ef35d9a2c4754df2f46bc19cbfea426fcc087d
                  MATRIX: 664->1|702->33|739->64|1126->92|1280->175|1325->173|1352->192|1390->222|1428->223|1455->224|1518->262|1666->401|1706->403|1740->437|1773->444|1786->448|1817->458|1853->467|1918->505|2068->634|2104->643|2182->694|2320->811|2355->819|2434->872|2487->909|2527->911|2563->920|2641->971|2667->976|2705->987|2751->1024|2791->1026|2832->1039|2880->1056|2916->1065|2946->1068|2972->1073|3020->1091|3059->1103|3124->1141|3273->1269|3309->1278|3391->1333|3535->1456|3576->1469|3665->1531|3809->1654|3850->1667|4120->1910|4135->1916|4188->1948|4321->2051|4353->2053
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|38->6|38->6|39->7|41->9|42->10|42->10|44->12|46->14|46->14|46->14|49->17|50->18|51->19|52->20|55->23|56->24|57->25|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|65->33|66->34|66->34|66->34|67->35|69->37|70->38|71->39|72->40|76->44|77->45|78->46|81->49|82->50|83->51|92->60|92->60|92->60|96->64|97->65
                  -- GENERATED --
              */
          