package com.peaksoft;

import org.springframework.beans.factory.annotation.Value;

public class Horse implements Animal {
    @Value("${horse.name}")
    private String name;
    @Value("${horse.age}")
    private String age;
    @Value("${horse.breed}")
    private String breed;

    public Horse() {
    }

    public Horse(String name, String age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void animalPlus() {
        System.out.println("Plus hourse: Will deliver to any place.");


    }

    @Override
    public void animalMinus() {
        System.out.println("Minus hourse: There is no minus.");

    }

      @Override
    public String toString() {
        return "Fish{" + "name='" + name + '\'' + ", age='" + age + '\'' + ", breed='" + breed + '\'' + '}';
    }
}