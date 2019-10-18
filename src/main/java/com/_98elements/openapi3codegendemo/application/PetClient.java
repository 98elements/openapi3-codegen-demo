package com._98elements.openapi3codegendemo.application;

import com._98elements.openapi3codegendemo.domain.Pet;

public interface PetClient {

    void create(final Pet pet);

    Pet get(final long petId);

}
