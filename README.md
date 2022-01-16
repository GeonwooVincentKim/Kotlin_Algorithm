# Kotlin_Algorithm
Learning Algorithm with Kotlin

## Basic input value

- There are two ways to input the value

### `readLine()` and `read()`

```kotlin
fun main(){
    var mainValue = readLine()!!.toInt()
    println(mainValue);

    var detailValue = readLine()!!.toString()
    println(detailValue);
}
```

### `Scanner()`

- This is also one of the framework of `Java`, but it's possible to use while you code on `Kotlin`

```kotlin
import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    
    // Check new input exist 
    while(sc.hasNextLine()){
        var getInput = sc.nextInt();
        
        // # 1. If there is no input line
        if(!(sc.hasNextLine())){
            break;
        }

        // #2. Or you can deal with when user inputs
        if(getInput == 0){
            break;
        } 
    }
}
```

- Without using `hasNextLine()` or `hasNext()`, you can input directly from `userInput`

```kotlin
import java.util.Scanner;

fun main(){
    var sc: Scanner = Scannr(System.`in`);
    var a = sc.nextInt();
    println(a);
}
```

- If you want to get values more than `2` by `userInput`, you could use like this
```kotlin
import java.util.Scanner;

fun main(){
    var sc: Scanner = Scanner(System.`in`);
    var a = sc.nextInt();
    var b = sc.nextInt();
    
    // # 1. First way to `print` the values
    println(a);
    println(b);

    // # 2. Second way to `print` the values
    println("$a");
    println("$b");

    // # 3. Third way to `print` the values
    println("${a} ${b}");
}
```

## About Looop

- 