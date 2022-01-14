import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    while(sc.hasNextLine()){

        var a = sc.nextInt();
        var b = sc.nextInt();

        if(a == 0 && b == 0){
            break;
        }

        if(b % a == 0){
            println("factor");
        } else if (a % b == 0){
            println("multiple");
        } else {
            println("neither");
        }

    }
}