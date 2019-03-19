import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NumberConverterTest {
    static NumberConverter numberConverter;

    @BeforeAll
    public static void setup() {
        numberConverter = new NumberConverter();
    }

    @Test
    public void numberConverterShouldNotReturnNull() {
        Assertions.assertNotNull(numberConverter);
    }

    @Test
    public void numberConverterShouldImplementInterface() {
        Assertions.assertTrue(RomanNumeralGenerator.class.isAssignableFrom(numberConverter.getClass()));
    }

    @Test
    public void numberConverterShouldReject0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            numberConverter.generate(0);
        });
    }

    @Test
    public void numberConverterShouldReject4000() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            numberConverter.generate(4000);
        });
    }

    @Test
    public void numberConverterShouldReturnCorrectSymbolFor4() {
        Assertions.assertEquals("IV", numberConverter.generate(4));
    }

    @Test
    public void numberConverterShouldReturnCorrectSymbolFor58() {
        Assertions.assertEquals("LVIII", numberConverter.generate(58));
    }

    @Test
    public void numberConverterShouldReturnCorrectSymbolFor954() {
        Assertions.assertEquals("CMLIV", numberConverter.generate(954));
    }

    @Test
    public void numberConverterShouldReturnCorrectSymbolFor2007() {
        Assertions.assertEquals("MMVII", numberConverter.generate(2007));
    }

    @Test
    public void numberConverterShouldReturnCorrectSymbolFor3409() {
        Assertions.assertEquals("MMMCDIX", numberConverter.generate(3409));
    }
}
