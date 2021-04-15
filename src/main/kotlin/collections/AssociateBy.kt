package collections

class AssociateBy {
}

data class Person(val name : String, val city: String, val phno : Int)

val people = listOf<Person>(
    Person("naik","smg", 1236),
    Person("poorna","kwr", 4569),
    Person("tej","kwr", 7895),
    Person("apoo","smg", 78526))

fun main() {
    val phnBook = people.associateBy { it.city }
    println(phnBook)

    val phnBooks = people.groupBy{ it.city }
    println(phnBooks)
}