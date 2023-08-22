package Animal;

public class Caterpillar extends Herbivores {
    private final String caterpillarIcon = "\uD83D\uDC1B";

    public String getCaterpillarIcon() {
        return caterpillarIcon;
    }

    @Override
    public String toString() {
        return "Animal.Caterpillar{" +
                "caterpillarIcon='" + caterpillarIcon + '\'' +
                '}';
    }
}
