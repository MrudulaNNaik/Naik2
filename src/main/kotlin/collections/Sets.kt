package collections

val issues: MutableSet<String> = mutableSetOf("issues1","issues2","issues3")

fun addIssue(issue:String):Boolean{
    if (issues.add(issue) ) {
        print("issue added successfully")
        return true
    }
    else{
        println("issue exists")
        return false

    }
}

class Sets {
}

fun main() {
    println(issues)
    println(addIssue("issue4"))
    println(issues)
    println(addIssue("issue2"))
}