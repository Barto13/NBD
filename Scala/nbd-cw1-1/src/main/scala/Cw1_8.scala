object Cw1_8 {

//  8.	Napisz funkcję usuwającą zera z listy wartości całkowitych
//  (tzn. zwracającą listę elementów mających wartości różne od 0).  Wykorzystaj rekurencję.

  val list = List(13, 7, 0, 27, 0, 4)
  val list2 = List()
//  val result = scala.collection.mutable.ListBuffer[Int]()
  var listTmp = List[Int]()

  def removeZeros(list:List[Int]) : List[Int] ={

    //pozbyc sie listy pomoczniczej
    if(list.isEmpty){
      list
    }else{
      if(list.head != 0){
        return list.head :: removeZeros(list.tail)
//        result += list.head
      }
      removeZeros(list.tail)
    }
//    listTmp
//    result.toList
  }
}

