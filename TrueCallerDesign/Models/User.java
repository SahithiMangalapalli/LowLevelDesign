package TrueCallerDesign.Models;

class User{

    private int id;
    private String name;
    private String phoneNumber;
    private boolean blocked = false;
    private boolean spamed = false;

    User(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBlocked(boolean blocked){
        this.blocked = blocked;
    }

    public void setSpamed(boolean spamed){
        this.spamed = spamed;
    }

    
}