package TestFirst

fun main(args: Array<String>) {

  var message: String? = "my message can be null"



  println("Hello OpenClassrooms students ! $message")
  fun getResult(a: Int, b: Int): Int {
    return a + b
  }

  fun getUsernameCase(userName: String): Unit {
    println(userName.toUpperCase())
  }

  fun isUserNameOfTeacher(NameOfTeacher: String): Unit {
    return if (NameOfTeacher == "phil") print("true")
    else if (NameOfTeacher == "Ambroise") print("false")
    else print("nom inconnu")
  }

  print(getResult(5, 8))
  getUsernameCase("\npepito\n")
  isUserNameOfTeacher("phil")


}