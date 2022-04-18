/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz_2;

/**
 * @author 90553
 */
public class Vehicle {
    private String marka;
    private int silindir;
    private Person owner;
  


    public Vehicle() {

        marka = "";
        owner = null;
        silindir = 0;

    }

    public Vehicle(String marka, int silindir, Person owner) {
        this.marka = marka;
        this.owner = owner;
        this.silindir = silindir;

    }

    public Vehicle(Vehicle m, Vehicle s, Vehicle o) {
        this.marka = new String (m.marka);
        this.owner =new Person (o.owner);
        this.silindir = s.silindir;



    }

    /**
     * @return the marka
     */
    public String getMarka() {
        return marka;
    }

    /**
     * @param marka the marka to set
     */
    public void setMarka(String marka) {
        this.marka = marka;
    }

    /**
     * @return the silindir
     */
    public int getSilindir() {
        return silindir;
    }

    /**
     * @param silindir the silindir to set
     */
    public void setSilindir(int silindir) {
        this.silindir = silindir;
    }

    /**
     * @return the owner
     */
    public Person getOwner() {
        return new Person (owner);
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(Person owner) {
        this.owner = new Person(owner);
    }

    @Override
    public String toString() {

        return "Marka: " + this.marka + "\n" + "Silindir: " + this.silindir + "\n" + owner;

    }


    public boolean equals (Vehicle otherVehicle) {

        return (marka.equals(otherVehicle)) && (owner.equals(otherVehicle));

    }


}
