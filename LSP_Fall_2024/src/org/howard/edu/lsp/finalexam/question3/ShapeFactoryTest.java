// Camryn Brown

package org.howard.edu.lsp.finalexam.question3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//JUnit 5 Test File
class ShapeFactoryTest {

    private ShapeFactory shapeFactory;

    @BeforeEach
    void setUp() {
        shapeFactory = ShapeFactory.getInstance();  
    }

 
    @Test
    void testGetCircleShape() {
        Shape shape = shapeFactory.getShape("circle");
        assertNotNull(shape, "Shape should not be null");
        assertTrue(shape instanceof Circle, "Shape should be an instance of Circle");
    }

    @Test
    void testGetRectangleShape() {
        Shape shape = shapeFactory.getShape("rectangle");
        assertNotNull(shape, "Shape should not be null");
        assertTrue(shape instanceof Rectangle, "Shape should be an instance of Rectangle");
    }


    @Test
    void testGetTriangleShape() {
        Shape shape = shapeFactory.getShape("triangle");
        assertNotNull(shape, "Shape should not be null");
        assertTrue(shape instanceof Triangle, "Shape should be an instance of Triangle");
    }

    @Test
    void testGetUnknownShape() {
        Shape shape = shapeFactory.getShape("hexagon");
        assertNull(shape, "Shape should be null for unknown type");
    }

  
    @Test
    void testSingletonShapeFactory() {
        ShapeFactory anotherShapeFactory = ShapeFactory.getInstance();
        assertSame(shapeFactory, anotherShapeFactory, "Both instances should be the same (singleton)");
    }
}
