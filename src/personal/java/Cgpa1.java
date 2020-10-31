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
public class Cgpa1 {
    double cgpa;
    double[] gpa = new double [5];
    double sum =0;
    double finalcgpa1 = 0;    
    String Cgpa;
    private double cgpa1;


    Cgpa1(){
 this.cgpa = 3.5;
 this.gpa[0] = 3.0;
 this.gpa[1] = 3.8;
 this.gpa[2] = 3.2;
 this.gpa[3] = 3.6;
 this.gpa[4] = 3.7;

}
    
 Cgpa1 (double cgpa1, double gpa[]){
this.cgpa1=3.5;
this.gpa[5];

}
 public void printGpa (){
     System.out.println("Cgpa from method is "+cgpa);
     
 }
 public void printCgpa(){
     System.out.println("Sem 1: " + gpa[0]+" Sem 2: " + gpa[1]+" Sem 3: " + gpa[2]+" Sem 4: " + gpa[3] + " Sem 5: " + gpa[4]);
	for(int i=0; i<gpa.length; i++) {
	System.out.println("Sem "+ (i+1) +" "+ gpa[i]);
 }
 }
}
 