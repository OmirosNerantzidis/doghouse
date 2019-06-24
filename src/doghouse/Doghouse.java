/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doghouse;

import Classes.Dog;
import java.util.Scanner;

/**
 *
 * @author omiro
 */
public class Doghouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // branch1
        
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(); // Added that to test Git branching
        
        Scanner age = new Scanner(System.in);
        System.out.println("Insert Age:");       
        dog1.setAge(age.nextInt());
        
        dog1.setBreed("Maltese");
        dog1.setColor("White");
        dog1.setSize("Small");
        
        System.out.println(dog1.getAge()+", "+dog1.getBreed()+", "+dog1.getColor()+", "+dog1.getSize());
    }
    
}
