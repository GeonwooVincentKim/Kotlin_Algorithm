import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    var a = sc.nextInt();
    var b = sc.nextInt();

    var b2 = b.toString()
    // var getB2 = 0;

    for(i in b2.length downTo 1){
        var getB = b2.split("")
        // println(getB.get(i));
        // getB2 = getB.get(i).toInt();
        println(a * (getB.get(i)).toInt());
    }

    println(a * b);
}