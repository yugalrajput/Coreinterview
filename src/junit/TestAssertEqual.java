package junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAssertEqual {

    @Test
    public void testAssertEqual() {

        int arry[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = Calculation.findMax(arry);
        assertEquals(9, max);
    }

}
