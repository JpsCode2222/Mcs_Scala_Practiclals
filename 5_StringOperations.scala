import scala.io.StdIn

object StringOperations {

  def main(args: Array[String]): Unit = {
    // Read two strings from the user
    print("Enter the first string: ")
    val str1 = StdIn.readLine()

    print("Enter the second string: ")
    val str2 = StdIn.readLine()

    // Concatenate two strings
    val concatenatedString = str1 + str2
    println(s"Concatenated String: $concatenatedString")

    // Check if the first string ends with "la"
    val endsWithLa = str1.endsWith("la")
    println(s"Does the first string end with 'la'? $endsWithLa")

    // Find the index of character 'a' in the second string
    val indexOfA = str2.indexOf('a')
    if (indexOfA != -1) {
      println(s"Index of 'a' in the second string: $indexOfA")
    } else {
      println("The character 'a' is not present in the second string.")
    }
  }
}
