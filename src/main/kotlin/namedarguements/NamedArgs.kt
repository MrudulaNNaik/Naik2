package namedarguements

class NamedArgs {
}

data class format(val userName: String, val domain: String)

fun main() {
    println(format("naik","google.com"))
    println(format("mydomain.com","ansari"))
    println(format(userName = "Naik",domain = "yahoo.com"))

}