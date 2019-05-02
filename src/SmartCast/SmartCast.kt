package SmartCast

fun main(args: Array<String>) {
  print(message)
  print("\n**************\n")
  //version du as gérant les erreurs de cast
  // ne marche pas car leve une exception il faudrait faire  un throw
//  val monObjet2: Any = "hello franck!"
//  try {
//    val message2 = monObjet2 as Int
//    println(message2)
//  } catch (exception: ClassCastException) {
//    println("erreur message2 n'est pas un entier")
//  }


  //version plus kotlin qui evite le try/catch et renvoie un null si erreur de cast
  val monObjet3: Any = "salut les franck!"
  val message3: Int? = monObjet3 as? Int
  val message4: String? = monObjet3 as? String
  
  //
  print("\n**************\n")
  println(message3)
  print("\n**************\n")
  println(message4)
  print("\n**************\n")
}

// as fait un cast non securisé
val monObjet: Any = "hello à vous tous!"
val message = monObjet as String




