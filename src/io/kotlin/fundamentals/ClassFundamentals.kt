package io.kotlin.fundamentals

class ClassFundamentals {
}

open class Person {
    var firstName: String = ""
    var lastName : String = ""

    open fun getName() : String  = "$firstName $lastName"
}

class Student(val id: Int ): Person(){

    override fun getName(): String {
        return super.getName()
    }
}

sealed class PersonEvent {
    class Awake : PersonEvent()
    class Asleep: PersonEvent()
    class Eating(val food: String) : PersonEvent()
}


fun handlePersonEvent(event: PersonEvent){
    when(event){
        is PersonEvent.Awake -> print("Awake")
        is PersonEvent.Asleep -> print("Asleep")
        is PersonEvent.Eating -> print(event.food)
    }
}


fun main() {
    val event = PersonEvent.Eating("Mayonaasee")
    handlePersonEvent(event)

    val person1 = Student(1)
    print(person1.id)
}


data class Events(val eventId: String)
