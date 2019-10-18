package com._98elements.openapi3codegendemo.application;

import com._98elements.openapi3codegendemo.domain.Pet;

public interface PetClient {

    void create(Pet pet);

    Pet get(long petId);

}
