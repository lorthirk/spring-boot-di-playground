package it.lorthirk.springbootdiplayground.webapp.controller

import it.lorthirk.springbootdiplayground.core.Person
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
