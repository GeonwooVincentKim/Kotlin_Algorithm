import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    var mainValue = sc.nextInt();

    for(i in mainValue downTo 1){
        println(i);
    }
}