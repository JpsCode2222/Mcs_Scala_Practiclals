object StringComparison {

  def main(args: Array[String]): Unit = {
    // Read the first string from the user
    println("Enter the first string:")
    val inputString1 = scala.io.StdIn.readLine()

    // Read the second string from the user
    println("Enter the second string:")
    val inputString2 = scala.io.StdIn.readLine()

    // Compare strings using == operator
    println("Checking if strings are equal using == operator:")
    val isEqualUsingOperator = inputString1 == inputString2
    println(isEqualUsingOperator)

    // Compare strings using equals() method
    println("Checking if strings are equal using equals() method:")
    val isEqualUsingEquals = inputString1.equals(inputString2)
    println(isEqualUsingEquals)

    // Compare strings using compareTo() method
    println("Comparing strings using compareTo() method:")
    val comparisonResult = inputString1.compareTo(inputString2)
    println(s"Comparison result: $comparisonResult")

    // Find character at position 5
    println("Finding character at position 5 in the first string:")
    val characterAtPosition5 = inputString1.charAt(5)
    println(s"Character at position 5: $characterAtPosition5")
  }
}
