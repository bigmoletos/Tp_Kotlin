package SmartCast

fun main(args: Array<String>) {
print("cast un objet\n")
  print("\n**************\n")
  print(getDefaultSize(listOf(20, 56, 85,42,44, 41)))
  print("\n**************\n")
  print(getDefaultSize2(listOf(20, 56, 85, 41)))
  print("\n**************\n")
  print(getDefaultSize2("fgfgf"))
  print("\n**************\n")
  print(getDefaultSize2(5000))
  print("\n**************\n")
}


//La m�thode  getDefaultSize()  ci-dessus est une m�thode dont
//l�objectif est de retourner la taille d�une variable de type  Object
// (� savoir la superclasse de toutes les classes en Java) : ce param�tre
//pourra donc �tre n�importe quel objet Java. :)
//Puis, gr�ce au mot-cl�  instanceof , nous allons v�rifier
//successivement si la variable est de type  String  ou de type  List
// avant de la "cast" (ou de la "convertir") dans le type correspondant.
private fun getDefaultSize(monObject: Any): Int {
  if (monObject is String) {
    return monObject.length
  } else if (monObject is List<*>) {
    return monObject.size
  }
  return 0
}

//version plus dans le style de kotlin
private fun getDefaultSize2(monObject: Any)= when(monObject) {
	 is String->  monObject.length
	is List<*>-> monObject.size
  is Int-> monObject.div(2)
	else->0
}




