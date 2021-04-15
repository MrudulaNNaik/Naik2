class Second {
}

fun main(){
    var a =1;
    var name = "naik $a is naik going"
    var age = 25
    val items = listOf("naik","poorna","yashu","anu")
    for(item in items){ println(item)}

    //for (index in items.indices){ println("${items[index]} is at $index")}
   // var sentence = "${name.replace("naik","mnn")}"
    //println(sentence)
    //println(maxOfNumbers(15,89))
    var index = 0
    while(index < items.size){
        println("${items[index]} is at $index")
        index ++
    }
}

fun maxOfNumbers(a:Int , b:Int):Int{
    if(a > b) return a
    else return b;
}