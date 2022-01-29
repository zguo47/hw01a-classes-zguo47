package sol;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Homework1ATest {

    /**
     * Example test method.
     * Test methods must have @Test before the method
     */
    @Test
    public void testExample() {
        // example syntax for assertEquals
        Assert.assertEquals(1+1, 2);
    }

    /**
     * The format for testing Exceptions
     * @Test(expected = <exception-type>.class)
     * public void <test-name>() {
     *      code that results in exception
     * }
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        // example syntax for testing exceptions
        // when writing your own tests try testing constructors or code that would throw an error
        throw new IllegalArgumentException("Incorrect inputs");
    }

    /**
     * It is helpful to put your tests in different methods! When the tester fails,
     *  it will let you know what method had the failing test.
     */
    @Test
    public void testExampleFailure() {
        /* Do not include this test in your final submission. We only include it to
           show you what a failed test looks like. Feel free to delete it! */
        Assert.assertEquals(1+1, 2000000);
    }
}