import scala.io.StdIn

object NumberConverter {

  def decimalToBinary(decimal: Int): String = {
    if (decimal == 0) "0"
    else {
      var binary = ""
      var num = decimal
      while (num > 0) {
        binary = (num % 2).toString + binary
        num = num / 2
      }
      return binary
    }
  }

  def decimalToOctal(decimal: Int): String = {
    if (decimal == 0) "0"
    else {
      var octal = ""
      var num = decimal
      while (num > 0) {
        octal = (num % 8).toString + octal
        num = num / 8
      }
      return octal
    }
  }

  def main(args: Array[String]): Unit = {
    // Read an integer from the user
    print("Enter an integer: ")
    val userInput = StdIn.readInt()

    // Convert to binary and octal
    val binaryResult = decimalToBinary(userInput)
    val octalResult = decimalToOctal(userInput)

    // Display the results
    println(s"Binary representation: $binaryResult")
    println(s"Octal representation: $octalResult")
  }
}
