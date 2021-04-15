package collections




val passedStudents: MutableMap<Int,String> = mutableMapOf();

class Maps {
}


fun main() {
    passedStudents.put(1,"amit")
    passedStudents.put(2,"tej")
    passedStudents.put(3,"naik")
    passedStudents.put(4,"abhi")

    val nameWithA = passedStudents.filterValues { it.startsWith("a") }
    println(nameWithA)

    println(passedStudents)
    println(passedStudents.values)

}



