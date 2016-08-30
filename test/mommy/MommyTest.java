package mommy;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MommyTest {

    @org.junit.Test
    public void shouldReturnSameStringWhenSingleConsonantGiven() throws Exception {
        Mommy mommy = new Mommy("H");

        String actual = mommy.handleMommy();
        String expected = "H";

        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnMommyStringWhenSingleVowelGiven() throws Exception {
        Mommy mommy = new Mommy("A");

        assertEquals("mommy", mommy.handleMommy());
    }

    @Test
    public void shouldReturnEmptyStringWhenEmptyStringGiven() throws Exception {
        Mommy mommy = new Mommy(" ");

        assertEquals(" ", mommy.handleMommy());
    }

    @Test
    public void shouldReturnHmommyStringWhenHAGiven() throws Exception {
        Mommy mommy = new Mommy("HA");

        assertEquals("Hmommy", mommy.handleMommy());
    }

    @Test
    public void shouldReturnMommyStringWhenAEGiven() throws Exception {
        Mommy mommy = new Mommy("AE");

        assertEquals("mommy",mommy.handleMommy());
    }

    @Test
    public void shouldReturnHHWhenHHGiven() throws Exception {
        Mommy mommy = new Mommy("HH");

        assertEquals("HH", mommy.handleMommy());
    }
}
