
import scala.io.StdIn.readInt;
object UpperTriangularMatrix {
  def isUpperTriangular(matrix: Array[Array[Int]]): Boolean = {
    val rows = matrix.length
    val cols = matrix(0).length

    var isUpperTriangular = true

    for (i <- 0 until rows) {
      for (j <- 0 until i) {
        if (matrix(i)(j) != 0) {
          isUpperTriangular = false
        }
      }
    }

    isUpperTriangular
  }

  def main(args: Array[String]): Unit = {
    val row = readInt();
    val col = readInt();
    if(row != col){
      println("row and col not equal");
      return;
    }

    val matrix = Array.ofDim[Int](row,col);

    for(i<- 0 until row){
      for(j<-0 until col){
        println(s"Enter Elements $i x $j : ");
        matrix(i)(j) = readInt();
      }
    }

    if (isUpperTriangular(matrix)) {
      println("The matrix is upper triangular.")
    } else {
      println("The matrix is not upper triangular.")
    }
  }
}
