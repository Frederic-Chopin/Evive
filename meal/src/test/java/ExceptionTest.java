import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;



public class ExceptionTest<SystemOutRule> {
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
    public void testMissingMainSideBreakfast() {
        String[] args = {"Breakfast", "3", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Unable to process: Main is missing, side is missing\r\n\r\n", out.toString());
    }

    @Test
    public void testMissingMainBreakfast() {
        String[] args = {"Breakfast", "2,3", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Unable to process: Main is missing\r\n\r\n", out.toString());
    }

    @Test
    public void testMissingSideBreakfast() {
        String[] args = {"Breakfast", "1,3", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Unable to process: Side is missing\r\n\r\n", out.toString());
    }

    @Test
    public void testMultipleMainBreakfast() {
        String[] args = {"Breakfast", "1,1,2,3", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Eggs cannot be ordered more than once\r\n\r\n", out.toString());
    }

    @Test
    public void testMultipleSideBreakfast() {
        String[] args = {"Breakfast", "1,2,3,2,2", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Toast cannot be ordered more than once\r\n\r\n", out.toString());
    }


    @Test
    public void testMissingMainSideLunch() {
        String[] args = {"Lunch", "3", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Unable to process: Main is missing, side is missing\r\n\r\n", out.toString());
    }

    @Test
    public void testMissingMainLunch() {
        String[] args = {"Lunch", "2,3", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Unable to process: Main is missing\r\n\r\n", out.toString());
    }

    @Test
    public void testMissingSideLunch() {
        String[] args = {"Lunch", "1,3", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Unable to process: Side is missing\r\n\r\n", out.toString());
    }

    @Test
    public void testMultipleMainLunch() {
        String[] args = {"Lunch", "1,1,2,3", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Sandwich cannot be ordered more than once\r\n\r\n", out.toString());
    }

    @Test
    public void testMultipleDrinkLunch() {
        String[] args = {"Lunch", "1,2,3,3,3", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Soda cannot be ordered more than once\r\n\r\n", out.toString());
    }

    @Test
    public void testMissingMainSideDinner() {
        String[] args = {"Dinner", "4,3", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Unable to process: Main is missing, side is missing\r\n\r\n", out.toString());
    }

    @Test
    public void testMissingMainDinner() {
        String[] args = {"Dinner", "2,3,4", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Unable to process: Main is missing\r\n\r\n", out.toString());
    }

    @Test
    public void testMissingSideDinner() {
        String[] args = {"Dinner", "4,1,3", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Unable to process: Side is missing\r\n\r\n", out.toString());
    }

    @Test
    public void testMissingDessertDinner() {
        String[] args = {"Dinner", "2,1,3", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Unable to process: Dessert is missing\r\n\r\n", out.toString());
    }

    @Test
    public void testMultipleMainDinner() {
        String[] args = {"Dinner", "1,1,2,3,4", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Steak cannot be ordered more than once\r\n\r\n", out.toString());
    }

    @Test
    public void testMultipleSideDinner() {
        String[] args = {"Dinner", "1,2,2,3,4", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Potatoes cannot be ordered more than once\r\n\r\n", out.toString());
    }

    @Test
    public void testMultipleDrinkDinner() {
        String[] args = {"Dinner", "1,2,3,3,4", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Wine cannot be ordered more than once\r\n\r\n", out.toString());
    }

    @Test
    public void testMultipleDessertDinner() {
        String[] args = {"Dinner", "1,2,4,3,4", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Cake cannot be ordered more than once\r\n\r\n", out.toString());
    }

    @Test
    public void testMissingInput() {
        String[] args = {"Breakfast", "", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Please input integers after the meal type\r\n", out.toString());
    }

    @Test
    public void testMissingInput2() {
        String[] args = {"Lunch", " ", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Please input integers after the meal type\r\n", out.toString());
    }

    @Test
    public void testMissingInput3() {
        String[] args = {"Breakfast", "abc", "n"};
        Main main = new Main();
        main.main(args);
        assertEquals("Please input integers after the meal type\r\n", out.toString());
    }


}