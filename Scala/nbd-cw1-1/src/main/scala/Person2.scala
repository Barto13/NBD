//  5.	Zdefiniuj klasę Osoba i trzy traity: Student, Nauczyciel, Pracownik.
//    Osoba powinna mieć własności read only: imie, nazwisko, podatek
//  Pracownik powinien mieć własność pensja (z getterem i seterem).
//    Student i Pracownik powinni przesłaniać własność podatek – dla Studenta zwracamy 0, dla Pracownika 20% pensji.
//    Nauczyciel powinien dziedziczyć z Pracownika, dla niego podatek zwraca 10% pensji.
//    Stwórz obiekty z każdym z traitów, pokaż jak podatek działa dla każdego z nich. Stwórz obiekty z traitami Student i Pracownik,
//  pokaż jak podatek zadziała w zależności od kolejności w jakiej te traity zostały dodane przy tworzeniu obiektu.

abstract class Person2 (val name: String, val surname: String) {
  def tax: Double
}

  trait Student extends Person2 {
    override def tax = 0

  }

  trait Teacher extends Worker{
    override def tax = salary * 0.1
  }

  trait Worker extends Person2 {
    override def tax = salary * 0.2
    var salary = 0.0

  }



