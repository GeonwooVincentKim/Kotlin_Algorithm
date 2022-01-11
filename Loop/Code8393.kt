import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    var newInput = sc.nextInt();

    var sum = 0;

    for (i in 1..newInput){
        sum += i;
    }
    println(sum);
}