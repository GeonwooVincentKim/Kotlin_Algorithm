import java.util.Scanner;
import kotlin.math.hypot
import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    while(sc.hasNextLine()){
        var a = sc.nextInt();
        var b = sc.nextInt();
        var c = sc.nextInt();

        if(a == 0 && b == 0 && c == 0){
            println("루프 탈출");
            break;
        }

        print("${(a.toDouble().pow(2)).toInt()}");
    }
}