package com.example.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
<<<<<<< Updated upstream
=======

    @Test
    public void stringCheckTest_False() {
        //expect false
        Validator test = new Validator();
        boolean result = test.strCheck("password");
        assertFalse(result);
    }

    @Test
    public void stringLenTest_True() {
        //expect true
        Validator test = new Validator();
        boolean result = test.strLenCheck("This_is_a_long_password");
        assertTrue(result);
    }

    @Test
    public void stringLenTest_False() {
        //expect false
        Validator test = new Validator();
        boolean result = test.strLenCheck("short");
        assertFalse(result);
    }

    @Test
    public void stringSpecial() {
        //expect true
        Validator test = new Validator();
        boolean result = test.stringHasSpecial("Psych&CS");
        assertTrue(result);
    }

    @Test
    public void stringNotSpecial() {
        //expect false
        Validator test = new Validator();
        boolean result = test.stringHasSpecial("CSCI3130 ");
        assertFalse(result);
    }

    @Test
    public void stringNumTest() {
        //expect true
        Validator test = new Validator();
        boolean result = test.stringHasNum("I'm number 4");
        assertTrue(result);
    }

    @Test
    public void stringNumTest_False() {
        //expect false
        Validator test = new Validator();
        boolean result = test.stringHasNum("I'm number one");
        assertFalse(result);
    }

    @Test
    public void stringCase_True() {
        //expect true
        Validator test = new Validator();
        boolean result = test.stringHasCase("This_will_pass");
        assertTrue(result);
    }

    @Test
    public void strCase_False() {
        //expect false
        Validator test = new Validator();
        boolean result = test.stringHasCase("THISFAILS");
        assertFalse(result);
    }

    @Test
    public void stringCase_False() {
        //expect false
        Validator test = new Validator();
        boolean result = test.stringHasCase("sodoesthis");
        assertFalse(result);
    }

>>>>>>> Stashed changes
}