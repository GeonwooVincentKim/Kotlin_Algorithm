import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    var a = sc.nextInt();
    var b = sc.nextInt();

    if(a > 0 && b > 0){
        println("1");
    } else if (a > 0 && b < 0){
        println("4");
    } else if (a < 0 && b > 0){
        println("2");
    } else if (a < 0 && b < 0){
        println("3");
    }
}