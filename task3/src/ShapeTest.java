public class ShapeTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //Get a square object and call its draw method
        Shape square = shapeFactory.getShape("SQUARE");
        if (square != null) {
            System.out.println("Square:");
            square.draw();
            System.out.println();
        }
        //Get a circle object and call its draw method
        Shape circle = shapeFactory.getShape("CIRCLE");
        if (square != null) {
            System.out.println("Circle:");
            circle.draw();
            System.out.println();
        }

        //Get a rectangle object and call its draw method
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        if (rectangle != null) {
            System.out.println("Rectangle:");
            rectangle.draw();
            System.out.println();
        }
        //Get a invalid shape to check.
        Shape invalidShape = shapeFactory.getShape("PENTAGON");
        if (invalidShape != null) {
            invalidShape.draw();
        }
    }
}
