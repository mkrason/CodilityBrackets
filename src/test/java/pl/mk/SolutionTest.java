package pl.mk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testSumOfLeftBrackets1() {
        int result = solution.solution("{{}}");
        assertEquals(2, result);
    }

    @Test
    public void testSumOfLeftBrackets2() {
        int result = solution.solution("{{}}}}{");
        assertEquals(4, result);
    }

    @Test
    public void testSumOfLeftBrackets3() {
        int result = solution.solution("}}");
        assertEquals(2, result);
    }

    @Test
    public void testSumOfLeftBrackets4() {
        int result = solution.solution("{{");
        assertEquals(0, result);
    }

}