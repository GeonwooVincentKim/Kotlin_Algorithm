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

    /*
        Occurs `Array Index out of Bounds Exception`
        Because the size of Array equals to 3,
        but it trying to find out the No.3 Index,
        so it occurs error that there is no Index 
        that you looking for
    */ 
    // for(index in 1..(items.size)){
    //     print(items[index])
    // }
    
    println("\n\n--------------------\n")

    println("<Items with `Array` and `Array.size` and `until`>")
    for(index in 0 until (items.size)){
        print("${items[index]} ")
    }

    println("\n\n--------------------\n")

    println("<Items with `Array` and `Array.indices`>")
    for(index in items.indices){
        print("${items[index]} ")
    }
}
