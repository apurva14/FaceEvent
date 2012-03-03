package faceevent

import org.scalatra._
import net.liftweb.json._

/**
 * Created by IntelliJ IDEA.
 * User: apurva
 * Date: 3/3/12
 * Time: 1:48 AM
 * To change this template use File | Settings | File Templates.
 */

class FaceEventServlet extends ScalatraServlet {
  implicit val formats = DefaultFormats

  post("/event") {

  }

  def render(content: AnyRef) = net.liftweb.json.Serialization.write(content)
}
