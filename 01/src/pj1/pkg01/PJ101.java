/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pj1.pkg01;

import pj1.pkg01.Shapes.*;

/**
 *
 * @author Dominik
 */
public class PJ101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int select = 5;
        IShape shape = null;
        
        switch(select){
            case 1: shape = new Square(3);
                break;
            case 2: shape = new Circle(6);
                break;
            case 3: shape = new Rhombus(3, 8);
                break;
            case 4: shape = new Rectangle(5, 9);
                break;
            case 5: shape = new Rhomboid(2, 6, 4);
                break;
        }
        
        System.out.print(shape.getName() + " content: " + shape.getContent() + "\n");
        System.out.print(shape.getName() + " circuit: " + shape.getCircuit());
    }
    
}
