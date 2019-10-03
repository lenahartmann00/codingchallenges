package lena;

import org.junit.Test;

import static org.junit.Assert.*;

public class RowSumOddNumbersTest {

    @Test
    public void rowSumOddNumbers() {
        assertEquals(1, RowSumOddNumbers.rowSumOddNumbers(1));
        assertEquals(8, RowSumOddNumbers.rowSumOddNumbers(2));
        assertEquals(7+9+11, RowSumOddNumbers.rowSumOddNumbers(3));
        assertEquals((13+15+17+19), RowSumOddNumbers.rowSumOddNumbers(4));
        assertEquals((21+23+25+27+29), RowSumOddNumbers.rowSumOddNumbers(5));
    }
}