import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    var a = sc.nextInt();
    for(i in 1..a){
        var b = sc.nextInt();
        var sum = b * 23;
        println(sum);
    }
}