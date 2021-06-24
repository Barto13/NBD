object Cw1_6 {

//  6.	Zdefiniuj funkcję przyjmującą krotkę z 3 wartościami różnych typów i wypisującą je

  val tuple = new Tuple3[Int, String, Boolean](13, "String", false)
  def printTupleContent(tuple : Tuple3[Int, String, Boolean]): String ={
    tuple.productIterator.foreach{ i =>println("Value = " + i )}
    "tuple elements printed."
  }
}
