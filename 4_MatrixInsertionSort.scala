import scala.io.StdIn

object MatrixInsertionSort {

  def insertionSort(row: Array[Int]): Array[Int] = {
    for (i <- 1 until row.length) {
      val key = row(i)
      var j = i - 1

      while (j >= 0 && row(j) > key) {
        row(j + 1) = row(j)
        j = j - 1
      }
      row(j + 1) = key
    }
    row
  }

  def sortMatrix(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    matrix.map(row => insertionSort(row))
  }

  def printMatrix(matrix: Array[Array[Int]]): Unit = {
    matrix.foreach(row => println(row.mkString(" ")))
  }

  def main(args: Array[String]): Unit = {
    // Read the dimensions of the matrix
    print("Enter the number of rows: ")
    val rows = StdIn.readInt()

    print("Enter the number of columns: ")
    val cols = StdIn.readInt()

    // Initialize the matrix
    val matrix = Array.ofDim[Int](rows, cols)

    // Read matrix elements from the user
    println(s"Enter the elements of the $rows x $cols matrix:")
    for (i <- 0 until rows) {
      for (j <- 0 until cols) {
        print(s"Enter element at position ($i, $j): ")
        matrix(i)(j) = StdIn.readInt()
      }
    }

    // Sort the matrix using insertion sort
    val sortedMatrix = sortMatrix(matrix)

    // Print the sorted matrix
    println("\nSorted Matrix:")
    printMatrix(sortedMatrix)
  }
}
