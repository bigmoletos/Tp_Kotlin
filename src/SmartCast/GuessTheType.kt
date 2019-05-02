package SmartCast

/*
  Partie 2 - Chapitre 3 : Decouvrez le Smart Cast
 *  
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une fonction, guessTheType, permettant de deviner et d'afficher 
 * dans la console le type d'un objet passe en parametre. 
 * Les types supportes seront Int, String, List, Boolean et Array 
 * 
 * - Afficher le resultat de cette fonction dans la console.
 */

fun main(args: Array<String>) {
  print("\n**************\n")
  guessTheType(listOf(20, 56, 85, 42, 44, 41))
  print("\n**************\n")
  guessTheType(listOf(20, 56, 85, 41))
  print("\n**************\n")
  guessTheType("fgfgf")
  print("\n**************\n")
  guessTheType(5000)
  print("\n**************\n")
  guessTheType(true)
  print("\n**************\n")
  guessTheType(arrayOf(20, 121, 202, 235, 24, 2555))
  print("\n**************\n")
  guessTheType(10)
  print("\n**************\n")
  guessTheType("Troll")
  print("\n**************\n")
  guessTheType(arrayOf(1, 2, 3, 4))
  print("\n**************\n")
  guessTheType(listOf(1, 2))
  print("\n**************\n")
  guessTheType(false)
  print("\n**************\n")
  guessTheType(9.0) // It's a Double...
}

private fun guessTheType(monTruc: Any) = when (monTruc) {

  is String -> println("c'est un String de taille :"+ monTruc.length)
  is List<*> -> println("c'est une List de taille :"+ monTruc.size)
  is Int -> println("c'est un Int  \n")
  is Array<*> -> println("c'est un Array de taille : "+monTruc.size)
  is Boolean -> println("c'est un Boolean : "+monTruc)
  else -> println("c'est un type inconnu\n")

}

