package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void tests() {
        assertEquals("Incorrect", "camel Casing", Solution.camelCase("camelCasing"));
        assertEquals("Incorrect", "camel Casing Test", Solution.camelCase("camelCasingTest"));
        assertEquals("Incorrect", "camelcasingtest", Solution.camelCase("camelcasingtest"));
    }
}
