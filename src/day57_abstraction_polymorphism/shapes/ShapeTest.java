package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Triangle();
        shape.draw();
        Shape circle = new Circle();
        circle.draw();
        Shape square = new Square();
        square.draw();

        /**
         * create list of Shapes and store 10 different shapes
         * using a loop print out each shape
         */
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle());
        shapes.add(new Circle());
        shapes.add(new Square());

        //System.out.println(shapes); print Hashcodes of objects
        for(Shape eachShape : shapes) {
            eachShape.draw();
        }
        drawShape(new Circle());
        drawShape(new Square());
    }
    /**
     * static method: drawShape
     * accepts object of shape
     * then calls draw() method
     */
    public static void drawShape(Shape shape) {
        System.out.println("---Drawing shape---");
        shape.draw();
    }

}
