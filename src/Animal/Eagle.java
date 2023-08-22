package Animal;

public class Eagle extends Predators {
    private final String eagleIcon = "\uD83E\uDD85";

    public String getEagleIcon() {
        return eagleIcon;
    }

    @Override
    public String toString() {
        return "Animal.Eagle{" +
                "eagleIcon='" + eagleIcon + '\'' +
                '}';
    }
}
