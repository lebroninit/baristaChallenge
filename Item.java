public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    
    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }
    // GETTERS & SETTERS  - for name and price
    public double getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }
}
