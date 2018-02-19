package com.zipcodewilmington.assessment1.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtilsTest {
    @Test
    public void getSumTest() {
        // : Given
        Integer[] input = { 1, 2, 3, 4, 5};
        //Was 12, changed to 15
        Integer expected = 15;

        // : When
        Integer actual = IntegerArrayUtils.getSum(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetProduct() {
        // : Given
        Integer[] input = { 1, 2, 3, 4, 5};
        Integer expected = 120;

        // : When
        Integer actual = IntegerArrayUtils.getProduct(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageTest() {
        // : Given
        Integer[] input = { 1, 2, 3, 4, 5};
        //was 2.4, changed to 3.0 (15/5 = 3)
        Double expected = 3.0;

        // : When
        Double actual = IntegerArrayUtils.getAverage(input);

        // : Then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
