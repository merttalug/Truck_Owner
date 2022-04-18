/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz_2;

/**
 *
 * @author 90553
 */
public class Deneme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person person = new Person("Mert");
                
        Truck truck = new Truck ("MAN",5,person,7500.5);
        
        System.out.println(truck);
        
        
        Truck truck2 = new Truck (truck);
        
        System.out.println(truck2.equals(truck));
   
        
        
        
        
        
    }
    
}
