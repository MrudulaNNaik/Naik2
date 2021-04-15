package basics

class Ranges {
}

fun main(){
    val x = 7
    val y = 9

    if(x in 3..y){
        println("x  is in the range")
    } else {
        println("x  is not in the range")
    }
}