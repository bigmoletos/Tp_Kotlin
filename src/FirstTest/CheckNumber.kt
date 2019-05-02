package FirstTest

fun main(args: Array<String>) {

  var message = "salut ! j'aime le chiffre 42"
  val number = message as? Int
  print(number)
  checkNumber(8.0)
}

private fun checkNumber(number: Number) = when (number) {
  is Int -> print("c'est un entier!")
  is Double -> print("c'est un decimale!")
  is Float -> print("c'est un chiffre à virgule")
  is Long -> print("c'est un chiffre long!")
  else -> print("Erreur ce type n'est pas reconnu")

}

 