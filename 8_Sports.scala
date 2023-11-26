abstract class Sports(val id: Int, val name: String, val description: String, val amount: Double) {
  def displayDetails(): Unit = {
    println(s"Sport ID: $id")
    println(s"Sport Name: $name")
    println(s"Sport Description: $description")
    println(s"Sport Amount: $amount")
  }
}

class IndoorSports(id: Int, name: String, description: String, amount: Double) extends Sports(id, name, description, amount)

class OutdoorSports(id: Int, name: String, description: String, amount: Double) extends Sports(id, name, description, amount)

object SportsApp {
  def main(args: Array[String]): Unit = {
    val indoorSport = new IndoorSports(1, "Basketball", "Indoor court game", 1000.00)
    indoorSport.displayDetails()

    val outdoorSport = new OutdoorSports(2, "Football", "Outdoor field game", 2000.00)
    outdoorSport.displayDetails()
  }
}
