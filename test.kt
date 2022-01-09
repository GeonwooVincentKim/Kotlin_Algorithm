import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    while(sc.hasNextLine()) {
        if(!(sc.hasNextLine())) {
            println("Finish Project")
            break;
        }
        println(sc.nextLine());
    }
}
