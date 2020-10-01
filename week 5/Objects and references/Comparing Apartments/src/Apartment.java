public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        if (pricePerSquare * squares >= compared.pricePerSquare * compared.squares) {
            return pricePerSquare * squares - compared.pricePerSquare * compared.squares;
        } else {
            return compared.pricePerSquare * compared.squares - pricePerSquare * squares;
        }
    }
}
