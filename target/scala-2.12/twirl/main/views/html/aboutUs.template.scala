
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

object aboutUs extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( member: models.users.Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),_display_(/*3.2*/main("About Us",member)/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  

  """),format.raw/*6.3*/("""<div class="container">
    <div class="row">
      <div class="col-sm-4">
        <h1>About us </h1>
      <p>We are the newest music marketplace. We strive to give the best music shopping experience around</p>
      <p>We hope you enjoy your stay </p>
<br><br>
      <p>Contact us : 09478746527645</p>
      <br><br>
      <br><br>
      <p>
        <a href=""""),_display_(/*17.19*/routes/*17.25*/.ProductCtrl.listProducts()),format.raw/*17.52*/(""""> 
          <button class="btn btn-primary">Click to view Albums</button>
        </a>
      </p>
    </div>
      <div class="col-sm-8">

      <img src="/assets/images/aboutus.png" >

    </div>
    </div>
  </div>
  
""")))}))
      }
    }
  }

  def render(member:models.users.Member): play.twirl.api.HtmlFormat.Appendable = apply(member)

  def f:((models.users.Member) => play.twirl.api.HtmlFormat.Appendable) = (member) => apply(member)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 04 18:07:55 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/aboutUs.scala.html
                  HASH: bd3f481c75b73a4aaeeea6d3bfd33f0a37a5ef95
                  MATRIX: 963->1|1088->31|1116->34|1147->57|1186->59|1219->66|1608->428|1623->434|1671->461
                  LINES: 28->1|33->1|35->3|35->3|35->3|38->6|49->17|49->17|49->17
                  -- GENERATED --
              */
          