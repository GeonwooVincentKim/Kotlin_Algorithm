import java.util.Scanner;
 
fun fibonacci(n: Int) : Int{
    if (n <= 2) return 1;
    return fibonacci(n - 2) + fibonacci(n - 1)
}

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    var a = sc.nextInt();

    println(fibonacci(a));
}