package TrueCallerDesign.Models;
import TrueCallerDesign.Models.Activity;
import TrueCallerDesign.Models.User;

public class Client {
    public static void main(String[] args) {
        UserInterface paul = new Activity();

        User sahi = new User("sahi", "786-987-0989");
        User karthik = new User("karthik", "897-990-7656");

        paul.createContact(sahi);
        paul.createContact(karthik);
       System.out.println(paul.searchContactByName("sahi").getPhoneNumber());
       paul.removeContact(sahi);
       System.out.println(paul.searchContactByName("sahi"));
    }
}