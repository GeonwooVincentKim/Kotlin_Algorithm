import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    
    var a = sc.nextInt();
    var b = sc.nextInt();
    var c = sc.nextInt();

    // a.toDouble();
    // b.toDouble();
    a %= b    
    for(i in 1..(c - 1)) {
        a = (a * 10) % b
    }
    println((a * 10) / b)
    // var getValue = a.toDouble() % b.toDouble()
    // println(getValue);
    // var getValue2 = getValue.toString()

    // for(i in 1..getValue2.length){
    //     var getNum = getValue2.split("")
        
    //     if(getNum.get(i) == "."){

    //     }
    //     println(getNum.get(i + 2));
    // }

    // println(getValue);
}