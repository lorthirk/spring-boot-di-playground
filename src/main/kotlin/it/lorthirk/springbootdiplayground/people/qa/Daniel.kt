package it.lorthirk.springbootdiplayground.people.qa

import it.lorthirk.springbootdiplayground.people.Person

class Daniel: Person {
    override fun getFirstName(): String {
        return "Daniel"
    }

    override fun getSecondName(): String {
        return "O'Connor"
    }
}