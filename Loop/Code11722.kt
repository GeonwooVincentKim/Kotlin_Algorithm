import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    var mainValue = sc.nextInt();
    for(i in 1..mainValue){
        val detailValue = sc.next().split(" ");

        for(j in detailValue){
            print(j.toInt());
        }
    }
}
