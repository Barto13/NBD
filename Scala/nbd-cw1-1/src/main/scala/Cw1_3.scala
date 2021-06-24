import scala.annotation.tailrec

object Cw1_3 {

//  3.	Stwórz funkcję korzystającą z rekurencji ogonowej do zwrócenia oddzielonego przecinkami stringa zawierającego elementy listy z ćwiczenia 1

  def printUsingTailRecursion ( a:List[String], i: Int) : String ={
    @tailrec
    def go(result: String, a:List[String], i: Int ): String ={
      if (i == 0){
        a(i) + ", " + result //ok
      } else {
        go(a(i) + ", " + result , a, i-1)
      }
    }
    go(a(i), a, i-1)
  }
}
