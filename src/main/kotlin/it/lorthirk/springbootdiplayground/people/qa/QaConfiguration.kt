package it.lorthirk.springbootdiplayground.people.qa

import it.lorthirk.springbootdiplayground.people.Person
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

//@Configuration
class QaConfiguration {

//    @Bean
    fun daniel(): Person = Daniel()
}
