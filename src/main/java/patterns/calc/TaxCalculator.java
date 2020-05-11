package patterns.calc;

public class TaxCalculator {
    private NdsResolver ndsResolver = new RussianNdsResolver();

    public double withNds(double price) {
        return ndsResolver.getNds() * price + price;
    }
}
