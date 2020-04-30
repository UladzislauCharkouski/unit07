package by.epam.tr.start;

import org.junit.Assert;
import org.junit.Test;

public class JunitTestTaskForTest1 {
    @Test
    public void minNumberInArrayT001() {
        int matrix [][] = {
        		{4,7,-3,17,-7},
        		{-10,-12,3,9,4},
        		{-13,3,8,10,-3}
        		};
        int realNumber;
        int expectedNumber = -13;
        realNumber = TaskForTest.minNumberInArray(matrix);
        Assert.assertEquals(expectedNumber, realNumber, 0.00000001);
    }
}
