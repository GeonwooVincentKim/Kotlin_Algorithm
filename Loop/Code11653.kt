import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    var a = sc.nextInt();

    var k = 2;
    while(a != 1){
        if(a % k == 0){
            println(k);
            a /= k;
        } else {
            k++;
        }
    }
}