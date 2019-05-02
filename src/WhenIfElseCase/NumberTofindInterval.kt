package WhenIfElseCase


fun main(args: Array<String>) {
  
val numerToFindInterval=23
  when(numerToFindInterval){
    in 1..10-> print("le chiffre est entre 1 et 10")
    in 11..20-> print("le chiffre est entre 11 et 20")
    in 21..30-> print("le chiffre est entre 21 et 30")
    in 31..40-> print("le chiffre est entre 31 et 40")
  in 41..5000-> print("le chiffre est entre 41 et 5000")
    
  }



}

