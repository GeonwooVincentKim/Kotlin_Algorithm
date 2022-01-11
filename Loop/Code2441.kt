import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    var inputValue = sc.nextInt();

    for (i in inputValue downTo 1){
        for (j in inputValue downTo 1) {
            if(i < j) print(" ");
            else print("*");
        }
        println("")
    }
}