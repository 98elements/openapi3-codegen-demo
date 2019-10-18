package com._98elements.openapi3codegendemo.infrastructure.services.pets

import com._98elements.openapi3codegendemo.application.PetClient
import com._98elements.openapi3codegendemo.domain.Pet
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class PetClientImplntegrationTest extends Specification {

    @Autowired
    PetClient petClient

    def 'should create a pet'() {
        given:
        def pet = new Pet(101L, 'petname2', ['url12', 'url22'])

        when:
        petClient.createPet(pet)

        then:
        petClient.getPet(pet.id) == pet
    }

}
