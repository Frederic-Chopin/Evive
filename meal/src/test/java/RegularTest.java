import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;



public class RegularTest<SystemOutRule> {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final ByteArrayOutputStream err = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setStreams() {
        System.setOut(new PrintStream(out));
        System.setErr(new PrintStream(err));
    }

    @After
    public void restoreInitialStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testSimpleBreakfast() {
        String [] args = {"Breakfast","1,2,3", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Eggs, Toast, Coffee\r\n",  out.toString());
    }

    @Test
    public void testSimpleBreakfast2() {
        String [] args = {"Breakfast","2,3,1", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Eggs, Toast, Coffee\r\n",  out.toString());
    }

    @Test
    public void testMultipleBreakfast() {
        String [] args = {"Breakfast","1,2,3,3,3", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Eggs, Toast, Coffee(3)\r\n",  out.toString());
    }

    @Test
    public void testSimpleLunch() {
        String [] args = {"Lunch","1,2,3", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Sandwich, Chips, Soda\r\n",  out.toString());
    }

    @Test
    public void testSimpleLunch2() {
        String [] args = {"Lunch","1,2", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Sandwich, Chips, Water\r\n",  out.toString());
    }

    @Test
    public void testMultipleLunch() {
        String [] args = {"Lunch","3,1,2,2,2,2,2", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Sandwich, Chips(5), Soda\r\n",  out.toString());
    }

    @Test
    public void testMultipleLunch2() {
        String [] args = {"Lunch","1,2,2", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Sandwich, Chips(2), Water\r\n",  out.toString());
    }

    @Test
    public void testSimpleDinner() {
        String [] args = {"Dinner","1,2,3,4", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Steak, Potatoes, Wine, Water, Cake\r\n",  out.toString());
    }

    @Test
    public void testSimpleDinner2() {
        String [] args = {"Dinner","1,2,4", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Steak, Potatoes, Water, Cake\r\n",  out.toString());
    }

}
