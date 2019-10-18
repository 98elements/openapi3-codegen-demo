package com._98elements.openapi3codegendemo.infrastructure.services.pets

import com._98elements.openapi3codegendemo.application.PetClient
import com._98elements.openapi3codegendemo.domain.Pet
import com._98elements.openapi3codegendemo.domain.PetStatus
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class PetClientImplntegrationTest extends Specification {

    @Autowired
    PetClient petClient

    def 'should create a pet'() {
        given:
        def photoUrl = 'https://cdn.pixabay.com/photo/2017/02/20/18/03/cat-2083492_1280.jpg'
        def pet = new Pet(1, 'cat', PetStatus.AVAILABLE, [photoUrl])

        when:
        petClient.create(pet)

        then:
        petClient.get(pet.id) == pet
    }

}
