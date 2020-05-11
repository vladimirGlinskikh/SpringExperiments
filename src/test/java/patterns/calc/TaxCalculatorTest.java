package patterns.calc;

import org.junit.Assert;
import org.junit.Test;

public class TaxCalculatorTest {

    @Test
    public void withNds() {
        double withNds = new TaxCalculator().withNds(100);
        Assert.assertEquals(120, withNds, 0.00001);
    }
}