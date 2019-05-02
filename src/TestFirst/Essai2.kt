package TestFirst
fun main(args : Array<String>) {
    println("Hello, franck!")
  
   var message:String?="my message can be null"
  fun printmessage(){
     println("Hello OpenClassrooms students ! $message")
        println("Hello Openclassrooms students !")
    fun getResult(a:Int, b:Int):Int{return a+b} 
    fun getUsernameCase(userName:String):Unit{ println(userName.toUpperCase())}
    fun isUserNameOfTeacher(NameOfTeacher:String):Unit{return if(NameOfTeacher=="phil") print("true") else if (NameOfTeacher=="Ambroise")  print("false") else  print("nom inconnu") } 

print(getResult(5,8))
getUsernameCase("\npepito")
isUserNameOfTeacher("\nphil")
    
      var aa = 200
  var bb = 34
  val result= if (aa == bb) 0 else bb
print(result)
  }
}


