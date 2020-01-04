package io.kotlin.fundamentals

fun main() {
    val books = listOf(Books("Kinuthia", "Kinus"), Books("Kintteia", "JK Kintussrw"))

    // U
    val listOfCourses: List<Course> = books.flatMap (Books::allCourses)
            .distinct()

    for(courses in listOfCourses){
        println(courses.title)
    }
}