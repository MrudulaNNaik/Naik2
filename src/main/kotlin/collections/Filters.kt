package collections

class Filters {
}

val nos = listOf<Int>(1, 22 , -5 , 7 , 6, -9, -8, 5)
val words = listOf<String>("first","element","of","found","the","list")
val evenOdd = nos.partition { it%2==0 }
val bagOfFruits = listOf<String>("mango","apple","pear")
val bagOfClothes = listOf<String>("shirt","pant","tie")
val cart = linkedSetOf(bagOfClothes, bagOfFruits)
val mapBag = cart.map { it }
val flatMapBag = cart.flatMap { it }


fun main() {

    println(cart)
    println(mapBag)
    println(flatMapBag)




    println("even numbers are ${evenOdd.first}")
    println("odd numbers are ${evenOdd.second}")

    // val positive = nos.filter{ x -> x >0}
    val positive = nos.filter {it > 0}
    println(positive)

    val doubles = nos.map {x -> x*2}
    println("doubles = $doubles")

    println("if any number is gretaer thn " +nos.any{it > 2})
    println("if all the numbers less than 5 " +nos.all {it < 5})
    println("are none of the nos greater than 4  "+nos.none{it > 4})

    val firstN0 = nos.first()
    val lastNo = nos.last()
    println(lastNo)
    println(firstN0)

    val firstEven = nos.first{it%2 == 0 }
    println(firstEven)


    println("${nos.count()} digits are there")
    println("${nos.count {it % 2 == 0}} even number" )

    val first = words.find { it.startsWith("f") }
    println(first)
    val last = words.findLast { it.startsWith("f") }
    println(last)



}