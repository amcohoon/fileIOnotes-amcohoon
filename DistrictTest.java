import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class for the District.
 *
 * @author  mrcallaghan
 * @version 02jan2026
 */
public class DistrictTest
{
    /**
     * Default constructor for test class DistrictTest
     */
    public DistrictTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    /**
     * A test that verifies the constructor correctly stores
     * the basic district data and the accessors return the same values.
     */
    @Test
    public void testConstructorAndGetters()
    {
        District d = new District(1, 1000, 800);

        assertEquals(1, d.getNumber());
        assertEquals(1000, d.getDemocratVotes());
        assertEquals(800, d.getRepublicanVotes());
        assertEquals(1800, d.getTotalVotes());
    }
}