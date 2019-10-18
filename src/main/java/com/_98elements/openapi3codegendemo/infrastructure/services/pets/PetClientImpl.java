package com._98elements.openapi3codegendemo.infrastructure.services.pets;

import com._98elements.openapi3codegendemo.application.PetClient;
import com._98elements.openapi3codegendemo.domain.Pet;
import com._98elements.openapi3codegendemo.infrastructure.openapi.pets.PetApi;
import com._98elements.openapi3codegendemo.infrastructure.openapi.pets.dto.PetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class PetClientImpl implements PetClient {

    @Autowired
    private PetApi petApi;

    @Override
    public void createPet(Pet pet) {
        petApi.addPet(
                new PetDto()
                        .id(pet.getId())
                        .name(pet.getName())
                        .photoUrls(pet.getPhotoUrls())
        );
    }

    @Override
    public Pet getPet(long petId) {
        final PetDto petDto = petApi.getPetById(petId);
        return new Pet(
                petDto.getId(),
                petDto.getName(),
                petDto.getPhotoUrls()
        );
    }
}
