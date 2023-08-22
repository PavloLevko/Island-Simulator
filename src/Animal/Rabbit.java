package Animal;

public class Rabbit extends Herbivores {
    private final String rabbitIcon = "\uD83D\uDC07";

    public String getRabbitIcon() {
        return rabbitIcon;
    }

    @Override
    public String toString() {
        return "Animal.Rabbit{" +
                "rabbitIcon='" + rabbitIcon + '\'' +
                '}';
    }
}
