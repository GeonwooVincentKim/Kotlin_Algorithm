import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    var a = sc.nextInt();
    var b = sc.nextInt();

    for(i in 1..a){
        if(a % i == 0){
            println(i);
        }
    }

    for(j in 1..b){
        if(b % j == 0){
            println(j);
        }
    }
}