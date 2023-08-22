package Animal;

public class Duck extends Herbivores {
    private final String duckIcon = "\uD83E\uDD86";

    public String getDuckIcon() {
        return duckIcon;
    }

    @Override
    public String toString() {
        return "Animal.Duck{" +
                "duckIcon='" + duckIcon + '\'' +
                '}';
    }
}
