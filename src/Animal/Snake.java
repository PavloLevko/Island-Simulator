package Animal;

public class Snake extends Predators {
    private final String snakeIcon = "\uD83D\uDC0D";

    public String getSnakeIcon() {
        return snakeIcon;
    }

    @Override
    public String toString() {
        return "Animal.Snake{" +
                "snakeIcon='" + snakeIcon + '\'' +
                '}';
    }
}
