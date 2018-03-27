
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/SecondYearProject/conf/routes
// @DATE:Tue Mar 27 15:57:10 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProductCtrl_1: controllers.ProductCtrl,
  // @LINE:10
  LoginCtrl_4: controllers.security.LoginCtrl,
  // @LINE:15
  AdminProductCtrl_3: controllers.AdminProductCtrl,
  // @LINE:22
  ShopCartCtrl_0: controllers.ShopCartCtrl,
  // @LINE:31
  ArtistCtrl_2: controllers.ArtistCtrl,
  // @LINE:34
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProductCtrl_1: controllers.ProductCtrl,
    // @LINE:10
    LoginCtrl_4: controllers.security.LoginCtrl,
    // @LINE:15
    AdminProductCtrl_3: controllers.AdminProductCtrl,
    // @LINE:22
    ShopCartCtrl_0: controllers.ShopCartCtrl,
    // @LINE:31
    ArtistCtrl_2: controllers.ArtistCtrl,
    // @LINE:34
    Assets_5: controllers.Assets
  ) = this(errorHandler, ProductCtrl_1, LoginCtrl_4, AdminProductCtrl_3, ShopCartCtrl_0, ArtistCtrl_2, Assets_5, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductCtrl_1, LoginCtrl_4, AdminProductCtrl_3, ShopCartCtrl_0, ArtistCtrl_2, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProductCtrl.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aboutUs""", """controllers.ProductCtrl.aboutUs"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.security.LoginCtrl.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.security.LoginCtrl.loginSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.security.LoginCtrl.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProduct""", """controllers.AdminProductCtrl.addProduct()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProductSubmit""", """controllers.AdminProductCtrl.addProductSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/deleteProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateProduct(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProductSubmit/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateProductSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShopCartCtrl.showBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShopCartCtrl.addToBasket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShopCartCtrl.emptyBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShopCartCtrl.placeOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder/""" + "$" + """id<[^/]+>""", """controllers.ShopCartCtrl.viewOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShopCartCtrl.addOne(itemId:Long, pid:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShopCartCtrl.removeOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listArtist""", """controllers.ArtistCtrl.listArtist"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listProduct""", """controllers.ProductCtrl.listProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ProductCtrl_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProductCtrl_index0_invoker = createInvoker(
    ProductCtrl_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ProductCtrl_aboutUs1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aboutUs")))
  )
  private[this] lazy val controllers_ProductCtrl_aboutUs1_invoker = createInvoker(
    ProductCtrl_1.aboutUs,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "aboutUs",
      Nil,
      "GET",
      this.prefix + """aboutUs""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_security_LoginCtrl_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginCtrl_login2_invoker = createInvoker(
    LoginCtrl_4.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit3_invoker = createInvoker(
    LoginCtrl_4.loginSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_security_LoginCtrl_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_security_LoginCtrl_logout4_invoker = createInvoker(
    LoginCtrl_4.logout(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_AdminProductCtrl_addProduct5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProduct")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProduct5_invoker = createInvoker(
    AdminProductCtrl_3.addProduct(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addProduct",
      Nil,
      "GET",
      this.prefix + """Admin/addProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProductSubmit")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit6_invoker = createInvoker(
    AdminProductCtrl_3.addProductSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addProductSubmit",
      Nil,
      "POST",
      this.prefix + """Admin/addProductSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/deleteProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct7_invoker = createInvoker(
    AdminProductCtrl_3.deleteProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/deleteProduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_AdminProductCtrl_updateProduct8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProduct8_invoker = createInvoker(
    AdminProductCtrl_3.updateProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/updateProduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProductSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit9_invoker = createInvoker(
    AdminProductCtrl_3.updateProductSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "updateProductSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """Admin/updateProductSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ShopCartCtrl_showBasket10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShopCartCtrl_showBasket10_invoker = createInvoker(
    ShopCartCtrl_0.showBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShopCartCtrl",
      "showBasket",
      Nil,
      "GET",
      this.prefix + """showBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ShopCartCtrl_addToBasket11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShopCartCtrl_addToBasket11_invoker = createInvoker(
    ShopCartCtrl_0.addToBasket(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShopCartCtrl",
      "addToBasket",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addToBasket/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ShopCartCtrl_emptyBasket12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShopCartCtrl_emptyBasket12_invoker = createInvoker(
    ShopCartCtrl_0.emptyBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShopCartCtrl",
      "emptyBasket",
      Nil,
      "GET",
      this.prefix + """emptyBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ShopCartCtrl_placeOrder13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShopCartCtrl_placeOrder13_invoker = createInvoker(
    ShopCartCtrl_0.placeOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShopCartCtrl",
      "placeOrder",
      Nil,
      "GET",
      this.prefix + """placeOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ShopCartCtrl_viewOrder14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShopCartCtrl_viewOrder14_invoker = createInvoker(
    ShopCartCtrl_0.viewOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShopCartCtrl",
      "viewOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """viewOrder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ShopCartCtrl_addOne15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShopCartCtrl_addOne15_invoker = createInvoker(
    ShopCartCtrl_0.addOne(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShopCartCtrl",
      "addOne",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """addOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ShopCartCtrl_removeOne16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShopCartCtrl_removeOne16_invoker = createInvoker(
    ShopCartCtrl_0.removeOne(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShopCartCtrl",
      "removeOne",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ArtistCtrl_listArtist17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listArtist")))
  )
  private[this] lazy val controllers_ArtistCtrl_listArtist17_invoker = createInvoker(
    ArtistCtrl_2.listArtist,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArtistCtrl",
      "listArtist",
      Nil,
      "GET",
      this.prefix + """listArtist""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ProductCtrl_listProduct18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listProduct")))
  )
  private[this] lazy val controllers_ProductCtrl_listProduct18_invoker = createInvoker(
    ProductCtrl_1.listProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "listProduct",
      Nil,
      "GET",
      this.prefix + """listProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Assets_versioned19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned19_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ProductCtrl_index0_route(params@_) =>
      call { 
        controllers_ProductCtrl_index0_invoker.call(ProductCtrl_1.index)
      }
  
    // @LINE:7
    case controllers_ProductCtrl_aboutUs1_route(params@_) =>
      call { 
        controllers_ProductCtrl_aboutUs1_invoker.call(ProductCtrl_1.aboutUs)
      }
  
    // @LINE:10
    case controllers_security_LoginCtrl_login2_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_login2_invoker.call(LoginCtrl_4.login())
      }
  
    // @LINE:11
    case controllers_security_LoginCtrl_loginSubmit3_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_loginSubmit3_invoker.call(LoginCtrl_4.loginSubmit())
      }
  
    // @LINE:12
    case controllers_security_LoginCtrl_logout4_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_logout4_invoker.call(LoginCtrl_4.logout())
      }
  
    // @LINE:15
    case controllers_AdminProductCtrl_addProduct5_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addProduct5_invoker.call(AdminProductCtrl_3.addProduct())
      }
  
    // @LINE:16
    case controllers_AdminProductCtrl_addProductSubmit6_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addProductSubmit6_invoker.call(AdminProductCtrl_3.addProductSubmit())
      }
  
    // @LINE:17
    case controllers_AdminProductCtrl_deleteProduct7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_deleteProduct7_invoker.call(AdminProductCtrl_3.deleteProduct(id))
      }
  
    // @LINE:18
    case controllers_AdminProductCtrl_updateProduct8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProduct8_invoker.call(AdminProductCtrl_3.updateProduct(id))
      }
  
    // @LINE:19
    case controllers_AdminProductCtrl_updateProductSubmit9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProductSubmit9_invoker.call(AdminProductCtrl_3.updateProductSubmit(id))
      }
  
    // @LINE:22
    case controllers_ShopCartCtrl_showBasket10_route(params@_) =>
      call { 
        controllers_ShopCartCtrl_showBasket10_invoker.call(ShopCartCtrl_0.showBasket())
      }
  
    // @LINE:23
    case controllers_ShopCartCtrl_addToBasket11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShopCartCtrl_addToBasket11_invoker.call(ShopCartCtrl_0.addToBasket(id))
      }
  
    // @LINE:24
    case controllers_ShopCartCtrl_emptyBasket12_route(params@_) =>
      call { 
        controllers_ShopCartCtrl_emptyBasket12_invoker.call(ShopCartCtrl_0.emptyBasket())
      }
  
    // @LINE:25
    case controllers_ShopCartCtrl_placeOrder13_route(params@_) =>
      call { 
        controllers_ShopCartCtrl_placeOrder13_invoker.call(ShopCartCtrl_0.placeOrder())
      }
  
    // @LINE:26
    case controllers_ShopCartCtrl_viewOrder14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShopCartCtrl_viewOrder14_invoker.call(ShopCartCtrl_0.viewOrder(id))
      }
  
    // @LINE:27
    case controllers_ShopCartCtrl_addOne15_route(params@_) =>
      call(params.fromPath[Long]("itemId", None), params.fromQuery[Long]("pid", None)) { (itemId, pid) =>
        controllers_ShopCartCtrl_addOne15_invoker.call(ShopCartCtrl_0.addOne(itemId, pid))
      }
  
    // @LINE:28
    case controllers_ShopCartCtrl_removeOne16_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShopCartCtrl_removeOne16_invoker.call(ShopCartCtrl_0.removeOne(itemId))
      }
  
    // @LINE:31
    case controllers_ArtistCtrl_listArtist17_route(params@_) =>
      call { 
        controllers_ArtistCtrl_listArtist17_invoker.call(ArtistCtrl_2.listArtist)
      }
  
    // @LINE:32
    case controllers_ProductCtrl_listProduct18_route(params@_) =>
      call { 
        controllers_ProductCtrl_listProduct18_invoker.call(ProductCtrl_1.listProduct)
      }
  
    // @LINE:34
    case controllers_Assets_versioned19_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned19_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
