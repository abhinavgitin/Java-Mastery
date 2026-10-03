package practise;

public class Place extends Item {
    String coordinates;
    float rating;


    public Place(String name, String coordinates, float amount, float rating) {
        super(name, amount);
        this.coordinates = coordinates;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Place{" + "coordinates='" + coordinates + '\'' + ", rating=" + rating + '}';
    }
}
