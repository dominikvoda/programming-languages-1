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
public class Square implements IShape{
    
    protected double a;
    
    public Square(double a){
        this.a = a;
    }
    
    protected Square(){}

    @Override
    public double getCircuit() {
        return 4 * a;
    }

    @Override
    public double getContent() {
        return Support.square(this.a);
    }   
    
}
