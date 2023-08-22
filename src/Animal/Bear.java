package Animal;

public class Bear extends Herbivores {
        private final String bearIcon = "\uD83D\uDC3B";

        public String getBoarIcon() {
            return bearIcon;
        }

    @Override
    public String toString() {
        return "Animal.Bear{" +
                "bearIcon='" + bearIcon + '\'' +
                '}';
    }
}
