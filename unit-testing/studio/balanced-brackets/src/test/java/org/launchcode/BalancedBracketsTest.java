package org.launchcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrueOne() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void bracketReturnTrueTwo() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void bracketReturnTrueThree() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void bracketReturnTrueFour() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void bracketReturnTrueFive() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void bracketReturnFalseOne() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void bracketReturnFalseTwo() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void bracketReturnFalseThree() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void bracketReturnFalseFour() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void bracketReturnFalseFive() {
        assertFalse(!BalancedBrackets.hasBalancedBrackets("()"));
    }
    @Test
    public void bracketReturnFalseSix() {
        assertFalse(!BalancedBrackets.hasBalancedBrackets("{}"));
    }
}