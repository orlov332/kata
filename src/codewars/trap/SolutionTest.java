package codewars.trap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void trap() {
        var sl = new Solution();
        assertEquals(6, sl.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(9, sl.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }
}
