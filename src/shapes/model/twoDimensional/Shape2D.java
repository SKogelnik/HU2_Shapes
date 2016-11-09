package shapes.model.twoDimensional;

import shapes.model.GeometricShape;

/**
 * Created by Stefan on 09.11.2016.
 */
public abstract class Shape2D extends GeometricShape {

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
