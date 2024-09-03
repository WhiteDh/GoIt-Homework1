class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        Circle circle = new Circle(5);
        printer.printShapeDetails(circle);

        Rectangle rectangle = new Rectangle(4, 6);
        printer.printShapeDetails(rectangle);

        Triangle triangle = new Triangle(3, 4);
        printer.printShapeDetails(triangle);

        Square square = new Square(4);
        printer.printShapeDetails(square);

        Ellipse ellipse = new Ellipse(5, 3);
        printer.printShapeDetails(ellipse);
    }
}