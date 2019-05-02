package WhenIfElseCase


fun main(args: Array<String>) {

  var apiResponse = 403

  when (apiResponse) {
    200 -> print("ok reponse 200\n")
    404 -> print("NOT FOUND reponse 404\n")
    401 -> print("UNAUTHORIZED reponse 401\n")
    403 -> print("FORBIDDEN reponse 403\n")
    else -> print("retour inconnu\n")
  }

  
  
  
//avec la fonction printResponseUrl()
  printResponseUrl(301)

//en utilisant isSuccess et isError
 var apiResponse2=402
  when{
	  isSuccess(apiResponse2)->print("SUCCESS\n")
    isError(apiResponse2)->print("ERROR\n")
  }
  
  //en utilisant les enumérations avec proprietés
//  val response:ApiResponse=ApiResponse.OK
		  val response:ApiResponse=ApiResponse.NOT_FOUND
  when(response){
    ApiResponse.OK-> print("ok reponse 200\n")
    ApiResponse.NOT_FOUND -> print("NOT FOUND reponse 404\n")
    ApiResponse.UNAUTHORIZED -> print("UNAUTHORIZED reponse 401\n")
    ApiResponse.FORBIDDEN -> print("FORBIDDEN reponse 403\n")
    ApiResponse.UNKNOWN -> print("UNKNOWN reponse 403\n")
    ApiResponse.ERROR -> print("ERROR reponse 503\n")
  }
  
 //en utilisant les enumérations avec liste 
  
  
  
}

fun printResponseUrl(apiResponse: Int) = when (apiResponse) {
  200, 201, 203 -> print("OK reponse 200\n")
  300, 301, 303 -> print("REDIRECTION reponse 300\n")
  404 -> print("NOT FOUND reponse 404\n")
  401 -> print("UNAUTHORIZED reponse 401\n")
  403 -> print("FORBIDDEN reponse 403\n")
  else -> print("retour inconnu\n")
}
//fonction en supprimant le else et le when
fun isSuccess(apiResponse2:Int)=apiResponse2==200 ||apiResponse2==201||apiResponse2==202
fun isError(apiResponse2:Int)=apiResponse2==400 ||apiResponse2==401||apiResponse2==402