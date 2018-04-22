
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
/*1.2*/import models.products.Artist
/*2.2*/import models.products.Product
/*3.2*/import models.users.Member

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.products.Product],models.users.Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(productForm: Form[models.products.Product],member: models.users.Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*6.2*/import helper._


Seq[Any](format.raw/*4.74*/("""

"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("Add Project",member)/*8.28*/{_display_(Seq[Any](format.raw/*8.29*/(""" 
    """),format.raw/*9.5*/("""<p class="lead">Add Product</p>
    
    """),_display_(/*11.6*/form(action=routes.AdminProductCtrl.addProductSubmit(), 'class -> "form-vertical", 'role -> "form",'enctype -> "multipart/form-data")/*11.139*/{_display_(Seq[Any](format.raw/*11.140*/("""
      """),format.raw/*12.7*/("""<div class="container">
          
        
    """),_display_(/*15.6*/CSRF/*15.10*/.formField),format.raw/*15.20*/("""
    
    """),format.raw/*17.5*/("""<div class="form-group">
        """),_display_(/*18.10*/inputText(productForm("album_name"), '_label -> "Album Name", 
        'class -> "form-control input-xs", 'placeholder -> "")),format.raw/*19.63*/("""
    """),format.raw/*20.5*/("""</div>

    <label>Genre</label>
    <br>
    """),_display_(/*24.6*/for((value, genre) <- Artist.options) yield /*24.43*/ {_display_(Seq[Any](format.raw/*24.45*/("""
      """),format.raw/*25.7*/("""<input type="checkbox" name="artSelect[]" value=""""),_display_(/*25.57*/value),format.raw/*25.62*/(""""
      
      />"""),_display_(/*27.10*/genre),format.raw/*27.15*/("""<br>        
  """)))}),format.raw/*28.4*/("""
  """),format.raw/*29.3*/("""<div class="form-group">
      """),_display_(/*30.8*/inputText(productForm("year"), '_label -> "Year", 
      'class -> "form-control input-xs", 'placeholder -> "")),format.raw/*31.61*/("""
  """),format.raw/*32.3*/("""</div>
  
    <div class="form-group">
        """),_display_(/*35.10*/inputText(productForm("art_name"), '_label -> "Artist Name", 
        'class -> "form-control input-xs", 'placeholder -> "")),format.raw/*36.63*/("""
    """),format.raw/*37.5*/("""</div>
    <div class="form-group">
        """),_display_(/*39.10*/inputText(productForm("price"), '_label -> "Price", 
        'class -> "form-control input-xs", 'placeholder -> "")),format.raw/*40.63*/("""
    """),format.raw/*41.5*/("""</div>

    <div class="form-group">
        """),_display_(/*44.10*/inputText(productForm("stock"), '_label -> "Stock", 
        'class -> "form-control input-xs", 'placeholder -> "")),format.raw/*45.63*/("""
    """),format.raw/*46.5*/("""</div>
  
    
    <label>Image Upload</label>
    <input class="btn-sm btn-default" type="file" name="upload">
    <br><br>
  
    
    
    <div class="action"> 
      <input type="submit" value="Add Product" class="btn btn-primary">
      <a href=""""),_display_(/*57.17*/routes/*57.23*/.AdminProductCtrl.listProduct(0)),format.raw/*57.55*/(""""> 
        <button type="button" class="btn btn-warning">Cancel</button>
      </a>
    </div>
    </div>
      </body>
    
    
    """)))}),format.raw/*65.6*/("""
    """)))}))
      }
    }
  }

  def render(productForm:Form[models.products.Product],member:models.users.Member): play.twirl.api.HtmlFormat.Appendable = apply(productForm,member)

  def f:((Form[models.products.Product],models.users.Member) => play.twirl.api.HtmlFormat.Appendable) = (productForm,member) => apply(productForm,member)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 18:34:41 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/adminProduct/addProduct.scala.html
                  HASH: 47a1eee8e200452f43d57f2e72226f92039ce75a
                  MATRIX: 664->1|701->32|739->64|1118->92|1263->167|1308->164|1336->183|1363->185|1397->211|1435->212|1467->218|1535->260|1678->393|1718->394|1752->401|1827->450|1840->454|1871->464|1908->474|1969->508|2115->633|2147->638|2220->685|2273->722|2313->724|2347->731|2424->781|2450->786|2495->804|2521->809|2567->825|2597->828|2655->860|2787->971|2817->974|2892->1022|3037->1146|3069->1151|3141->1196|3277->1311|3309->1316|3382->1362|3518->1477|3550->1482|3829->1734|3844->1740|3897->1772|4063->1908
                  LINES: 24->1|25->2|26->3|31->4|34->6|37->4|39->7|40->8|40->8|40->8|41->9|43->11|43->11|43->11|44->12|47->15|47->15|47->15|49->17|50->18|51->19|52->20|56->24|56->24|56->24|57->25|57->25|57->25|59->27|59->27|60->28|61->29|62->30|63->31|64->32|67->35|68->36|69->37|71->39|72->40|73->41|76->44|77->45|78->46|89->57|89->57|89->57|97->65
                  -- GENERATED --
              */
          