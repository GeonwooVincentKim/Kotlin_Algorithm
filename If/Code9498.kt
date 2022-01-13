import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    var a = sc.nextInt();
    if(a >= 90){
        println("A")
    } else if(a < 90 && a >= 80){
        println("B")
    } else if(a < 80 && a >= 70) {
        println("C");
    } else if(a < 70 && a >= 60) {
        println("D");
    } else if(a < 60){
        println("F");
    }
}