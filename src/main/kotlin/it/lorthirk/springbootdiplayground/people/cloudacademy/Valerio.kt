package it.lorthirk.springbootdiplayground.people.cloudacademy

import it.lorthirk.springbootdiplayground.people.Person
import org.springframework.stereotype.Component

//@Component
class Valerio: Person {
    override fun getFirstName(): String {
        return "Valerio"
    }

    override fun getSecondName(): String {
        return "Barbagallo"
    }
}