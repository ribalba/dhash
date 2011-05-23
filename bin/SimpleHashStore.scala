import SimpleHashStore._

object SimpleHashStoreMain {

  def main(args: Array[String]) = {
    println("Hello")
    
    var one = new WordHash("I")
    var two = new WordHash("Love")
    var three = new WordHash("You")

    var span = new SpanHash(10, one,two,three)
    
    //hashI.payLoad += (123.asInstanceOf[Long] -> 123.asInstanceOf[Long])
    
    
    
    1
  }
}

