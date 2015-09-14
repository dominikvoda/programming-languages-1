/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pj1.pkg01;

/**
 *
 * @author Dominik
 */
public class Circle implements IShape{
    
    private double r;

    public Circle(double r) {
        this.r = r;
    }
    
    @Override
    public double getCircuit() {
        return Support.PI * Support.square(this.r);
    }

    @Override
    public double getContent() {
        return 2 * Support.PI * this.r;
    }
    
    
}
