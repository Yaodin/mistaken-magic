package mistaken.magic.core

import scala.io.{Source, StdIn}

object App extends App {

  override def main(args: Array[String]) {

    while(true) {
      val input = StdIn.readLine()
      println(input)
    }
  }

  def loadSpells(file: String): Unit = {
    val stream = getClass().getResourceAsStream(file)
    val lines = Source.fromInputStream(stream).getLines()

    for (line <- lines) {
      val cols = line.split(",")

    }
  }
}
