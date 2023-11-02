package leetcode.HashTable.LoggerRateLimiter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LoggerTest {

    @Test
    void shouldPrintMessage() {
        Logger logger = new Logger();
        assertTrue(logger.shouldPrintMessage(1, "foo"));
        assertTrue(logger.shouldPrintMessage(2, "bar"));
        assertFalse(logger.shouldPrintMessage(3, "foo"));
        assertFalse(logger.shouldPrintMessage(8, "bar"));
        assertFalse(logger.shouldPrintMessage(10, "foo"));
        assertTrue(logger.shouldPrintMessage(11, "foo"));
    }
}
