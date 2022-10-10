fun main() {

    // Задание 1
    val age1: Double = 42.0
    val age2: Double = 21.0

    // Задание 2
    val avg1 = age1 + age2 / 2 // Должен быть Double

    // Задача 4
     val firstName: String = "Евгений"
     val lastName:  String = "Поляков"

    // Задача 5
    val fullName:String = firstName + " " + lastName
    println(fullName)

    // Задача 6
   val  myDetails : String = "Привет меня зовут $fullName"
   println(myDetails)

   // Задача 7
    val dates = Triple (11, 6, 2004)

    //Задача 8
    val (month, day, year) = dates

    // Задача 9
    val monthAndYear = """"
        |$month 
        |
        |$year 
        """.trimMargin()
    println(monthAndYear)

    // Задача 10



}