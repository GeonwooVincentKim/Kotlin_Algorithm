import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    var newStringLine = sc.nextLine();
    for (i in newStringLine.indices){
        val b = newStringLine.substring(i, i + 1);
        
        // If No.9 index (No.9, No.19, No.29, ...) of Items 
        // matches to rounded-value
        if(i % 10 == 9) println(b);
        else print(b);
    }
}
