
package views.html.Register

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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.users.Member],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registerForm: Form[models.users.Member]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Register")/*5.18*/{_display_(Seq[Any](format.raw/*5.19*/(""" 
    """),format.raw/*6.5*/("""<p class="lead">Add Product</p>
    
    """),_display_(/*8.6*/form(action=routes.ProductCtrl.registerSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.100*/{_display_(Seq[Any](format.raw/*8.101*/("""
      """),format.raw/*9.7*/("""<div class="container">
          
        
    """),_display_(/*12.6*/CSRF/*12.10*/.formField),format.raw/*12.20*/("""
    
    """),_display_(/*14.6*/inputText(registerForm("email"),'_label -> "Email", 'class -> "form-control")),format.raw/*14.83*/("""
    """),_display_(/*15.6*/inputText(registerForm("role"),'_label -> "Role", 'class -> "form-control")),format.raw/*15.81*/("""    
    """),_display_(/*16.6*/inputText(registerForm("password"),'_label -> "Password", 'class -> "form-control")),format.raw/*16.89*/("""
    """),_display_(/*17.6*/inputText(registerForm("name"),'_label -> "Name", 'class -> "form-control")),format.raw/*17.81*/("""     
   
  
    
    
    """),format.raw/*22.5*/("""<div class="action"> 
      <input type="submit" value="Register" class="btn btn-primary">
      <a href=""""),_display_(/*24.17*/routes/*24.23*/.AdminProductCtrl.listProduct(0)),format.raw/*24.55*/(""""> 
        <button type="button" class="btn btn-warning">Cancel</button>
      </a>
    </div>
    </div>
      </body>
    
    
    """)))}),format.raw/*32.6*/("""
    """)))}))
      }
    }
  }

  def render(registerForm:Form[models.users.Member]): play.twirl.api.HtmlFormat.Appendable = apply(registerForm)

  def f:((Form[models.users.Member]) => play.twirl.api.HtmlFormat.Appendable) = (registerForm) => apply(registerForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 02 16:00:24 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/Register/register.scala.html
                  HASH: b3ec8b56dcf2a1dce264c31b98cacb06d9ef88a6
                  MATRIX: 979->1|1093->45|1138->42|1166->61|1193->63|1217->79|1255->80|1287->86|1354->128|1457->222|1496->223|1529->230|1604->279|1617->283|1648->293|1685->304|1783->381|1815->387|1911->462|1947->472|2051->555|2083->561|2179->636|2233->663|2367->770|2382->776|2435->808|2601->944
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|44->12|44->12|44->12|46->14|46->14|47->15|47->15|48->16|48->16|49->17|49->17|54->22|56->24|56->24|56->24|64->32
                  -- GENERATED --
              */
          