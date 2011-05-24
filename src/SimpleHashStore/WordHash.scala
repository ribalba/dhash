package SimpleHashStore

class WordHash (word:String) extends HashItem{

  
  //ToDo : Add the debug stuff here, this var is not really needed
  var cWord = word
  
  var lWord = word.length()

  var hash = new SimpleHashStore.MurmurHash3().hash(word)

  override def toString() = {
    "WordHash@"+hash+"@"+ cWord
  }

}
