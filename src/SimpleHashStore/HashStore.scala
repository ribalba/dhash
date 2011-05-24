package SimpleHashStore

object HashStore {

  var hashList = scala.collection.mutable.HashMap.empty[Long,HashItem]
  
  def addItem(hItem :HashItem ) =  {
   hashList += (hItem.hash -> hItem)
  }
  
  override def toString() = {
    var outString :String = ""
      
    hashList.map(outString += _) 
     
    outString
  }
}
