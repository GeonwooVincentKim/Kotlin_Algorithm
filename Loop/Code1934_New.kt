import java.util.Scanner;

fun getGCP2(a: Int, b: Int): Int = if (b == 0) a else getGCP2(b, a % b)
fun getLCM2(a: Int, b: Int): Int = a * b / getGCP2(a, b)

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    var c = sc.nextInt();
    for(i in 1..c){
        var a = sc.nextInt();
        var b = sc.nextInt();

        val lcm = getLCM2(a, b)
        println(lcm)
    }
}
