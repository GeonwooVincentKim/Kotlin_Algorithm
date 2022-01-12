import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    var a = sc.nextInt();
    var b = sc.nextInt();
    var c = sc.nextInt();

    print("${c - (a - b)}")
}