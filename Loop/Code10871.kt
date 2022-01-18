import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    var a = sc.nextInt();
    var b = sc.nextInt();

    for(i in 1..a){
        var c = sc.nextInt();

        if(c < b){
            print("${c} ");
        }
    }
}
