package logg;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple log.
 */
public class log 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public log( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( log.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }
}