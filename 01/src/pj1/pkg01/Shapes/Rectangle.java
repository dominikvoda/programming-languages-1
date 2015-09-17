package pj1.pkg01.Shapes;

/**
 * Created by Dominik on 17.09.2015.
 */
public class Rectangle implements IShape {

    protected double a;
    protected double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getContent(){
        return this.a * this.b;
    }

    public double getCircuit(){
        return (this.a + this.b) * 2;
    }

    public String getName(){
        return "Rectangle";
    }
}
