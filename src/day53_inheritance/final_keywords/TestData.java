package day53_inheritance.final_keywords;

/**
 * Test Data class that has a list of Constants
 * Values of below variables can not be changed anywhere
 */

public final class TestData {
    public static final String ADMIN_USERNAME = "admin";
    public static final String ADMIN_PASSWORD = "password123";
    public static final int MAX_WAIT_TIME = 60;
    public static final boolean STOP_IF_FAIL = true;
}

/**
 * ERROR: can not inherit from final class
 */
//class Child extends TestData {

//}
