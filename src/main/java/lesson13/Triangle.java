package lesson13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Triangle {
    private static final Logger logger = LoggerFactory.getLogger(Triangle.class);

    public double SquareTriangle (int a, int b, int c){
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            logger.error("Invalid triangle sides: {}, {}, {}", a, b, c);
            throw new IllegalArgumentException("Invalid triangle sides");
        }
        double perimetr = (a+b+c)/2;
        double square = Math.sqrt(perimetr*(perimetr - a ) * (perimetr - b) * (perimetr - c));
        logger.info("Calculated area for sides {}, {}, {}: {}", a, b, c, square);
        return square;


    }
}
