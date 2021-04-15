class Shape (var height:Int, var width:Int) {
    var perimeter = 2*(height + width)
}

fun main(){
    var s = Shape(45,78)
    println("perimeter is ${s.perimeter}")
    println("hello")
    var a : Int = 110;
    var b = 56
    var d = "naik"
    var c = add(12,45)
    print(c)
    println(d)

}

fun add(a : Int, b : Int): Int{
    return a+b

}