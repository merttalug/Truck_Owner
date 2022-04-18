/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz_2;

/**
 *
 * @author 90553
 */
public class Truck extends Vehicle {
    
    private double capacity;
    
    public Truck (){
     
    super();
    capacity=0.0;
    
    
}
    
    public Truck (String marka, int silindir, Person owner,double capacity){
        
        super(marka,silindir,owner);
        
        this.capacity =capacity;
    
    }
    
    public Truck (Truck t){
    
        super(t.getMarka(),t.getSilindir(),t.getOwner());
        capacity = t.capacity;
    }

    /**
     * @return the capacity
     */
    public double getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
   
    
    public String toString (){
    
        String res = super.toString();
        res += "\n" + "Capacity: " + getCapacity();
    
        return res;
    }
    
    public boolean equals (Truck otherTruck){
    
        return (super.equals(otherTruck));
        
    }
    
    
}
