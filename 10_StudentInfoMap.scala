object StudentInfoMap {

  def main(args: Array[String]): Unit = {
    // Create a map with Rollno and FirstName
    val studentMap = Map(
      101 -> "John",
      102 -> "Alice",
      103 -> "Bob",
      104 -> "John",
      105 -> "Eva",
      106 -> "Alice",
      107 -> "Bob",
      108 -> "John",
      109 -> "Eva",
      110 -> "Alice"
    )

    // // Create an empty map to store Rollno and FirstName
    // var studentMap = Map[Int, String]()

    // // Read student information from the user
    // for (_ <- 1 to 5) {
    //   print("Enter Rollno: ")
    //   val rollNo = StdIn.readInt()

    //   print("Enter FirstName: ")
    //   val firstName = StdIn.readLine()

    //   // Add the information to the map
    //   studentMap += (rollNo -> firstName)
    // }

    // Print all student information with the same FirstName
    printStudentInfoByFirstName(studentMap, "Alice")
  }

  def printStudentInfoByFirstName(studentMap: Map[Int, String], firstName: String) = {
    println(s"Student information with FirstName '$firstName':")
    studentMap.foreach {
      case (rollNo, fName) if fName == firstName =>
        println(s"RollNo: $rollNo, FirstName: $fName")
      case _ => // do nothing for other cases
    }
  }
}
