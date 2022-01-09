fun main(){
    val mainValue = readLine()!!.toInt()
    print(mainValue);
    val detailValue = readLine().toString()
    var sum = 0
    
    for (i in detailValue){
        sum += (i-'0')
    }
    println(sum);
}
