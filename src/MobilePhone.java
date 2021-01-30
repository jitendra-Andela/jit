import java.util.ArrayList;
//1
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;
//1
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
//1
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file....");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

//1
    public boolean updateContact(Contact oldcontact, Contact newContact){
        int foundPosition = findContact(oldcontact);
        if(foundPosition<0){
            System.out.println(oldcontact.getName() + ", was not found");
            return false;
        }
        this.myContacts.set(foundPosition,newContact);
        System.out.println(oldcontact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }
//2
    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " , was deleted. ");
        return true;
    }




//1
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }
//1
    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

//2
    public String queryContact(Contact contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }
}

//2
public void printContacts(){
    System.out.println("contact list:");
    for(int i=0;i<this.myContacts.size();i++){
        System.out.println((i+1) + "." +
                this.myContacts.get(i).getName() + "->" +
                this.myContacts.get(i).getPhoneNumber());
    }
}
