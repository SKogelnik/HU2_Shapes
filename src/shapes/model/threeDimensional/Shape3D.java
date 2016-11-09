package shapes.model.threeDimensional;

import shapes.model.GeometricShape;

/**
 * Created by Stefan on 09.11.2016.
 */
public abstract class Shape3D extends GeometricShape {

    public abstract double calculateVolume();

    public abstract double calculateSurfaceArea();

}
