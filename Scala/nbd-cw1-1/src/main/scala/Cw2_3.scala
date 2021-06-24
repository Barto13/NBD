object Cw2_3 {

//  3.	Zdefiniuj klasę Osoba z własnościami imie i nazwisko.
//    Stwórz kilka instancji tej klasy. Zdefiniuj funkcję, która przyjmuje obiekt klasy osoba i przy pomocy Pattern Matching wybiera i
//    zwraca napis zawierający przywitanie danej osoby.
//  Zdefiniuj 2-3 różne przywitania dla konkretnych osób (z określonym imionami lub nazwiskami) oraz jedno domyślne.

  def greetPerson(x: Person): String = x match {
    case Person("Adam", _) => "Hello Adam!"
    case Person(_,"Nowak") => "Hello mr Nowak"
    case _ => "Hello there"
  }

}
