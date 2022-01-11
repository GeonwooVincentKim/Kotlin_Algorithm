import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    var a = sc.nextInt()
    var b = sc.nextInt()

    var sum = 0;

    var months = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);

    for(i in 1..12){
        if (i == a){
            break;
        }
        sum += months.get(i)
    }
    println("check for the first-time -> $sum");

    sum += b;
    println("check for the second-time -> $sum");

    var left = sum % 7;
    when(left) {
        0 -> println("SUN");
        1 -> println("MON");
        2 -> println("TUE");
        3 -> println("WED");
        4 -> println("THU");
        5 -> println("FRI");
        6 -> println("SAT");
    }    
}