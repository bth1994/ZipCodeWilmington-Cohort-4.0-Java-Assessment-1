package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
    private Pet[] pets;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        if(name.equals(null) || pets.equals(null)) {
            throw new NullPointerException();
        }
        this.name = name;
        this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public boolean addPet(Pet pet) {
        for(int index = 0; index < pets.length; index++) {
            if(pets[index] == null) {
                pets[index] = pet;
                return true;
            }
        }
        return false;
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public boolean removePet(Pet pet) {
        for(int index = 0; index < pets.length; index++) {
            if(pets[index] == pet) {
                pets[index] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return Arrays.asList(pets).contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngest = Integer.MAX_VALUE;
        for(Pet pet : pets){
            if(pet.getAge() < youngest) {
                youngest = pet.getAge();
            }
        }

        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        return null;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        return null;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return null;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        if(pets[0] == null) {
            return null;
        } else {
            return this.pets;
        }
    }
}
