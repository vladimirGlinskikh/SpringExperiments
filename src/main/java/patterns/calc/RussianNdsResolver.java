package patterns.calc;

import lombok.SneakyThrows;

public class RussianNdsResolver implements NdsResolver {
    private double nds;

    public RussianNdsResolver() {
        nds = getNdsFromCentralBank();
    }

    @SneakyThrows
    private double getNdsFromCentralBank() {
        Thread.sleep(2000);
        return 0.18;
    }

    @Override
    public double getNds() {
        return nds;
    }
}
