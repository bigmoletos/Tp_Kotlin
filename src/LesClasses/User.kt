package LesClasses

class User(email: String, private var password: String, var age: Int) {
  //email: champ pouvant etre accédé et modifié
  var email: String = email
    //get pour l'email
    get() {
      println("User is getting his email."); return field
    }
    //setter
    set(value) {
      println("User is setting his mail"); field = value
    }
  // class User(var email:String, var password:String, var age: Int)

  //instanciation, pas besoin de faire un User user= new User();
  val user = User("telfd@free.fr", "mot de passe", 25)
  //getter
 // user.email
  //setter
 // user.email="telllfd@free.fr"
}