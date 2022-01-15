import java.util.Scanner; 

var fibonacciData = arrayOf(0, );
fun fibonacci(n: Int) : Int{
    fibonacciData[0] = 0;
    for(i in 1..fibonacciData.size){
        print(fibonacciData.get(i));
    }

    if (n <= 2) return 1;
    return fibonacci(n - 2) + fibonacci(n - 1)
}

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    var a = sc.nextInt();

    // var fibonacciData = arrayOfNulls<Int>(100)
    println(fibonacci(a));
}