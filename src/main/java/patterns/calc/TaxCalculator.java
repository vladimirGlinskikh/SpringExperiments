package patterns.calc;

public class TaxCalculator {
    private NdsResolver ndsResolver = new RussianNdsResolver();

    public double withNds(double price) {
        return ndsResolver.getNds() * price + price;
    }

    public static void main(String[] args) {
        double withNds = new TaxCalculator().withNds(100);
        System.out.println(withNds);
    }
}
