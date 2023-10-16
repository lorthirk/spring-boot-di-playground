package it.lorthirk.springbootdiplayground.people.qa

import it.lorthirk.springbootdiplayground.core.Person
import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.context.annotation.Bean

@AutoConfiguration
class QaAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    fun daniel(): Person = Daniel()
}
