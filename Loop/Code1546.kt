import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    var a = sc.nextInt();
    var sum = 0.0;
    var max = -1;
    for(i in 1..a){
        var b = sc.nextInt();
        if(b > max){
            max = b;
        }
        sum += b;
    }

    println((sum / max) * 100.0);
    println(((sum / max) * 100.0) / a);
}