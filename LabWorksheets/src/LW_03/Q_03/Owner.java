package LW_03.Q_03;

public class Owner {
    // Data Member
    private String ownerName;
    private String phoneNo;

    public Owner() {
        ownerName = "Unknown";
    }

    public Owner(String ownerName, String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return ownerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
