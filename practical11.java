

class Shape {
    void area(float radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    void area(float length, float width) {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

public class practical11 {
    public static void main(String[] args) {

        Shape shape = new Shape();

        shape.area(5.0f);
        shape.area(4.0f, 6.0f);

    }
}