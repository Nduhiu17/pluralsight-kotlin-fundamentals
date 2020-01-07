package io.kotlin.fundamentals

val action = {println("Hello, World")}

val calculation: (Int,Int) -> Int = {x, y -> x *y}

fun doSomething(func: () -> Unit){
    func()
}


fun main(args: Array<String>) {
    doSomething(action)
}