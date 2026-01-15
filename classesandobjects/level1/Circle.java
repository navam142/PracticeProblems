package classesandobjects.level1;

public class Circle {

    Double radius;

    Circle (Double radius) {
        this.radius = radius;
    }

    Double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public static void main(String[] args) {
        Circle obj = new Circle(4.0);
        System.out.println("Area of circle: "+obj.getArea());
    }
}
