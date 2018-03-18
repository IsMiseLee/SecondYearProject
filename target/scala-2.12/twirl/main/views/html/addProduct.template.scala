
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.products.Product],models.users.Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectForm: Form[models.products.Product],member: models.users.Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.74*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Project",member)/*5.28*/{_display_(Seq[Any](format.raw/*5.29*/(""" 
    """),format.raw/*6.5*/("""<p class="lead">Add Product</p>
    
    """),_display_(/*8.6*/form(action=routes.AdminProductCtrl.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.107*/{_display_(Seq[Any](format.raw/*8.108*/("""
      """),format.raw/*9.7*/("""<div class="container">
          
        
    """),_display_(/*12.6*/CSRF/*12.10*/.formField),format.raw/*12.20*/("""
    
    """),_display_(/*14.6*/inputText(projectForm("album_name"),'_label -> "Album name", 'class -> "form-control")),format.raw/*14.92*/("""
    """),_display_(/*15.6*/inputText(projectForm("year"),'_label -> "Year", 'class -> "form-control")),format.raw/*15.80*/("""
    """),_display_(/*16.6*/inputText(projectForm("type"),'_label -> "Type", 'class -> "form-control")),format.raw/*16.80*/("""
    """),_display_(/*17.6*/inputText(projectForm("price"),'_label -> "Price", 'class -> "form-control")),format.raw/*17.82*/("""
    """),_display_(/*18.6*/inputText(projectForm("stock"),'_label -> "Stock", 'class -> "form-control")),format.raw/*18.82*/("""
    
  
    
    
    """),format.raw/*23.5*/("""<div class="action"> 
      <input type="submit" value="Add Project" class="btn btn-primary">
      <a href=""""),_display_(/*25.17*/routes/*25.23*/.ProductCtrl.index()),format.raw/*25.43*/(""""> 
        <button type="button" class="btn btn-warning">Cancel</button>
      </a>
    </div>
    </div>
      </body>
    
    
    """)))}),format.raw/*33.6*/("""
    """)))}))
      }
    }
  }

  def render(projectForm:Form[models.products.Product],member:models.users.Member): play.twirl.api.HtmlFormat.Appendable = apply(projectForm,member)

  def f:((Form[models.products.Product],models.users.Member) => play.twirl.api.HtmlFormat.Appendable) = (projectForm,member) => apply(projectForm,member)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 18 16:36:29 GMT 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/addProduct.scala.html
                  HASH: bc6a6357b5d56c59f40a36ca9659bcd9dbec937d
                  MATRIX: 996->1|1141->76|1186->73|1214->92|1241->94|1275->120|1313->121|1345->127|1412->169|1522->270|1561->271|1594->278|1669->327|1682->331|1713->341|1750->352|1857->438|1889->444|1984->518|2016->524|2111->598|2143->604|2240->680|2272->686|2369->762|2419->785|2556->895|2571->901|2612->921|2778->1057
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|44->12|44->12|44->12|46->14|46->14|47->15|47->15|48->16|48->16|49->17|49->17|50->18|50->18|55->23|57->25|57->25|57->25|65->33
                  -- GENERATED --
              */
          