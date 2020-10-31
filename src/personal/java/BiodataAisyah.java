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
public class BiodataAisyah {
    String name,skills,experience,talents,result;
    int age;
    
    BiodataAisyah(){
        this.name="Aisyah";
        this.age=22;
        this.skills="Teacher";
        this.experience="Assistant at school";
        this.talents="teaching";
        this.result="A";
        
    }
    BiodataAisyah(String n,String s,String e,String t,String r,int a){
        this.name= n;
        this.age= a;
        this.skills= s;
        this.experience= e;
        this.talents= t;
        this.result= r;
        
    }
    public void printBiodataAisyah (){
       BiodataAisyah obj1 = new BiodataAisyah();
       BiodataAisyah obj2= new BiodataAisyah("Aisyah","Teacher","Assistant at school","teaching","A",22);
        
        System.out.println("Name: "+obj1.name+"\n" + "Age: "+obj1.age+"\n" + "Skill: "+obj1.skills+"\n" + "Experience: "+obj1.experience+"\n" + "Talent: "+obj1.talents+"\n" + "Result: "+obj1.result+"\n" );
        System.out.println("Name: "+obj2.name+"\n" + "Age: "+obj2.age+"\n" + "Skill: "+obj2.skills+"\n" + "Experience: "+obj2.experience+"\n" + "Talent: "+obj2.talents+"\n" + "Result: "+obj2.result+"\n" );
    }
}
