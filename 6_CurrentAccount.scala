import scala.io.StdIn

class CurrentAccount(val accNo: Int, val name: String, private var balance: Double, val minBalance: Double) {

  def withdraw(amount: Double): Unit = {
    if (balance - amount >= minBalance) {
      balance -= amount
      println(s"Withdrawal successful. New balance: $balance")
    } else {
      println("Insufficient funds. Withdrawal failed.")
    }
  }

  def deposit(amount: Double): Unit = {
    balance += amount
    println(s"Deposit successful. New balance: $balance")
  }

  def viewBalance(): Unit = {
    println(s"Account Number: $accNo")
    println(s"Account Holder: $name")
    println(s"Current Balance: $balance")
    println(s"Minimum Balance: $minBalance")
  }
}

object CurrentAccountDemo {
  def main(args: Array[String]): Unit = {
    // Create an object of CurrentAccount
    val account = new CurrentAccount(12345, "John Doe", 1000.0, 500.0)

    // Perform operations
    account.viewBalance()

    print("Enter the withdrawal amount: ")
    val withdrawAmount = StdIn.readDouble()
    account.withdraw(withdrawAmount)

    print("Enter the deposit amount: ")
    val depositAmount = StdIn.readDouble()
    account.deposit(depositAmount)

    // View the final balance
    account.viewBalance()
  }
}
