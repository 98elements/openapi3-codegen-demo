package com._98elements.openapi3codegendemo.infrastructure.services.pets;

import com._98elements.openapi3codegendemo.application.PetClient;
import com._98elements.openapi3codegendemo.domain.Pet;
import com._98elements.openapi3codegendemo.domain.PetStatus;
import com._98elements.openapi3codegendemo.infrastructure.openapi.pets.PetApi;
import com._98elements.openapi3codegendemo.infrastructure.openapi.pets.dto.PetDto;
import org.springframework.stereotype.Component;

@Component
class PetClientImpl implements PetClient {

    private final PetApi petApi;

    PetClientImpl(final PetApi petApi) {
        this.petApi = petApi;
    }

    @Override
    public void create(final Pet pet) {
        petApi.addPet(
                new PetDto()
                        .id(pet.getId())
                        .name(pet.getName())
                        .status(PetDto.StatusEnum.valueOf(pet.getStatus().name()))
                        .photoUrls(pet.getPhotoUrls())
        );
    }

    @Override
    public Pet get(final long petId) {
        final PetDto petDto = petApi.getPetById(petId);
        return new Pet(
                petDto.getId(),
                petDto.getName(),
                PetStatus.valueOf(petDto.getStatus().name()),
                petDto.getPhotoUrls()
        );
    }
}
