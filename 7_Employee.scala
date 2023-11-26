class Employee {
  var id: Int = 0
  var name: String = ""
  var salary: Double = 0.0

  def accept() = {
    println("Enter employee ID:")
    id = scala.io.StdIn.readInt()

    println("Enter employee name:")
    name = scala.io.StdIn.readLine()

    println("Enter employee salary:")
    salary = scala.io.StdIn.readDouble()
  }

  def display() = {
    println("Employee ID: " + id)
    println("Employee Name: " + name)
    println("Employee Salary: " + salary)
  }
}

object MaxSalaryEmployee {
  def main(args: Array[String]): Unit = {
    val employee1 = new Employee()
    val employee2 = new Employee()

    employee1.accept()
    employee2.accept()

    var maxSalaryEmployee: Employee = null
    if (employee1.salary > employee2.salary) {
      maxSalaryEmployee = employee1
    } else {
      maxSalaryEmployee = employee2
    }

    println("Employee with Maximum Salary:")
    maxSalaryEmployee.display()
  }
}
