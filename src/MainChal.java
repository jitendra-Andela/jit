import java.util.Scanner;

public class MainChal {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone  mobilePhone= new MobilePhone("630 159 8755");
    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printAction();
        while (!quit) {
            System.out.println("\n enter the action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\n shutting down");
                    break;
                ;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                     removeContact();
                     break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printAction();
                    break;


            }
        }
    }
//    private static void printContacts() {
//        mobilePhone.printContacts();
//    }
    private static void addNewContact(){
        System.out.println("enter new contacts name:  ");
        String name=scanner.nextLine();
        System.out.println("enter phone number:  ");
        String phone =scanner.nextLine();
        Contact newContact = Contact.createContact(name,phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("new contact added: " + name + ",phone = " + phone);
        }else{
            System.out.println("cannot add, " + name + "already on file: ");
        }
    }

    private static void updateContact(){
        System.out.println("enter existing contact name: ");
        String name = scanner.nextLine();
    }

    private static void startPhone(){
        System.out.println("starting phone:  ");
    }
    private static void printAction(){
        System.out.println("\n Available action: \n press");
        System.out.println("0- to Shutdown\n " +
                            "1- to print contact\n "+
                            "2- to add a  new contact\n "+
                            "3- to update existing  contact\n " +
                "4- to remove an existing contact\n " +
                "5- query if an existing contact exists" +
                "6- to print a list of available actions: ");
        System.out.println("choose the option: ");
    }
}
