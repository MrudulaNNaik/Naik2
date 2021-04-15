package classes

class HigherOrder {
}

fun mul(a : Int, b : Int): Int{
    return a*b
}

fun sum(x:Int , y: Int) = x+y
//function returning another function
fun funWHichREturnsAnotherFun(): (Int) -> Int{
    return :: square
}

fun square(x: Int) = x*x

fun calculate(x: Int, y: Int, operation: (Int,Int) -> Int) : Int{
    return operation(x,y)
}

fun main(){
    val resultsqr = funWHichREturnsAnotherFun()
    println(resultsqr(5))


    val resultSum =  calculate(45,56, ::sum)
    val resultMul = calculate(52,58,::mul)
    println(resultMul)
    println(resultSum)

}