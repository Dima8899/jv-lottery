package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = new Random().nextInt(100) + 1;
        return new Ball(color.toString(), number);
    }

}
