package function

class Order {

}

public fun String.isMale(name : String):Boolean{
    if(name.startsWith("m"))
    {return true}
    else{
        return false
    }
}

fun main() {
    println(String().isMale("mrudula"))
    println(String().isMale("naik"))

}