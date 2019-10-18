package com._98elements.openapi3codegendemo.domain;

import java.util.List;
import java.util.Objects;

public class Pet {

    private final Long id;

    private final String name;

    private final List<String> photoUrls;

    public Pet(Long id, String name, List<String> photoUrls) {
        this.id = id;
        this.name = name;
        this.photoUrls = photoUrls;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(id, pet.id) &&
                Objects.equals(name, pet.name) &&
                Objects.equals(photoUrls, pet.photoUrls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, photoUrls);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photoUrls=" + photoUrls +
                '}';
    }
}
