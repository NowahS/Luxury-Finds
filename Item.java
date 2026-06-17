public class Item{
    String name;
    double price;

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void print(){
        System.out.println(name + " " + price);
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}