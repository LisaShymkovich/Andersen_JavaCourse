import lesson13.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {
    @Test
    void testValidTriagle(){
        Triangle triangle = new Triangle();
        double area = triangle.SquareTriangle(3,4,5);
        assertEquals(6.0, area, 0.0001, "Area calculation failed for valid triangle sides");
    }

    @Test
    void testInvalidTriagle(){
        Triangle triangle = new Triangle();
        assertThrows(IllegalArgumentException.class, () -> triangle.SquareTriangle(1, 2, 10), "Exception expected for invalid triangle sides");
    }

    @Test
    void testNegativeValues(){
        Triangle triangle = new Triangle();
        assertThrows(IllegalArgumentException.class, () -> triangle.SquareTriangle(-1, 2, 3), "Exception expected for non-positive sides");
    }

    @Test
    void testZeroValues(){
        Triangle triangle = new Triangle();
        assertThrows(IllegalArgumentException.class, () -> triangle.SquareTriangle(0, 2, 3), "Exception expected for zero sides");
    }
}
