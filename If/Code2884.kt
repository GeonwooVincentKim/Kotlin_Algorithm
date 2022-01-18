import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    
    var a = sc.nextInt();
    var b = sc.nextInt();

    if(b < 60 && b > 0){
        b = 75 + b;
        b = b - 60;   
    }

    if(b == 0){
        b = 75 + b;
        b = b - 60;
    }

    if(a == 0){
        a = 23;
    } else {
        a = a - 1;
    }

    print("${a} ")
    print("${b}")
    
}