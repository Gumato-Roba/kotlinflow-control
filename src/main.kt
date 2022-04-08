fun main(){
     OddNumbers()
     var names=list(arrayOf("GumatoRoba","Casey","Elema","John"))
     println(names)

    Robot(4)

    multiple()

}



fun OddNumbers(){
for(numbers in 1 .. 100)
        if (numbers%2 != 0) {
            println(numbers)

        }

}
fun list(names: Array<String>): Int{
    var d = 0
      for (b in names){
          if (b.length>5){
              d++
          }

    }
    return d

}

fun Robot(age: Int){
    if (age<6){
        println("Serve glass of milk")
    }
    else if (age<6 && age<15){
        println("Serve a bottle of fanta Orange")
    }
    else println("Serve bottle of Cocacola")
}

fun multiple(){
    for (numbers in 1..100)
        if (numbers%3==0) {
            println("Fizz!")
        }
         else if(numbers%5==0){
            println("Buzz!")
        }
        else if (numbers%3==0 &&  numbers%5==0){
            println("fizzBuzz!")
        }
        else{
            println(numbers)
        }
}

