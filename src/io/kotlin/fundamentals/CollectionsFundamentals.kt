package io.kotlin.fundamentals

fun main() {
    val person: List<Persons> = listOf(Persons(23))
}
data class Persons(val age: Int)