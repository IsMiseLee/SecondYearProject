
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/SecondYearProject/conf/routes
// @DATE:Sun Apr 22 18:34:41 IST 2018

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
  // @LINE:17
  AdminProductCtrl_2: controllers.AdminProductCtrl,
  // @LINE:24
  ShopCartCtrl_0: controllers.ShopCartCtrl,
  // @LINE:36
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProductCtrl_1: controllers.ProductCtrl,
    // @LINE:11
    LoginCtrl_3: controllers.security.LoginCtrl,
    // @LINE:17
    AdminProductCtrl_2: controllers.AdminProductCtrl,
    // @LINE:24
    ShopCartCtrl_0: controllers.ShopCartCtrl,
    // @LINE:36
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.ProductCtrl.register()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerSubmit""", """controllers.ProductCtrl.registerSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProduct""", """controllers.AdminProductCtrl.addProduct()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProductSubmit""", """controllers.AdminProductCtrl.addProductSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/deleteProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateProduct(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProductSubmit/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateProductSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShopCartCtrl.showBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShopCartCtrl.addToBasket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShopCartCtrl.emptyBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShopCartCtrl.placeOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder""", """controllers.ShopCartCtrl.viewOrder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShopCartCtrl.addOne(itemId:Long, pid:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShopCartCtrl.removeOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder""", """controllers.ProductCtrl.viewOrder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewAlbums""", """controllers.ProductCtrl.viewAlbums"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listProduct""", """controllers.AdminProductCtrl.listProduct(id:Long)"""),
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

  // @LINE:14
  private[this] lazy val controllers_ProductCtrl_register7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_ProductCtrl_register7_invoker = createInvoker(
    ProductCtrl_1.register(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "register",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ProductCtrl_registerSubmit8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerSubmit")))
  )
  private[this] lazy val controllers_ProductCtrl_registerSubmit8_invoker = createInvoker(
    ProductCtrl_1.registerSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "registerSubmit",
      Nil,
      "POST",
      this.prefix + """registerSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_AdminProductCtrl_addProduct9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProduct")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProduct9_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProductSubmit")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit10_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/deleteProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct11_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_AdminProductCtrl_updateProduct12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProduct12_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProductSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit13_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_ShopCartCtrl_showBasket14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShopCartCtrl_showBasket14_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_ShopCartCtrl_addToBasket15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShopCartCtrl_addToBasket15_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_ShopCartCtrl_emptyBasket16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShopCartCtrl_emptyBasket16_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_ShopCartCtrl_placeOrder17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShopCartCtrl_placeOrder17_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_ShopCartCtrl_viewOrder18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder")))
  )
  private[this] lazy val controllers_ShopCartCtrl_viewOrder18_invoker = createInvoker(
    ShopCartCtrl_0.viewOrder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShopCartCtrl",
      "viewOrder",
      Nil,
      "GET",
      this.prefix + """viewOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ShopCartCtrl_addOne19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShopCartCtrl_addOne19_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_ShopCartCtrl_removeOne20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShopCartCtrl_removeOne20_invoker = createInvoker(
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
  private[this] lazy val controllers_ProductCtrl_viewOrder21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder")))
  )
  private[this] lazy val controllers_ProductCtrl_viewOrder21_invoker = createInvoker(
    ProductCtrl_1.viewOrder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "viewOrder",
      Nil,
      "GET",
      this.prefix + """viewOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ProductCtrl_viewAlbums22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewAlbums")))
  )
  private[this] lazy val controllers_ProductCtrl_viewAlbums22_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_AdminProductCtrl_listProduct23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listProduct")))
  )
  private[this] lazy val controllers_AdminProductCtrl_listProduct23_invoker = createInvoker(
    AdminProductCtrl_2.listProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "listProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """listProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Assets_versioned24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned24_invoker = createInvoker(
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
  
    // @LINE:14
    case controllers_ProductCtrl_register7_route(params@_) =>
      call { 
        controllers_ProductCtrl_register7_invoker.call(ProductCtrl_1.register())
      }
  
    // @LINE:15
    case controllers_ProductCtrl_registerSubmit8_route(params@_) =>
      call { 
        controllers_ProductCtrl_registerSubmit8_invoker.call(ProductCtrl_1.registerSubmit())
      }
  
    // @LINE:17
    case controllers_AdminProductCtrl_addProduct9_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addProduct9_invoker.call(AdminProductCtrl_2.addProduct())
      }
  
    // @LINE:18
    case controllers_AdminProductCtrl_addProductSubmit10_route(params@_) =>
      call { 
        controllers_AdminProductCtrl_addProductSubmit10_invoker.call(AdminProductCtrl_2.addProductSubmit())
      }
  
    // @LINE:19
    case controllers_AdminProductCtrl_deleteProduct11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_deleteProduct11_invoker.call(AdminProductCtrl_2.deleteProduct(id))
      }
  
    // @LINE:20
    case controllers_AdminProductCtrl_updateProduct12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProduct12_invoker.call(AdminProductCtrl_2.updateProduct(id))
      }
  
    // @LINE:21
    case controllers_AdminProductCtrl_updateProductSubmit13_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProductSubmit13_invoker.call(AdminProductCtrl_2.updateProductSubmit(id))
      }
  
    // @LINE:24
    case controllers_ShopCartCtrl_showBasket14_route(params@_) =>
      call { 
        controllers_ShopCartCtrl_showBasket14_invoker.call(ShopCartCtrl_0.showBasket())
      }
  
    // @LINE:25
    case controllers_ShopCartCtrl_addToBasket15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShopCartCtrl_addToBasket15_invoker.call(ShopCartCtrl_0.addToBasket(id))
      }
  
    // @LINE:26
    case controllers_ShopCartCtrl_emptyBasket16_route(params@_) =>
      call { 
        controllers_ShopCartCtrl_emptyBasket16_invoker.call(ShopCartCtrl_0.emptyBasket())
      }
  
    // @LINE:27
    case controllers_ShopCartCtrl_placeOrder17_route(params@_) =>
      call { 
        controllers_ShopCartCtrl_placeOrder17_invoker.call(ShopCartCtrl_0.placeOrder())
      }
  
    // @LINE:28
    case controllers_ShopCartCtrl_viewOrder18_route(params@_) =>
      call { 
        controllers_ShopCartCtrl_viewOrder18_invoker.call(ShopCartCtrl_0.viewOrder)
      }
  
    // @LINE:29
    case controllers_ShopCartCtrl_addOne19_route(params@_) =>
      call(params.fromPath[Long]("itemId", None), params.fromQuery[Long]("pid", None)) { (itemId, pid) =>
        controllers_ShopCartCtrl_addOne19_invoker.call(ShopCartCtrl_0.addOne(itemId, pid))
      }
  
    // @LINE:30
    case controllers_ShopCartCtrl_removeOne20_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShopCartCtrl_removeOne20_invoker.call(ShopCartCtrl_0.removeOne(itemId))
      }
  
    // @LINE:32
    case controllers_ProductCtrl_viewOrder21_route(params@_) =>
      call { 
        controllers_ProductCtrl_viewOrder21_invoker.call(ProductCtrl_1.viewOrder)
      }
  
    // @LINE:33
    case controllers_ProductCtrl_viewAlbums22_route(params@_) =>
      call { 
        controllers_ProductCtrl_viewAlbums22_invoker.call(ProductCtrl_1.viewAlbums)
      }
  
    // @LINE:34
    case controllers_AdminProductCtrl_listProduct23_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_listProduct23_invoker.call(AdminProductCtrl_2.listProduct(id))
      }
  
    // @LINE:36
    case controllers_Assets_versioned24_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned24_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
