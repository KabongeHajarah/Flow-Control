fun main() {
allNumbers()

    var charactersNames= names(arrayOf("Bellah","Shaturah","Rayans","Ian","Dan"))
    println("number of names longer than 5 characters is $charactersNames ")

decisions(2)
    decisions(13)
    decisions(30)
    decisions(0)

    eachNumber()

}
fun allNumbers (){

    for (num in 1..100){
if (num % 2 != 0){
    println(num)
}

}
}


fun names (specificNames:Array<String>):Int {

    var countNames= 0
    for (name in specificNames) {
        if (name.length > 5) {
            countNames++

        }


    }
    return countNames
}


fun decisions (age:Int){

    when(age){
       in 0..6-> println("Robots serves a glass of milk")
        in 7..15 -> println("Robots serves a bottle of fanta orange")
        else-> println("Robot serves a bottle of coca cola")
    }

}
fun eachNumber (){
for (num in 1..100){


if       (num % 3 == 0 && num % 5==0 )  {
println("FizzBuzz")
}
else if ( num % 3 == 0){
    println("Fizz")
}
    else if ( num % 5==0 )  {

    println("Buzz")
}
    else{
        println(num)

    }


}
}






