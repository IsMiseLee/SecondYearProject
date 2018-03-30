
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( member: models.users.Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),_display_(/*3.2*/main("Welcome to Play",member)/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""

  
  
""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(member:models.users.Member): play.twirl.api.HtmlFormat.Appendable = apply(member)

  def f:((models.users.Member) => play.twirl.api.HtmlFormat.Appendable) = (member) => apply(member)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 30 20:58:38 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/index.scala.html
                  HASH: 635e81c4e0626143b7952269e31d79c2a8d8f043
                  MATRIX: 961->1|1086->31|1114->34|1152->64|1191->66|1229->75
                  LINES: 28->1|33->1|35->3|35->3|35->3|39->7
                  -- GENERATED --
              */
          