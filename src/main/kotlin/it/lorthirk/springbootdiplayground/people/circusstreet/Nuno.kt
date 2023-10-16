package it.lorthirk.springbootdiplayground.people.circusstreet;

import it.lorthirk.springbootdiplayground.people.Person
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

//@Component
//@Primary
class Nuno: Person {
    override fun getFirstName(): String {
        return "Nuno"
    }

    override fun getSecondName(): String {
        return "Martins"
    }
}
