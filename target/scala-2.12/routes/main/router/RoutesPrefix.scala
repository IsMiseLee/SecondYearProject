
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/SecondYearProject/conf/routes
// @DATE:Tue Mar 27 19:00:52 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
