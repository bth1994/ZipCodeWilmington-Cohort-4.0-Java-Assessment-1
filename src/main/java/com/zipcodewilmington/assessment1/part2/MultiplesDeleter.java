package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        return MultiplesDeleter.deleteMultiples(ints, 2);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> evensOnly = new ArrayList<>();
        for(int i = 0; i < ints.length; i++) {
            if(ints[i] % 2 == 0) {
                evensOnly.add(ints[i]);
            }
        }
        return evensOnly.toArray(new Integer[evensOnly.size()]);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        return MultiplesDeleter.deleteMultiples(ints, 3);
    }


    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        return MultiplesDeleter.deleteMultiples(ints, multiple);
    }

    public static Integer[] deleteMultiples(Integer[] ints, int multiple) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for(int i = 0; i < ints.length; i++) {
            if(ints[i] % multiple != 0) {
                newArrayList.add(ints[i]);
            }
        }
        return newArrayList.toArray(new Integer[newArrayList.size()]);
    }
}
