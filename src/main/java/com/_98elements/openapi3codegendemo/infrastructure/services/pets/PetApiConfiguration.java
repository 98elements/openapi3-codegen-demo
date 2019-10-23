package com._98elements.openapi3codegendemo.infrastructure.services.pets;

import com._98elements.openapi3codegendemo.infrastructure.openapi.pets.ApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
class PetApiConfiguration {

    @Autowired
    private ApiClient apiClient;

    @PostConstruct
    void setupPetApiUrl() {
        apiClient.setBasePath("http://petstore.swagger.io:8080/api/v3");
    }

}
