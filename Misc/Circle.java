public class Circle {
    private double _radius = 5.5;

    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.printArea();
    }

    public double printArea() {
        double area = (3.14 * _radius * _radius);
        System.out.println(3.14 * _radius * _radius);
        return area;
    }
}