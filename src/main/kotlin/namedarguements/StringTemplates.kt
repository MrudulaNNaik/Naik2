package namedarguements

import java.awt.List

class StringTemplates {
}

fun main() {
    val (x,y,z) = arrayOf(4,8,5)
    val map = mapOf("naik" to 58, "mnn" to 89)
    for((name,age) in map){
        println("$name is $age")
    }



//val (min,max) = findMinMax(listOf(45,12,65))


    val greeting = "welcome"
    println("$greeting to java")
    println("${greeting.toUpperCase()} to java")
}


}

//fun findMinMax(listOf : List<Int>): Any{
    //return 0
}