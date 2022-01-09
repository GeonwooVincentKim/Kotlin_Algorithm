# ReadMe Loop

ReadMe file for learning `Loop` of Kotlin

## General Loop

- Use `For-Loop` Only

```kotlin
val items = listOf("list1", "list2", "list3")

for (item in items){
    print(item)
}
```

## Items with Array

- Use `Array`, and Use `Array.size` to find out the `Size of Array`
- But `Array.size` could shows the size of array bigger then an Array 1 more size, use `items.size - 1` to see correct size of Array

```kotlin
val items = listOf("list1", "list2", "list3")

for(i in 0..(items.size - 1)){
    print(items[index])
}
```