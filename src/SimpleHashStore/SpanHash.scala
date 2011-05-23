package SimpleHashStore

class SpanHash(length: Int, wHashes: HashItem*) extends HashItem{
  var finWord = ""
 
  var sLength = -1
  
  if(length <= 0){
    for (sHash <- wHashes){
    	sLength += sHash.length
    }   
  } 
  
  for (sHash <- wHashes){
    finWord += sHash
    
  }
  
  var hWord = new SimpleHashStore.MurmurHash3().hash(finWord)

  override def toString() = {
    "SpanHash@"+hWord
  }
  
  
}
