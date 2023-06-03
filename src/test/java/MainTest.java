import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {


    @Test
    void yieldDrei_whenPuttingIn3() {
        int number = 3;

        String actual = Main.numberWord(number);
        String expected = "Drei";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void yieldEins_whenPuttingIn1() {
        int number = 1;

        String actual = Main.numberWord(number);
        String expected = "Eins";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void yieldZehn_whenPuttingIn10() {
        int number = 10;

        String actual = Main.numberWord(number);
        String expected = "Zehn";

        Assertions.assertEquals(expected, actual);
    }


}
