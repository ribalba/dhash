import SimpleHashStore._

object SimpleHashStoreMain {

  def main(args: Array[String]) = {
    println("Hello")
    
    var store = HashStore
    
    store.addItem(new HashItem("One"))
    store.addItem(new HashItem("Two"))

    println(store.hashList)
    
    
  }
}

