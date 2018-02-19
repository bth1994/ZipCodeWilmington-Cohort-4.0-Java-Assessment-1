package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int occurrences = 0;
        for(int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToCount)) {
                occurrences++;
            }
        }
        return occurrences;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Integer objectToRemoveCount = ArrayUtils.getNumberOfOccurrences(objectArray, objectToRemove);
        Object[] newObjectArray = Arrays.copyOf(objectArray, objectArray.length - objectToRemoveCount);

        int newObjectArrayIndex = 0;
        for(int i = 0; i < objectArray.length; i++) {
            if(!(objectArray[i].equals(objectToRemove))) {
                newObjectArray[newObjectArrayIndex] = objectArray[i];
                newObjectArrayIndex++;
            }
        }
        return newObjectArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int numOfOccurrences = 0;
        int previousNumOfOccurrences = 0;
        Object mostCounted = 0;

        for(int i = 0; i < objectArray.length; i++) {
            numOfOccurrences = ArrayUtils.getNumberOfOccurrences(objectArray, objectArray[i]);
            if(numOfOccurrences > previousNumOfOccurrences) {
                previousNumOfOccurrences = numOfOccurrences;
                mostCounted = objectArray[i];
            }
        }
        return mostCounted;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int numOfOccurrences = 0;
        Integer previousNumOfOccurrences = Integer.MAX_VALUE;
        Object leastCounted = 0;

        for(int i = 0; i < objectArray.length; i++) {
            numOfOccurrences = ArrayUtils.getNumberOfOccurrences(objectArray, objectArray[i]);
            if(numOfOccurrences < previousNumOfOccurrences) {
                previousNumOfOccurrences = numOfOccurrences;
                leastCounted = objectArray[i];
            }
        }
        return leastCounted;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {
        Integer[] combinedArrays = new Integer[objectArray.length + objectArrayToAdd.length];
        int j = 0;
        for(int i = 0; i < combinedArrays.length; i++) {
            if(i < objectArray.length) {
                combinedArrays[i] = objectArray[i];
            } else {
                combinedArrays[i] = objectArrayToAdd[j];
                j++;
            }
        }
        return combinedArrays;
    }
}
