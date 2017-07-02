package Practice_1;

/**
 * Created by jarek on 02.07.2017.
 */
public class Rectangle {
    private int height = 0;
    private int length = 0;

    // Konstruktor klasy Rectangle
    public Rectangle(int h, int l) {
        setHeight(h);
        setLength(l);
    }

    // Zwraca wysokość
    public int getHeight() {
        return this.height;
    }

    // Zwraca długość
    public int getLength() {
        return this.length;
    }

    // Ustawia wysokość
    public void setHeight(int h) {
        if (check(h, "height")) {
            this.height = h;
        }
    }

    // Ustawia długość
    public void setLength(int l) {
        if (check(l, "length")) {
            this.length = l;
        }
    }

    // Zwraca pole
    public int getArea() {
        return this.height * this.length;
    }

    // Zwraca obwód
    public int getPerimeter() {
        int perimeter = (2 * this.height) + (2 * this.length);
        return perimeter;
    }

    // Wyświetla dane prostokąta
    public void showData() {
        System.out.println("Rectangle: height = " + this.height +
        ", length = " + this.length);
    }

    /*Prywatna metoda, gdyż będzie wykorzystywana tylko w tej klasie
    Sprawdza, czy podano dodatnią wartość
     */
    private boolean check(int value, String name) {
        if (value < 0) {
            System.err.println("\nError in " + name + ": " +
            value + ". Must be positive value.");

            return false;
        }

        return true;

    }
}
