package shapes.model.twoDimensional;

/**
 * Created by Stefan on 09.11.2016.
 */
public class Trapez extends Shape2D {
    private Double a, b, c, d, h;

    public Trapez() {
    }

    public Trapez(Double a, Double b, Double c, Double d, Double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Trapez trapez = (Trapez) o;

        if (a != null ? !a.equals(trapez.a) : trapez.a != null) return false;
        if (b != null ? !b.equals(trapez.b) : trapez.b != null) return false;
        if (c != null ? !c.equals(trapez.c) : trapez.c != null) return false;
        if (d != null ? !d.equals(trapez.d) : trapez.d != null) return false;
        return h != null ? h.equals(trapez.h) : trapez.h == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (a != null ? a.hashCode() : 0);
        result = 31 * result + (b != null ? b.hashCode() : 0);
        result = 31 * result + (c != null ? c.hashCode() : 0);
        result = 31 * result + (d != null ? d.hashCode() : 0);
        result = 31 * result + (h != null ? h.hashCode() : 0);
        return result;
    }

    @Override
    public double calculateArea() {
        return (a+c)/2*h;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c + d;
    }
}
