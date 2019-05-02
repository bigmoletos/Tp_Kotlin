package FirstTest


fun main(args: Array<String>) {

  val result = addition(5, 5)
  val bigResult = addition(result, addition(15, 2))
  println("Result is: $bigResult")


  var aa = 200
  var bb = 34
  val result2 = if (aa == bb) 0 else bb
  print(result2)

  
  for (i in 1..50 step 5) println(i)
  var i=0
    while(i<3){
      i++
        println(i) } 
}

private fun addition(a: Int, b: Int) = a + b



