package Animal;

public class Sheep extends Herbivores {
    private final String sheepIcon = "\uD83D\uDC11";

    public String getSheepIcon() {
        return sheepIcon;
    }

    @Override
    public String toString() {
        return "Animal.Sheep{" +
                "sheepIcon='" + sheepIcon + '\'' +
                '}';
    }
}
