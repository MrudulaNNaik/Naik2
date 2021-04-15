package classes

class Company {
    var news: String = "Company is launching a new product"

    companion object Media {
        fun broadcastNews() {
            println("ccompanion object acts as static method")
        }
    }
}

    fun main(){
        Company.broadcastNews()

}