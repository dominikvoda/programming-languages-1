

package pj1.pkg01.Shapes;


public class Rhomboid extends Rectangle {

    private double va;

    public Rhomboid(double a, double b, double va) {
        super(a, b);
        this.va = va;
    }

    public double getContent(){
        return this.a * this.va;
    }

    public String getName(){
        return "Rhomboid";
    }
}
