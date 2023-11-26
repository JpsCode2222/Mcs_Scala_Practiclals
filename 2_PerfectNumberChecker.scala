import scala.util.Random

object PerfectNumberChecker {

  def isPerfectNumber(number: Int): Boolean = {
    if (number <= 1) false
    else {
      val divisors = (1 until number).filter(number % _ == 0)
      divisors.sum == number
    }
  }

  def main(args: Array[String]): Unit = {
    val random = new Random()

    // Generate and check five random numbers
    for (i <- 1 to 5) {
      val randomNumber = random.nextInt(100) + 1 // Generate random number between 1 and 100
      val result = if (isPerfectNumber(randomNumber)) "is" else "is not"
      println(s"$randomNumber $result a perfect number.")
    }
  }
}
