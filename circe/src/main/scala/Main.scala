
import Codecs._
import io.circe._, io.circe.parser._, io.circe.syntax._

object Main extends App {
	println("hello world")
	println(decode[CC4](""" {"v1": 1} """))
}