
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ItemManager itemManager = new ItemManager();
        
        while (true){
            System.out.println("Enter a command (add, print, lookup, sort, quit):");
            String cmd = scan.nextLine();

            if(cmd.compareTo("add") == 0){
                System.out.println("Please add the name of the item you would like to add to your order:");
                String name = scan.nextLine();
                System.out.println("Please enter the price of the item:");
                double price = scan.nextDouble();
                scan.nextLine();
                Item newItem = new Item(name, price);
                itemManager.add(newItem);
            }
            else if(cmd.compareTo("print") == 0){
                itemManager.print();
            }
            else if(cmd.compareTo("lookup") == 0){
                System.out.println("What item would you like to look up?:");
                String search = scan.nextLine();
                itemManager.lookup(search);
            }
            else if(cmd.compareTo("sort") == 0){
                itemManager.sort();
            }
            else if(cmd.compareTo("quit") == 0){
                System.exit(0);
            }
        }
    }
}

