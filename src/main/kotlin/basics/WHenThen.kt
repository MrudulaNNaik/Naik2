package basics

class WHenThen {
}

fun main(){
   println(describe(1))
    println("hello")

}

fun describe(obj :Any): String{
    return when (obj) {
        1 -> "one"
        "hello" -> "greeting"
        is Long -> "long no"
        !is String -> "not a string"
        else -> "unknown"

    }
}