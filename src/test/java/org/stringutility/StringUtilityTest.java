package org.stringutility;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilityTest {


    @Test
    void reverse() {
        String reverse = StringUtility.reverse("hello");
        assertEquals("olleh", reverse);
    }

    @Test
    void isPalindrome() {
        boolean palindrome = StringUtility.isPalindrome("madam");
        assertTrue(palindrome);
    }

    @Test
    void toUpperCase() {
        String upperCase = StringUtility.toUpperCase("hello");
        assertEquals("HELLO", upperCase);

    }
}