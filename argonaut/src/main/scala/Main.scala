
import Codecs._
import argonaut._
import Argonaut._

object Main extends App {
	println("hello world")
	println(""" {"v1": 1} """.decodeEither[CC4])
}