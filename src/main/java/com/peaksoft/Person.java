package com.peaksoft;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Person {
    private Animal animal;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    public Person() {
    }

    public Person(@Qualifier("horse") Animal animal) {
        this.animal = animal;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfoAnimal() {
        System.out.println("Person: " + getName() + ", " + getAge());
        animal.animalPlus();
        animal.animalMinus();
    }


    @Override
    public String toString() {
        return "Person{" +
                "animal=" + animal +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}