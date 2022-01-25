import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    var a = sc.nextInt();

    var num = a
    var sum: Int
    var count = 0

    do {
        sum = num / 10 + num % 10;
        num = num %  10 * 10 + sum % 10
        count++
    } while(a != num);

    println(count);
}