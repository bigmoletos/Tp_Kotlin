package KotlinListeBoucle

/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 *
 * Partie 2 - Chapitre 2 : Iterez grace aux boucles
 *
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une fonction, "while20Items", contenant une boucle "while" affichant
 * en message, l'index en cours d'iteration.
 * Cette boucle s'arretera au bout de 20 iterations.
 *
 * - Creer une fonction, "showArrayContent", contenant une boucle "for" affichant
 * en message, l'element du tableau de String en cours d'itération.
 * Ce tableau devra etre passe en parametre de cette fonction.
 *
 * - Afficher le resultat de ces deux fonctions dans la console.
 *
 *
 *
 * A vous de jouer, et bon courage !
 *
 */

fun main(args: Array<String>) {
  println("Hello Openclassrooms students !\n Les boucles et les listes\n")



  while20Items()
  showarrayContent("maison")
  showarrayContent2(arrayOf("m","a","i","s","o","n"))

}

private fun while20Items() {
  var i = 0
  while (i < 20) {

    println("index $i")
    i++
  }
}


private fun showarrayContent(element: String) {
  for (i in element.indices step 1) {
    println("c'est la décomposotion du mot: ${element[i]}")
  }
}
//autre methode
private fun showarrayContent2(monTableau: Array<String>) {
  for (maChaine in monTableau) {
    println("c'est la décomposotion du mot: $maChaine")
  }

}



  
