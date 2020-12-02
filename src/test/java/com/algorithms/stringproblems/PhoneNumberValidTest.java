package com.algorithms.stringproblems;

import org.junit.jupiter.api.Test;

import static com.algorithms.problems.stringproblems.CheckPhoneNumberIsValid.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PhoneNumberValidTest {

    @Test
    public void testPhoneNumValidCase1() {
        assertTrue(isPhoneNumValidCase1("7857053308"));
    }

    @Test
    public void testPhoneNumHas10Digits() {
        assertTrue(isPhoneNumHas10Digits("2055550125"));
        assertFalse(isPhoneNumHas10Digits("205555"));
        assertFalse(isPhoneNumHas10Digits("205553232323235"));
    }

    @Test
    public void testPhoneNumHasDotsOrHyphen() {
        assertTrue(isPhoneNumHasDotsOrHyphen("202 555 0125"));
        assertTrue(isPhoneNumHasDotsOrHyphen("202-555-0125"));
    }

    @Test
    public void testPhoneNumHasParen() {
        assertTrue(isPhoneNumHasParen("(202) 555-0125"));
    }

}
