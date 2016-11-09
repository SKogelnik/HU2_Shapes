package shapes;

import shapes.model.threeDimensional.Pyramide;
import shapes.model.threeDimensional.Quader;
import shapes.model.threeDimensional.Zylinder;
import shapes.model.twoDimensional.Kreis;
import shapes.model.twoDimensional.Rechteck;
import shapes.model.twoDimensional.Shape2D;
import shapes.model.threeDimensional.Shape3D;
import shapes.model.twoDimensional.Trapez;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stefan on 09.11.2016.
 */
public class Main {


    public static void main(String[] args) {
        List<Shape2D> l2d = new ArrayList<>();
        List<Shape3D> l3d = new ArrayList<>();

        Main main = new Main();

        l2d.add(new Trapez(3.1, 3.2, 2.5, 1.5, 2.0));
        l2d.add(new Trapez(4.6, 2.2, 5.7, 4.2, 6.2));

        l2d.add(new Rechteck(3.0, 3.0));
        l2d.add(new Rechteck(5.5, 10.0));

        l2d.add(new Kreis(5.0));
        l2d.add(new Kreis(3.3));


        l3d.add(new Zylinder(3.5, 2.1));
        l3d.add(new Zylinder(7.9, 1.7));

        l3d.add(new Quader(7.1, 5.8, 5.3));
        l3d.add(new Quader(9.2, 8.4, 6.2));

        l3d.add(new Pyramide(1.1, 2.1, 3.1, 4.1, 5.1, 6.1));
        l3d.add(new Pyramide(1.3, 2.9, 8.3, 13.6, 0.6, 1.1));

        main.print2D(l2d);
        main.print3D(l3d);
    }


    public void print2D(List<Shape2D> shapeList)
    {
        Double area = 0.0;
        Double perimeter = 0.0;

        for(Shape2D shape : shapeList )
        {
            area += shape.calculateArea();
            perimeter += shape.calculatePerimeter();
        }

        System.out.println("2DShape:");
        System.out.println("Area: " + String.format("%.2f",area));
        System.out.println("Perimeter: " + String.format("%.2f",perimeter));

    }

    public void print3D(List<Shape3D> shapeList)
    {
        Double volume = 0.0;
        Double surfaceArea = 0.0;

        for(Shape3D shape : shapeList )
        {
            volume += shape.calculateVolume();
            surfaceArea += shape.calculateSurfaceArea();
        }

        System.out.println("\n3DShape:");
        System.out.println("Volume: " + String.format("%.2f",volume));
        System.out.println("Surface Area: " + String.format("%.2f",surfaceArea));

    }



}
