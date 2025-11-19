package core.basesyntax;

public class Ball {
    int number;
    String color;

    public Ball (String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{ No:" + number + ",  color: " + color + '}' ;
    }

}
