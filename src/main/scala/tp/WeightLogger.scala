package tp

import scalaj.http
import scalaj.http._

object WeightLogger {

  def logWeight: Unit = {
    val tpResponse: HttpResponse[String] = Http("https://www.trainingpeaks.com/tpwebservices/service.asmx/LogWeight")
      .param("username","beritou")
      .param("password","rbler11#TP")
      .param("date","08-13-15")
      .param("weightInKg","82")
      .asString
    tpResponse.body
    tpResponse.code
    tpResponse.headers
  }
}
