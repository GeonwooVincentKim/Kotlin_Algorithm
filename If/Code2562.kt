import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    var arrayList = ArrayList<Int>();
    var max = 0;
    var topValueLocate: Int = 0;

    for(i in 0..8){
        var a = sc.nextInt();
        
        arrayList.add(a);
        if(arrayList.get(i) > max){
            max = arrayList.get(i);
            topValueLocate = i + 1;
        }
    }
    println(max);
    println(topValueLocate);
}