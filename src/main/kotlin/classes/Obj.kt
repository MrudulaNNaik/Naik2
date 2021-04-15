package classes

fun rentPrice(normalDay : Int, festiveDays : Int){
    val dayRates = object{
        var standard = 20
        var festive = 50

    }

    val total = dayRates.standard + dayRates.festive
    println("toatl price = $total")
}

fun main(){
    rentPrice(15,68)
}