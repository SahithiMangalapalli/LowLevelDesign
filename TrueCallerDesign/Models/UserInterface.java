package TrueCallerDesign.Models;

import TrueCallerDesign.Models.User;

public interface UserInterface {
    void createContact(User user);
    void blockContact(User user);
    void unblockContact(User user);
    void removeContact(User user);
    void updateContact(User currUser, User newUser);
    User searchContactByName(String name);
    User searchContactByNumber(String phoneNumber);
}