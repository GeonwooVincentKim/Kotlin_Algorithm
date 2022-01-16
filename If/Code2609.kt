import java.util.Scanner;

fun getGCP(a: Int, b: Int): Int = if (b == 0) a else getGCP(b, a % b)
fun getLCM(a: Int, b: Int): Int = a * b / getGCP(a, b)

fun main(){
    var sc: Scanner = Scanner(System.`in`);

    var a = sc.nextInt();
    var b = sc.nextInt();

    val gcp = getGCP(a, b)
    val lcm = getLCM(a, b)

    println(gcp)
    println(lcm)
}
