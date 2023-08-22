package Animal;

public class Fox extends Predators {
    private final String foxIcon = "\uD83E\uDD8A";

    public String getFoxIcon() {
        return foxIcon;
    }

    @Override
    public String toString() {
        return "Animal.Fox{" +
                "foxIcon='" + foxIcon + '\'' +
                '}';
    }
}
