package lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
  Test for overloading multiples.
 */
public class MultiplesDefaultTest {

    //  copy this file into the test folder.
    @Test
    public void testDefault() {
        assertEquals(466,
                Multiples.multiples(),
                "Multiples.multiples() is incorrect for default values");
    }

}