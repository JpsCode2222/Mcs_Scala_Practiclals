import scala.collection.mutable.ListBuffer

object GenerateList {

  def main(args: Array[String]): Unit = {
    // Define the function to calculate the value for each n
    def calculateValue(n: Int): Int = {
      3 * n * n + 4 * n + 6
    }

    // Initialize an empty list to store the values
val list: List[Int] = Nil;

    // Iterate from 1 to 10 and calculate the value for each n
    for (n <- 1 to 10) {
      val value = calculateValue(n)
      list += value; // Prepend the value to the front of the list
    }

    // Print the resulting list
    println(list)
  }
}