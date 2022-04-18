# Truck_Owner
 A java program that creates a person class named Person, assigns the information from that class to the Vehicle class as a parameter named owner, and inherits the Truck class from the Vehicle class. It is aimed to learn the basics of object-oriented programming and the concept of inheritance.


## Purpose of Objects

We have assigned the following properties and behaviors to an object named truck, created from the Truck class, which we inherited from the Vehicle class:

* **Marka** : MAN
* **Owner** : Person Class(Mert)
* **Silindir** : 5
* **Capacity** : 7500.5

## Equals Method (for String Classes)

Then we created another object named truck_2 of the same class, compared it with the truck object using the equals method and returned a boolean value. The boolean value we expect should be false, as it must occupy different places in memory.

```
 Person person = new Person("Mert");
                
        Truck truck = new Truck ("MAN",5,person,7500.5);
        
        System.out.println(truck);
        
        
        Truck truck2 = new Truck (truck);
        
        System.out.println(truck2.equals(truck));
  
```

### Output

```
Marka: MAN
Silindir: 5
Name: Mert
Capacity: 7500.5
false
```
