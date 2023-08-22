public class Island {
    private int[][] locations;

    public Island(int width, int length) {
        locations = new int[width][length];
    }

    public void setLocations(int[][] locations) {
        this.locations = locations;
    }

    public int[][] getLocations() {
        return locations;
    }
}
