import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

    private static Scanner scanner = new Scanner(System.in);
    public static GroceryList groceryList =new GroceryList();


    public static void main(String[] args){
        boolean quit = false;
        int choice=0;
        printInstruction();
        while(!quit){
            System.out.println("enter your choice:......");
            choice=scanner.nextInt();
          //  scanner.nextInt();

            switch(choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit=true;
                    break;
            }
        }
    }

    public static void printInstruction(){
        System.out.println("\n Press ");
        System.out.println("\t 0-to print choice question  ");
        System.out.println("\t 1- to print the grocery items ");
        System.out.println("\t 2- to add an item to the list");
        System.out.println("\t 3- to modify an item in the list");
        System.out.println("\t 4- to remove an item in the list");
        System.out.println("\t 5- to search for an item in the list ");
        System.out.println("\t 6- to quit the application");
    }
    public static void addItem() {
        System.out.println("please enter the grocery list:   ");
        String item=scanner.next();
        groceryList.addGroceryItem(item);
    }
    public static void modifyItem(){
         System.out.println("enter an item number: ");
         int itemNo=scanner.nextInt();
         scanner.nextLine();
         System.out.println("enter the replacement item:");
         String newItem=scanner.nextLine();
         groceryList.modifyGroceryItem(itemNo-1,newItem);
    }
    public static void removeItem(){
        System.out.println("enter an item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem=scanner.nextLine();
        if(groceryList.findItem(searchItem)!=null){
            System.out.println("found " +searchItem + "in our grocery list");
        }else{
            System.out.println(searchItem + " is not in the shopping list ");
        }
    }
    /*public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGrocerylist());
        String[] myArray =new String[groceryList().getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);

    }*/
    }