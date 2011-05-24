package SimpleHashStore

class DocHash (document:String) extends HashItem{

  
  //ToDo : Add the debug stuff here, this var is not really needed
  var cDoc = document
  
  var lDoc = document.length()

  var hash = new SimpleHashStore.MurmurHash3().hash(document)

  override def toString() = {
    "DocHash@"+hash+"@"+lDoc
  }
}
