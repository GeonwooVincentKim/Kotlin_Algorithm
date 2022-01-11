import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    
    var inputValue = sc.nextInt();
    var max = -1000001;
    var min = 1000001;
    for(i in 1..inputValue){
        var innerValue = sc.nextInt();

        if(innerValue > max) {
            max = innerValue
        }
        
        if(innerValue < min) {
            min = innerValue;
        }
    }

    println("$min $max");
}

// fun main() {

//     print("Enter Array size: ")
//     val arraySize = readLine()!!.toInt()
//     println("Enter Array Elements")
//     val arr = Array<Int>(arraySize) { readLine()!!.toInt() }

//     for (x in arr)
//         println(x)
// }
