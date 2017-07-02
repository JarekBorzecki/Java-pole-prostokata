package Practice_1;

/**
 * Created by jarek on 02.07.2017.
 */
public class RectangleArea {
    public static void main(String[] args) {

        Rectangle rectangle_1 = new Rectangle(17, 9);
        rectangle_1.showData();

        Rectangle rectangle_2 = new Rectangle(-11, 11);
        rectangle_2.showData();

        Rectangle rectangle_3 = new Rectangle(48, 72);
        System.out.println("Height: " + rectangle_3.getHeight());
        System.out.println("Length: " + rectangle_3.getLength());
        System.out.println("Area: " + rectangle_3.getArea());
        System.out.println("Perimeter: " + rectangle_3.getPerimeter());
    }
}
