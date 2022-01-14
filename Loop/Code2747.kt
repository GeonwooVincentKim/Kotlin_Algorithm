import java.util.Scanner;

fun fibo(number: Int) : Int{
    if(number <= 1) return 1;
    else return fibo(number - 1) + fibo(number - 2);
}

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    var a = sc.nextInt();
    print(fibo(a-1))
}
