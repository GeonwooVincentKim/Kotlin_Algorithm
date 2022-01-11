import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    var inputValue = sc.nextInt();

    for (i in 1..inputValue){
        for (j in 1..i) {
            print("*")
        }
        println("")
    }
}