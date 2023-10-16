package it.lorthirk.springbootdiplayground.people.cloudacademy

import it.lorthirk.springbootdiplayground.people.Person
import org.springframework.stereotype.Component

@Component
class Claudio: Person {
    override fun getFirstName(): String {
        return "Claudio"
    }

    override fun getSecondName(): String {
        return "Mezzasalma"
    }
}
