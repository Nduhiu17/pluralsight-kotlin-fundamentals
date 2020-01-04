package io.kotlin.fundamentals

data class Books(val title: String,
                 val author: String){
    val allCourses = listOf(Course(1,"Helmingsway"),Course(2,"King'ong'goini"))
}

fun main() {
    val rangeOfIntegers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val smallIntegers = rangeOfIntegers.filter { it <= 4 }

    for (i: Int in smallIntegers) {
        println(i)
    }


    val meetings = listOf(Books("Jeroboam", "Wamatu"), Books("Testing", "Testing"))

    val titles: List<String> = meetings
            .filter { it.title.startsWith("T") }
            .map { meeting -> meeting.title }

    for (title in titles) print(title)

}