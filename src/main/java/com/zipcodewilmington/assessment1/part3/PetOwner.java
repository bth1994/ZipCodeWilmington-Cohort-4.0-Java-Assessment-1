package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String name;
    ArrayList<Pet> pets;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {

        this.name = name;
        this.pets = new ArrayList<>();
        if(pets != null) {
            this.pets.addAll(Arrays.asList(pets));
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        this.pets.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return pets.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngest = Integer.MAX_VALUE;
        for(int i = 0; i < pets.size(); i++) {
            if(pets.get(i).getAge() < youngest) {
                youngest = pets.get(i).getAge();
            }
        }
        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldest = 0;
        for(int i = 0; i < pets.size(); i++) {
            if(pets.get(i).getAge() > oldest) {
                oldest = pets.get(i).getAge();
            }
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int sum = 0;
        for(Pet pets : pets) {
            sum += pets.getAge();
        }
        return (float)sum/pets.size();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.pets.size();
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
        Pet[] newPets = new Pet[pets.size()];
        newPets = this.pets.toArray(newPets);
        return newPets;
    }
}
