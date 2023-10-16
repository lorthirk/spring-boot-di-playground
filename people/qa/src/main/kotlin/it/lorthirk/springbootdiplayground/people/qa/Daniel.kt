package it.lorthirk.springbootdiplayground.people.qa

import it.lorthirk.springbootdiplayground.core.Person

class Daniel: Person {
    override fun getFirstName(): String {
        return "Daniel"
    }

    override fun getSecondName(): String {
        return "O'Connor"
    }
}
