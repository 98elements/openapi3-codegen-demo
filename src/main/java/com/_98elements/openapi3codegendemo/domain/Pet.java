package com._98elements.openapi3codegendemo.domain;

import java.util.List;
import java.util.Objects;

public class Pet {

    private final Long id;

    private final String name;

    private final PetStatus status;

    private final List<String> photoUrls;

    public Pet(Long id, String name, PetStatus status, List<String> photoUrls) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.photoUrls = photoUrls;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PetStatus getStatus() {
        return status;
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
                status == pet.status &&
                Objects.equals(photoUrls, pet.photoUrls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, photoUrls);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", photoUrls=" + photoUrls +
                '}';
    }
}
