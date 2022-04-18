/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz_2;

/**
 *
 * @author 90553
 */
public class Person {
    
    private String name;
    
    public Person (){
    
        name = null;
        
    }
    
    public Person(String name){
        this.name=name;
    }
    
    public Person(Person p){
    
        this.name=p.name;
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return  name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
    
        return "Name: " + getName();
    }
    
    public boolean equals(Person otherPerson){
    
        return(name.equals(otherPerson.name));
    }
}
