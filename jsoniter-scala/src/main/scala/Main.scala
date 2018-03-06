
import Codecs._
import com.github.plokhotnyuk.jsoniter_scala.core._

object Main extends App {
	println(readFromArray[CC0]("""{"v0":0,"v1":"1","v2":2,"v3":3,"v4":4,"v5":5}""".getBytes))
}