import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    var a = sc.nextInt();

    for(i in 1..a){
        var b = sc.nextInt();
        var c = sc.nextInt();
    
        // var r = 2;
        while(c != 0) {
            var r = b % c;
            b = c;
            c = r;
        }
        
        println(b);
        // println(a * r);
    }
}