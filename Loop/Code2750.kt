import java.io.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    val arr = ArrayList<Int>()

    // 숫자를 배열에 넣기
    for (i in 1..N) {
        val num = br.readLine().toInt()
        arr.add(num)
    }

    // 배열 정렬
    arr.sort()

    // 결과
    for (k in arr) {
        println(k)
    }

    br.close()

}