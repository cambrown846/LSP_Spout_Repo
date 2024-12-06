package org.howard.edu.lsp.finalexam.question3;

public class ShapeRenderer {

    private ShapeFactory shapeFactory;

    public ShapeRenderer() {
        shapeFactory = ShapeFactory.getInstance();  // Singleton access
    }

    public void renderShape(String shapeType) {
        Shape shape = shapeFactory.getShape(shapeType);
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("circle");    // Output: Drawing a Circle
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
        renderer.renderShape("triangle");  // Output: Drawing a Triangle
        renderer.renderShape("hexagon");   // Output: Drawing a Hexagon
    }
}

