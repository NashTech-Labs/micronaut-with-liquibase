package com.knoldus.micronaut.entity;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Version;

import javax.validation.constraints.NotBlank;

@MappedEntity
public class Employee {

    @Id
    @GeneratedValue(value = GeneratedValue.Type.AUTO)
    private Long id;
    @Version
    private Long version;
    @NonNull
    @NotBlank
    private String name;
    @Nullable
    private int age;

    public Employee(@NonNull String name, @Nullable int age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public Long getVersion() {
        return version;
    }

    @NonNull
    public String getName() {
        return name;
    }

    @Nullable
    public int getAge() {
        return age;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
