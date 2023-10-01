package codewars;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Roman2IntegerTest {

    @ParameterizedTest
    @CsvSource({
            "I,1",
            "III,3",
            "IV,4",
            "VII,7",
            "IX,9",
            "XL,40",
            "XLV,45",
            "L,50",
            "LVIII,58",
            "MCMXCIV,1994"
    })
    public void test(String roman, int expected) {
        int anInt = new Roman2Integer().romanToInt(roman);
        assertEquals(expected, anInt);
    }

}
