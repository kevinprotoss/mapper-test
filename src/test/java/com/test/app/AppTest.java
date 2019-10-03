package com.test.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAppHasACode() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getCode());
    }
}
