
//  2.	Zdefiniuj klasę KontoBankowe z metodami wplata i wyplata oraz własnością stanKonta - własność ma być tylko do odczytu.
//    Klasa powinna udostępniać konstruktor przyjmujący początkowy stan konta oraz drugi, ustawiający początkowy stan konta na 0.

class BankAccount(val balance: Double){

  def this(){
    this(0.0)
  }

  def deposit(amount:Double) : BankAccount = {
    new BankAccount(balance + amount)
  }

  def withdraw(amount:Double) : BankAccount = {
    new BankAccount(balance - amount)
  }

}
