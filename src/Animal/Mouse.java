package Animal;

public class Mouse extends Herbivores {
    private final String mouseIcon = "\uD83D\uDC01";

    public String getMouseIcon() {
        return mouseIcon;
    }

    @Override
    public String toString() {
        return "Animal.Mouse{" +
                "mouseIcon='" + mouseIcon + '\'' +
                '}';
    }
}
