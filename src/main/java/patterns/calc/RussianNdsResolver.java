package patterns.calc;

public class RussianNdsResolver implements NdsResolver {
    private double nds;

    public RussianNdsResolver() {
        nds = getNdsFromCentralBank();
    }

    private double getNdsFromCentralBank() {
        return 0.2;
    }

    @Override
    public double getNds() {
        return nds;
    }
}
