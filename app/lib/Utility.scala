package lib

object Utility {
  def isLogOnly() = {
    scala.util.Properties.envOrElse("GUWHO_LOGONLY", "true").toBoolean
  }
}
