import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    var a = sc.nextInt();
    var b = sc.nextInt();

    var getAB = a * b

    for(i in 1..5){
        var c = sc.nextInt();
        print("${c - getAB} ");
    }
}