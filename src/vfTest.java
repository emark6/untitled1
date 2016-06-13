import static org.junit.Assert.*;

/**
 * Created by Admin on 25.05.2016.
 */
public class vfTest {
    private vf math;
    @org.junit.Test
    public void init() { math = new vf(); }
    @org.junit.Test
    public void tearDown() { math = null; }
    @org.junit.Test
    public void calls() {
        assertEquals(0, math.getCalls());
        math.factorial(1);
        assertEquals(1, math.getCalls());
        math.factorial(1);
        assertEquals(2, math.getCalls());
    }
    @org.junit.Test
    public void factorial() {
        assertTrue(math.factorial(0) == 1);
        assertTrue(math.factorial(1) == 1);
        assertTrue(math.factorial(5) == 120);
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void factorialNegative() {
        math.factorial(-1);
    }
    @org.junit.Test
    public void todo() {
        assertTrue(math.plus(1, 1) == 3);
    }

}