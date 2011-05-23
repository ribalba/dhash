package SimpleHashStore

import SimpleHashStore.MurmurHash3._


class HashItem (){
  
  // This should never be called alone
  // Make this a trait probably
  
  var length = -1
  
  var payLoad = scala.collection.mutable.HashMap.empty[Long,Long]
  
  var optional = Set[String]()
  
  

}
