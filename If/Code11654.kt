import java.io.BufferedReader;
import java.io.InputStreamReader;

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var str = readLine().forEach { println(it.toInt()) }
    println(str);
}