package io.kotlin.fundamentals

fun display(){
    print("Hello world")
}

fun display(message: String) :Boolean {
    print("Functions with parameters ${message}")
    return true
}

fun main() {
    display()
    display("Hello world")
}