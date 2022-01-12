import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    while(sc.hasNextLine()){
        var a = sc.nextInt();
        var b = sc.nextInt();
        var c = sc.nextInt();

        if(a == 0 && b == 0 && c == 0){
            break;
        }

        if((a * a + b * b) == c * c){
            println("right");
        } else if((a * a + c * c) == b * b){
            println("right");
        } else  if((b * b + c * c) == a * a){
            println("right");
        } else {
            println("wrong");
        }
    }
}
