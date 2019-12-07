 package org.jalasoft;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
  * FindRepeatedTest
  */
 public class FindRepeatedTest {
 
     @Test
     public void test1() {
        // Arrange
        FindRepeated findRepeated = new FindRepeated();

        // Act
        int[] array1 = {2, 1, 3, 5, 3, 2};
        int[] array2 = {2, 4, 3, 5, 1};
        int[] array3 = {2, 1, 1, 5, 3, 2};
        int[] array4 = {8, 4, 6, 2, 6, 4, 7, 9, 5, 8};

        int expected1 = 3;
        int expected2 = -1;
        int expected3 = 1;
        int expected4 = 6;

        // Assert
        assertEquals(expected1, findRepeated.findIntRepeated(array1));
        assertEquals(expected2, findRepeated.findIntRepeated(array2));
        assertEquals(expected3, findRepeated.findIntRepeated(array3));
        assertEquals(expected4, findRepeated.findIntRepeated(array4));

        // Assert

     }
 }