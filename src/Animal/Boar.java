package Animal;

public class Boar extends Herbivores {
    private final String boarIcon = "\uD83D\uDC17";

    public String getBoarIcon() {
        return boarIcon;
    }

    @Override
    public String toString() {
        return "Animal.Boar{" +
                "boarIcon='" + boarIcon + '\'' +
                '}';
    }
}
