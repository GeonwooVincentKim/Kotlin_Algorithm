import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    var a = sc.nextInt();
    var b = sc.nextInt();
    var c = sc.nextInt();

    var s1 = a - b;
    var s2 = c - b;

    var newSum = s2 / s1;

    if(s2 % s1 != 0){
        newSum++;
    }
    println(newSum);
}