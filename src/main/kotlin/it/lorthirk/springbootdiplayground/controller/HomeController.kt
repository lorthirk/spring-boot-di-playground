package it.lorthirk.springbootdiplayground.controller

import it.lorthirk.springbootdiplayground.people.Person
import jakarta.servlet.http.HttpServletRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(
        private val person: Person
) {

    @GetMapping("/home")
    fun home(request: HttpServletRequest): String {
        println(request.method)
        println(request.requestURI)
        return "Hello ${person.getFirstName()} ${person.getSecondName()}"
    }
}
