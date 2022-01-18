import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    
    var a = sc.nextInt();
    var b = sc.nextInt();

    if(b < 45){
        a--;
        b = 60 - (45 - b);

        if(a < 0){
            a = 23;
        }
        print("$a" + " " + "$b");
    } else {
        print("$a" + " " + "${b - 45}")
    }
}