package TrueCallerDesign.Models;
import java.util.HashMap;

class Activity implements UserInterface{
    
    private Trie root;
    private HashMap<String, User> phoneBook;

    Activity(){
        root = new Trie('.');
        phoneBook = new HashMap();
    }

    public void createContact(User user){
        Trie curr = root;
        String name = user.getName();
        int len = name.length();
        for(int i=0; i<len; i++){
            char c = name.charAt(i);
            int index = c - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new Trie(c);
            }
            curr = curr.children[index];
        }
        curr.endOfWord = true;
        curr.user = user;
    }

    public User searchContactByNumber(String phoneNumber){
        return phoneBook.get(phoneNumber);
    }

    public User searchContactByName(String name){

        Trie curr = root;
        int len = name.length();
        for(int i=0; i<len;i++){
            int index = name.charAt(i)-'a';
            if(curr.children[index]==null){
                return null;
            }
            curr = curr.children[index];
        }
        if(curr.endOfWord){
            return curr.user;
        }

        return null;
    }

    public void blockContact(User user){
        user.setBlocked(true);
    }
    public void unblockContact(User user){
        user.setBlocked(false);
    }
    public void removeContact(User user){
        phoneBook.remove(user);
    }
    public void updateContact(User currUser, User newUser){
        phoneBook.put(newUser.getPhoneNumber(),newUser);
        phoneBook.remove(currUser.getPhoneNumber());
    }

private class Trie{
    char c;
    Trie[] children;
    boolean endOfWord;
    User user;

    Trie(char c){
        this.c = c;
        children = new Trie[26];
        endOfWord = false;
    }
}
}

