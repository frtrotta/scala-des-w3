class BankAccount {
  private var balance = 0

  def deposit(amount: Int): Unit = {
    if (amount > 0) balance = balance + amount
  }

  def withdraw(amount: Int): Int = {
    if (amount > 0 && balance >= amount) {
      balance = balance - amount
      balance
    }
    else throw new Error("insufficient funds")
  }
}
val a = new BankAccount
a deposit 100
a withdraw 50
a withdraw 100