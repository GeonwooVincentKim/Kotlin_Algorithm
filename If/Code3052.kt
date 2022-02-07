import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    var arr = ArrayList<Int>()

    for (i in 0..9){
        var num = sc.nextInt();
        var remain = num % 42;

        if(!arr.contains(remain)) {
            arr.add(remain);
        }
    }

    println(arr.size);
}