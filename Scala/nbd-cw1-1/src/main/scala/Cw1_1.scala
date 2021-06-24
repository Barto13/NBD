object Cw1_1 {

  //    1.	Stwórz 7 elementową listę zawierającą nazwy dni tygodnia.
  //    Napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
  //      a.	Pętli for
  //      b.	Pętli for wypisując tylko dni z nazwami zaczynającymi się na „P”
  //      c.	Pętli while

  def printUsingFor( a:List[String]) : String = {
    var result = "";
    for(e <- a){
      result = result + e + ", ";
    }
    result.substring(0, result.length - 2);
  }

  def printStartingWithP( a:List[String] ) : String = {
    var result = "";
    for(e <- a if e.startsWith("P")) {
      result = result + e + ", ";
    }
    result.substring(0, result.length - 2);
  }

  def printUsingWhile( a:List[String] ) : String ={
    var result = "";
    var i = 0;
    while(i < a.length) {

      result = result + a(i) + ", ";
      i = i + 1;
    }
    result.substring(0, result.length - 2);
  }
}
