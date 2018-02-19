package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
     String name;
     int age;
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {
        if(name == null || age == null) {
            throw new NullPointerException();
        }
        super.name = name;
        super.age = age;
    }

    /**
     * @param age age of this dog
     */
    public Dog(int age) {
        super.age = age;
        super.name = "Dog name";
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        super.name = name;
    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        super.name = "Dog name";
        super.age = 0;
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
