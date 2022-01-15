import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    
    var a = sc.nextInt();
    var b = sc.nextInt();
    var c = sc.nextInt();

    a %= b    
    for(i in 1..(c - 1)) {
        a = (a * 10) % b
    }
    println((a * 10) / b)
}