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

for(index in 0..(items.size - 1)){
    print(items[index])
}
```

## Items with Array and Until

- Use `Array`, and Use `Array.size` to find out the `Size of Array`
- Use `until` instead of using `0..(items.size)`

```kotlin
val index = listOf("list1", "list2", "list3")

for(index in 0 until (items.size - 1)){
    print(items[index])
}
```

## Items with Arraya and Indices of Array

- Use `Array`, and Use `Array.indices` to find out the `Size of Array`
- `0..(items.size)` or `until (items.size)` has a more codes, but `array.indices` doesn't neet to use `0..(items.size` or `until (items.size)`

```kotlin
val items = listOf("list1", "list2", "list3")

for(index in items.indices){
    print(items[index])
}
```
