package Animal;

public class Buffalo extends Herbivores {
    private final String buffaloIcon = "\uD83D\uDC03";

    public String getBuffaloIcon() {
        return buffaloIcon;
    }

    @Override
    public String toString() {
        return "Animal.Buffalo{" +
                "buffaloIcon='" + buffaloIcon + '\'' +
                '}';
    }
}
