public class ShapeTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("SQUARE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("CIRCLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("TRIANGLE");
        shape3.draw();

        Shape shape4 = shapeFactory.getShape("RECTANGLE");
        shape4.draw();
    }
}
