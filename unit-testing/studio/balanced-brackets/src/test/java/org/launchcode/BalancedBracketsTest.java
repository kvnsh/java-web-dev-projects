package org.launchcode;

import org.junit.jupiter.api.Test;

import javax.print.DocFlavor;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }


    @Test
    public void stringWithBalanceBracketsCase1() {
        String test = "[LaunchCode]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(test));
    }
    @Test
    public void stringWithBalanceBracketsCase2() {
        String test = "Launch[Code]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(test));
    }

    @Test
    public void stringWithBalanceBracketsCase3() {
        String test = "Launch[Code]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(test));
    }

    @Test
    public void stringWithNotBalanceBracketsCase1() {
        String test = "[LaunchCode";
        assertFalse(BalancedBrackets.hasBalancedBrackets(test));
    }

    @Test
    public void stringWithNotBalanceBracketsCase2() {
        String test = "Launch]Code[";
        assertTrue(BalancedBrackets.hasBalancedBrackets(test));
    }

    @Test
    public void stringWithNotBalanceBracketsCase3() {
        String test = "[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(test));
    }

    @Test
    public void stringWithNotBalanceBracketsCase4() {
        String test = "][";
        assertTrue(BalancedBrackets.hasBalancedBrackets(test));
    }
    @Test
    public void stringWithNotBalanceBracketsCase5() {
        String test = "][][";
        assertTrue(BalancedBrackets.hasBalancedBrackets(test));
    }

}