package Animal;

public class Deer extends Herbivores {
    private final String deerIcon = "\uD83E\uDD8C";

    public String getDeerIcon() {
        return deerIcon;
    }

    @Override
    public String toString() {
        return "Animal.Deer{" +
                "deerIcon='" + deerIcon + '\'' +
                '}';
    }
}
