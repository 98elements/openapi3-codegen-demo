package com._98elements.openapi3codegendemo.infrastructure.spring.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
class RestConfiguration {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
