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
public class PJ101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int select = 2;
        IShape shape = null;
        
        switch(select){
            case 1: shape = new Square(3);
                break;
            case 2: shape = new Circle(6);
                break;
            case 3: shape = new Rhombus(3, 8);
                break;
        }
        
        System.out.print("Tvar ma obsah: " + shape.getContent() + " a obvod: " + shape.getCircuit());
        
    }
    
}
