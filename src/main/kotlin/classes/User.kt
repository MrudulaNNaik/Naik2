package classes

data class User (var name : String, val id :Int)

fun main(){
    val user = User("naik",45)
    val secondUser = User("naik",45)

    println(user)
    println(secondUser)
    println(user.name)
}
