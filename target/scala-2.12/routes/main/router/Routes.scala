
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/SecondYearProject/conf/routes
// @DATE:Wed Mar 28 17:15:04 IST 2018

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
  // @LINE:11
  LoginCtrl_3: controllers.security.LoginCtrl,
  // @LINE:16
  AdminProductCtrl_2: controllers.AdminProductCtrl,
  // @LINE:23
  ShopCartCtrl_0: controllers.ShopCartCtrl,
  // @LINE:35
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProductCtrl_1: controllers.ProductCtrl,
    // @LINE:11
    LoginCtrl_3: controllers.security.LoginCtrl,
    // @LINE:16
    AdminProductCtrl_2: controllers.AdminProductCtrl,
    // @LINE:23
    ShopCartCtrl_0: controllers.ShopCartCtrl,
    // @LINE:35
    Assets_4: controllers.Assets
  ) = this(errorHandler, ProductCtrl_1, LoginCtrl_3, AdminProductCtrl_2, ShopCartCtrl_0, Assets_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductCtrl_1, LoginCtrl_3, AdminProductCtrl_2, ShopCartCtrl_0, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProductCtrl.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aboutUs""", """controllers.ProductCtrl.aboutUs"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productDetails/""" + "$" + """id<[^/]+>""", """controllers.ProductCtrl.productDetails(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listProducts""", """controllers.ProductCtrl.listProducts(cat:Long ?= 0, filter:String ?= "")"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewAlbums""", """controllers.ProductCtrl.viewAlbums"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listProduct""", """controllers.AdminProductCtrl.listProduct"""),
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

  // @LINE:8
  private[this] lazy val controllers_ProductCtrl_productDetails2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productDetails/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductCtrl_productDetails2_invoker = createInvoker(
    ProductCtrl_1.productDetails(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "productDetails",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """productDetails/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ProductCtrl_listProducts3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listProducts")))
  )
  private[this] lazy val controllers_ProductCtrl_listProducts3_invoker = createInvoker(
    ProductCtrl_1.listProducts(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "listProducts",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """listProducts""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_security_LoginCtrl_login4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginCtrl_login4_invoker = createInvoker(
    LoginCtrl_3.login(),
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

  // @LINE:12
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit5_invoker = createInvoker(
    LoginCtrl_3.loginSubmit(),
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

  // @LINE:13
  private[this] lazy val controllers_security_LoginCtrl_logout6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_security_LoginCtrl_logout6_invoker = createInvoker(
    LoginCtrl_3.logout(),
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

  // @LINE:16
  private[this] lazy val controllers_AdminProductCtrl_addProduct7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProduct")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProduct7_invoker = createInvoker(
    AdminProductCtrl_2.addProduct(),
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

  // @LINE:17
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProductSubmit")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit8_invoker = createInvoker(
    AdminProductCtrl_2.addProductSubmit(),
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

  // @LINE:18
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/deleteProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct9_invoker = createInvoker(
    AdminProductCtrl_2.deleteProduct(fakeValue[Long]),
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

  // @LINE:19
  private[this] lazy val controllers_AdminProductCtrl_updateProduct10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProduct10_invoker = createInvoker(
    AdminProductCtrl_2.updateProduct(fakeValue[Long]),
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

  // @LINE:20
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProductSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit11_invoker = createInvoker(
    AdminProductCtrl_2.updateProductSubmit(fakeValue[Long]),
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

  // @LINE:23
  private[this] lazy val controllers_ShopCartCtrl_showBasket12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShopCartCtrl_showBasket12_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_ShopCartCtrl_addToBasket13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShopCartCtrl_addToBasket13_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_ShopCartCtrl_emptyBasket14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShopCartCtrl_emptyBasket14_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_ShopCartCtrl_placeOrder15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShopCartCtrl_placeOrder15_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_ShopCartCtrl_viewOrder16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShopCartCtrl_viewOrder16_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_ShopCartCtrl_addOne17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShopCartCtrl_addOne17_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_ShopCartCtrl_removeOne18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShopCartCtrl_removeOne18_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_ProductCtrl_viewAlbums19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewAlbums")))
  )
  private[this] lazy val controllers_ProductCtrl_viewAlbums19_invoker = createInvoker(
    ProductCtrl_1.viewAlbums,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "viewAlbums",
      Nil,
      "GET",
      this.prefix + """viewAlbums""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_AdminProductCtrl_listProduct20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listProduct")))
  )
  private[this] lazy val controllers_AdminProductCtrl_listProduct20_invoker = createInvoker(
    AdminProductCtrl_2.listProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "listProduct",
      Nil,
      "GET",
      this.prefix + """listProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Assets_versioned21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned21_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
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
  
    // @LINE:8
    case controllers_ProductCtrl_productDetails2_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductCtrl_productDetails2_invoker.call(ProductCtrl_1.productDetails(id))
      }
  
    // @LINE:9
    case controllers_ProductCtrl_listProducts3_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_ProductCtrl_listProducts3_invoker.call(ProductCtrl_1.listProducts(cat, filter))
      }
  
    // @LINE:11
    case controllers_security_LoginCtrl_login4_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_login4_invoker.call(LoginCtrl_3.login())
      }
  
    // @LINE:12
    case controllers_security_LoginCtrl_loginSubmit5_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_loginSubmit5_invoker.call(LoginCtrl_3.loginSubmit())
      }
  
    // @LINE:13
    case controllers_security_LoginCtrl_logout6_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_logout6_invoker.call(LoginCtrl_3.logout())
      }
  
    // @LINE:16
    case controllers_AdminProductCtrl_addProduct7_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addProduct7_invoker.call(AdminProductCtrl_2.addProduct())
      }
  
    // @LINE:17
    case controllers_AdminProductCtrl_addProductSubmit8_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addProductSubmit8_invoker.call(AdminProductCtrl_2.addProductSubmit())
      }
  
    // @LINE:18
    case controllers_AdminProductCtrl_deleteProduct9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_deleteProduct9_invoker.call(AdminProductCtrl_2.deleteProduct(id))
      }
  
    // @LINE:19
    case controllers_AdminProductCtrl_updateProduct10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProduct10_invoker.call(AdminProductCtrl_2.updateProduct(id))
      }
  
    // @LINE:20
    case controllers_AdminProductCtrl_updateProductSubmit11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProductSubmit11_invoker.call(AdminProductCtrl_2.updateProductSubmit(id))
      }
  
    // @LINE:23
    case controllers_ShopCartCtrl_showBasket12_route(params@_) =>
      call { 
        controllers_ShopCartCtrl_showBasket12_invoker.call(ShopCartCtrl_0.showBasket())
      }
  
    // @LINE:24
    case controllers_ShopCartCtrl_addToBasket13_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShopCartCtrl_addToBasket13_invoker.call(ShopCartCtrl_0.addToBasket(id))
      }
  
    // @LINE:25
    case controllers_ShopCartCtrl_emptyBasket14_route(params@_) =>
      call { 
        controllers_ShopCartCtrl_emptyBasket14_invoker.call(ShopCartCtrl_0.emptyBasket())
      }
  
    // @LINE:26
    case controllers_ShopCartCtrl_placeOrder15_route(params@_) =>
      call { 
        controllers_ShopCartCtrl_placeOrder15_invoker.call(ShopCartCtrl_0.placeOrder())
      }
  
    // @LINE:27
    case controllers_ShopCartCtrl_viewOrder16_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShopCartCtrl_viewOrder16_invoker.call(ShopCartCtrl_0.viewOrder(id))
      }
  
    // @LINE:28
    case controllers_ShopCartCtrl_addOne17_route(params@_) =>
      call(params.fromPath[Long]("itemId", None), params.fromQuery[Long]("pid", None)) { (itemId, pid) =>
        controllers_ShopCartCtrl_addOne17_invoker.call(ShopCartCtrl_0.addOne(itemId, pid))
      }
  
    // @LINE:29
    case controllers_ShopCartCtrl_removeOne18_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShopCartCtrl_removeOne18_invoker.call(ShopCartCtrl_0.removeOne(itemId))
      }
  
    // @LINE:32
    case controllers_ProductCtrl_viewAlbums19_route(params@_) =>
      call { 
        controllers_ProductCtrl_viewAlbums19_invoker.call(ProductCtrl_1.viewAlbums)
      }
  
    // @LINE:33
    case controllers_AdminProductCtrl_listProduct20_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_listProduct20_invoker.call(AdminProductCtrl_2.listProduct)
      }
  
    // @LINE:35
    case controllers_Assets_versioned21_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned21_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
