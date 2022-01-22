import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    
    var sum = 0;
    for(i in 1..5){
        var a = sc.nextInt();
        a *= a;

        sum += a;
    }
    println(sum % 10)

}