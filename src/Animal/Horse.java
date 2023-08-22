package Animal;

public class Horse extends Herbivores {
    private final String horseIcon = "\uD83D\uDC0E";

    public String getHorseIcon() {
        return horseIcon;
    }

    @Override
    public String toString() {
        return "Animal.Horse{" +
                "horseIcon='" + horseIcon + '\'' +
                '}';
    }
}
