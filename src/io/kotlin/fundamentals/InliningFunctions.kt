package io.kotlin.fundamentals

import java.lang.Exception

fun main(args: Array<String>) {
    val listOfIntegers = listOf(1,2,3,4,5)
    val integers = first(listOfIntegers, {i -> i == 3})
    print(integers)
}

inline fun <T> first(items: List<T>,predicate: (T)-> Boolean) : T {
    for(item in items){
        if(predicate(item)) return item;
    }
    throw Exception()
}