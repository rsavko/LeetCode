package com.vgs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Validates if braces match")
class BracesAnalyzerTest {

    @Test
    @DisplayName("Nested braces are valid")
    public void testNested() {
        String input = "(([{}]))";
        boolean valid = new BracesAnalyzer().isValid(input);
        assertTrue(valid);
    }

    @Test
    @DisplayName("Nested braces are not valid")
    public void testNestedNotValid() {
        String input = "([{]})";
        boolean valid = new BracesAnalyzer().isValid(input);
        assertFalse(valid);
    }

    @Test
    @DisplayName("Not nested braces are valid")
    public void testNotNestedValid() {
        String input = "([]){}";
        boolean actual = new BracesAnalyzer().isValid(input);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Nested braces with text between are valid")
    public void nestedWithTextBetween() {
        String input = "(df[d]re)";
        boolean actual = new BracesAnalyzer().isValid(input);
        assertTrue(actual);
    }

    @Test
    @DisplayName("Not nested braces with text between are not valid")
    public void nestedWithTextBetween2() {
        String input = "(df[d]r]e)";
        boolean actual = new BracesAnalyzer().isValid(input);
        assertFalse(actual);
    }

    @Test
    @DisplayName("Loop should be valid")
    public void shouldBeValid4() {
        String input = "for (int i = 5; arr[i] < 10; i++) {}";
        boolean actual = new BracesAnalyzer().isValid(input);
        assertTrue(actual);
    }
}