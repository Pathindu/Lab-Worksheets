package LW_03.Q_03;

public class Bicycle {
    // Data Member
    private Owner owner;

    //Constructor: Initializes the data member
    public Bicycle() {
        owner = new Owner();
    }

    public Bicycle(String name,String num) {
        owner = new Owner(name, num);
    }

    //Returns the name of this bicycle's owner
    public String getOwnerName() {
        return owner.getName();
    }

    //Assigns the name of this bicycle's owner
    public void setOwnerName(String name) {
        owner.setName(name);
    }

    public String getPhoneNo() {
        return owner.getPhoneNo();
    }

    //Assigns the name of this bicycle's owner
    public void setPhoneNo(String num) {
        owner.setPhoneNo(num);
    }

}
