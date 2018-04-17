package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem1Test {

    @Test
    public void testReplaceValues1(){
        Problem1 test = new Problem1();
        String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        String actual  = test.replaceValues(input);
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testReplaceValues2(){
        Problem1 test = new Problem1();
        String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        String actual  = test.replaceValuesRecursive(input,0);
        Assert.assertEquals(expected,actual);

    }

}
