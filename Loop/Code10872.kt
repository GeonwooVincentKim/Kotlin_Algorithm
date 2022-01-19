import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    var a = sc.nextInt();

    var acc = 1
    for(i in 1..a){
        acc *= i;
    }
    println(acc);
}