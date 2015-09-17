/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pj1.pkg01.Shapes;

/**
 *
 * @author Dominik
 */
public class Rhombus extends Square{

    private double v;

    public Rhombus(double v, double a) {
        super(a);
        this.v = v;
    }
    
    public double getContent(){
        return this.a * this.v;
    }

    public String getName(){
        return "Rhombus";
    }
    
}
