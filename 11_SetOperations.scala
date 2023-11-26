object SetOperations {

  def main(args: Array[String]): Unit = {
    // Define the first set
    val set1 = Set(1, 2, 3, 4, 5)

    // Define the second set
    val set2 = Set(3, 4, 5, 6, 7)

    // Merge the two sets
    val mergedSet = set1 ++ set2
    println("Merged Set: " + mergedSet)

    // Calculate the product of all elements in the merged set
    val product = mergedSet.product
    println("Product of all elements: " + product)

    // Calculate the average of all elements in the merged set
    val average = mergedSet.sum / mergedSet.size
    println("Average of all elements: " + average)
  }
}
