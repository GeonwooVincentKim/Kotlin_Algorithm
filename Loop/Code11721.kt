import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    var newStringLine = sc.nextLine();
    for (i in newStringLine.indices){
        val b = newStringLine.substring(i, i + 1);
        
        if(i % 10 == 9) println("");
        else print(b);
    }
}
