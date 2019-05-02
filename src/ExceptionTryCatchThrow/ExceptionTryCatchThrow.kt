package ExceptionTryCatchThrow

//import 
/*
  Partie 2 - Chapitre 4 : Maitrisez les exceptions
 *  
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une fonction, isUserOld(), retournant vrai si l'age fournit en parametre 
 * est superieur a 65. Sinon, cette fonction renverra faux. 
 * En revanche, vous devrez lever une exception differente si :
 *  * l'age est inferieur a 0 ("too young !")
 *  * l'age est superieur a 100 ("too old !")
 * 
 * - Afficher le resultat de cette fonction dans la console.
 */
fun main(args: Array<String>) {
  isUserOld(65)
  print("\n**************\n")
  println("Is user is old ? ${isUserOld(64)}")
  print("\n**************\n")
  println("Is user is old ? ${isUserOld(67)}")
  print("\n**************\n")
  println("Is user is old ? ${isUserOld(-2)}")
  print("\n**************\n")
  println("Is user is old ? ${isUserOld(102)}")
  print("\n**************\n")


//version plus kotlin qui evite le try/catch et renvoie un null si erreur de cast
//  val monObjet3: Any = "salut les franck!"
//  val message3: Int? = monObjet3 as? Int
//  val message4: String? = monObjet3 as? String
//
//  print("\n**************\n")
//  println(message3)
//  print("\n**************\n")
//  println(message4)
//  print("\n**************\n")
}

//private fun isUserOld(age: Int)=when {
////  var age: Int = 45
//  if (age > 65)
//    try {
//      print("super c'est un viok de plus de 65 balais")
//      return True
//    } catch (exception: ClassCastException) {
//      print("trop jeune le mec")
//    } finally {
//      print("bon finalement on prend tout le monde")
//    }
private fun isUserOld(age: Int) = when {
  age > 80 -> throw Exception("super c'est un viok de plus de 65 balais")
  age > 65 -> true
  age < 0 -> throw Exception("trop jeune le mec")
  else -> false
//  print("bon finalement on prend tout le monde")

}





