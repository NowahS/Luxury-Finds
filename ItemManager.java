import java.util.ArrayList;

public class ItemManager {
    
    ArrayList<Item> itemList = new ArrayList<Item>();
    
    public void add(Item x){
        itemList.add(x);
    }

    public void print(){
        for(Item i : itemList){
            i.print();
        }
    }

    public void lookup(String search){
        boolean found = false;
        for(Item i : itemList){
            if(i.getName().compareTo(search) == 0){
                System.out.println("Item: " + i.getName() + " Price: " + i.getPrice());
                found = true;
            }
        }
        if(!found){
            System.out.println("Item not found");
        }
    }

    public void sort(){
        if(itemList.size() > 1){
            quickSort(0, itemList.size() - 1);
        }
    }

    public void swap(int p1, int p2){
        Item temp = itemList.get(p1);
        itemList.set(p1, itemList.get(p2));
        itemList.set(p2, temp);
    }

    public int partition(int left, int right){
        int pivot = right;
        int p1 = left;
        int p2 = pivot - 1;

        while(p1 <= p2){
            if(itemList.get(p1).getName().compareTo(itemList.get(pivot).getName()) > 0){
                swap(p1, p2);
                swap(p2, pivot);
                pivot--;
                p2 = pivot - 1;
            }
            else{
              p1++;
            }
        }
        return pivot;
    }

    public void quickSort(int left, int right){
        if(left < right){
            int pivot = partition(left, right);
            quickSort(left, pivot - 1);
            quickSort(pivot + 1, right);
        }
    }

}