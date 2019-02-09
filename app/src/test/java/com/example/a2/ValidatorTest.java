package com.example.a2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void validate() {
        String password = "okay";
        int result = 1;

        Validator validate = new Validator();
        int output = validate.Validate(password);

        assertEquals(result, output);
    }
}