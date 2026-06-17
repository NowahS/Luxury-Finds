/*
 Name: Nowah Stewart
 Pace Email: ns23285n@pace.edu

 Based on YOUR implementation:

 What is the Big O of "add" and why?
    The Big O is O(1) beacuse the only instruction that is happening is that an item is being added to the end of the array which is a constant time.

 What is the Big O of "print" and why?
    O(N) because it is iterating through the list one time to get each of the items print statements.

 What is the Big O of "lookup" and why?
    O(N) because it is iterating through the array one time to see if any of the elements match to the search.

 What is the best case runtime of "sort" and what kind of input would cause that?
    The best case runtime for sort is nlog(n), depending on which element is chosen as the pivot. If the pivot element allows for less comparisons to be made, 
    the runtime of nlog(n) will run faster.

 */
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

