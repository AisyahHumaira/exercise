/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.java;

/**
 *
 * @author User
 */
public class resume {
    public static void main(String[] args){
        BiodataAisyah b = new BiodataAisyah();
        Cgpa1 c= new Cgpa1();
        System.out.println("My name is " );
        String name = b.name;
        System.out.println("Cgpa from method is "+c.Cgpa);
        b.printBiodataAisyah();
        c.printCgpa();
        
                
    }
}
