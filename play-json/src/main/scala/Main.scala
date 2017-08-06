
import Codecs._
import play.api.libs.json.Json

object Main extends App {
	println(Json.parse(""" {"v1": 1} """).validate[CC3])
}