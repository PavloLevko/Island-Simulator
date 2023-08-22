package Animal;

public class Goat extends Herbivores {
    private final String goatIcon = "\uD83D\uDC10";

    public String getGoatIcon() {
        return goatIcon;
    }

    @Override
    public String toString() {
        return "Animal.Goat{" +
                "goatIcon='" + goatIcon + '\'' +
                '}';
    }
}
