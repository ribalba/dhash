import SimpleHashStore._

object SimpleHashStoreMain {

  def main(args: Array[String]) = {
    println("Hello")
    
    val hashStore = HashStore
    
    var one = new WordHash("I")
    var two = new WordHash("Love")
    var three = new WordHash("You")

    hashStore.addItem(one)
    hashStore.addItem(two)
    hashStore.addItem(three)
    
    var span = new SpanHash(10, one,two,three)
    
    hashStore.addItem(span)
    
    println(hashStore)

    1
  
  }
}
