fun main(){
    println("For Loop")

    val items = listOf("Apple", "Banana", "Wiki")
    println(items.size)
    println(items + "\n")
    
    println("<Items with `General For-Loop>`")
    for(item in items){
        print("$item ")
    }

    println("\n\n--------------------\n")

    println("<Items with `Array` and `Array.size`>")
    for(index in 0..(items.size - 1)){
        print("${items[index]} ")
    }
    
    println("\n\n--------------------\n")

    println("<>")
}
