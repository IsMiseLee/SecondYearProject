
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
    """),format.raw/*6.5*/("""<p class="lead">Want to sign up ? </p>
    
    """),_display_(/*8.6*/form(action=routes.ProductCtrl.registerSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.100*/{_display_(Seq[Any](format.raw/*8.101*/("""
      """),format.raw/*9.7*/("""<div class="container">
          
        
          
            """),_display_(/*13.14*/CSRF/*13.18*/.formField),format.raw/*13.28*/("""

            """),format.raw/*15.13*/("""<div class="form-group">
                """),_display_(/*16.18*/inputText(registerForm("email"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*17.76*/("""
            """),format.raw/*18.13*/("""</div>
            <div class="form-group">
                """),_display_(/*20.18*/inputPassword(registerForm("password"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*21.79*/("""
            """),format.raw/*22.13*/("""</div>

            <div class="form-group">
                """),_display_(/*25.18*/inputText(registerForm("role"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "role")),format.raw/*26.75*/("""
            """),format.raw/*27.13*/("""</div>

            <div class="form-group">
                """),_display_(/*30.18*/inputText(registerForm("name"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "name")),format.raw/*31.75*/("""
            """),format.raw/*32.13*/("""</div>
            
          
        """)))}),format.raw/*35.10*/("""
  
   
  
    
    
    """),format.raw/*41.5*/("""<div class="action"> 
      <input type="submit" value="Register" class="btn btn-primary">
      <a href=""""),_display_(/*43.17*/routes/*43.23*/.AdminProductCtrl.listProduct(0)),format.raw/*43.55*/(""""> 
        <button type="button" class="btn btn-warning">Cancel</button>
      </a>
    </div>
    </div>
      </body>
    
    
    
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
                  DATE: Thu Apr 05 20:45:24 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/Register/register.scala.html
                  HASH: b5278c593b0f0231e094f992e89ce14a2394060f
                  MATRIX: 979->1|1093->45|1138->42|1166->61|1193->63|1217->79|1255->80|1287->86|1361->135|1464->229|1503->230|1536->237|1631->305|1644->309|1675->319|1717->333|1786->375|1931->499|1972->512|2060->573|2215->707|2256->720|2345->782|2488->904|2529->917|2618->979|2761->1101|2802->1114|2873->1154|2925->1179|3059->1286|3074->1292|3127->1324
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|45->13|45->13|45->13|47->15|48->16|49->17|50->18|52->20|53->21|54->22|57->25|58->26|59->27|62->30|63->31|64->32|67->35|73->41|75->43|75->43|75->43
                  -- GENERATED --
              */
          