import scala.actors._
import scala.actors.Actor._

case object Poke
case object Feed
case object Talk

class Kid() extends Actor {
  def act() {
    loop {
      react {
        case Poke => {
          println("Ow...")
          println("Quit it...")
        }
        case Feed => {
          println("Gurgle...")
          println("Burp...")
        }
        case Talk => {
          println("Hello...")
        }
      }
    }
  }
}
