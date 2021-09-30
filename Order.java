import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items = new ArrayList<Item>(); // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name = "Guest";
        this.ready = false;
    }
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name){
        this.name = name;
        this.ready = false;
    }
    // ORDER METHODS
    
    	// Most of your code will go here, 
    	// so implement the getters and setters first!
    public void addItem(Item item){
        this.items.add(item);
    }
    public String getStatusMessage(){
        if(this.ready == true){
            return "Your order is ready";
        }
        else{
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public Double getOrderTotal(){
        double sum = 0;
        for(int i = 0; i < items.size(); i++){
            sum+=items.get(i).getPrice();
        }
        return sum;
    }
    public void display(){
        System.out.println("Customer Name: " + name);
        for(int i = 0; i < items.size(); i++){
            System.out.println(items.get(i).getName() + " - $" + items.get(i).getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }
    // GETTERS & SETTERS
    public ArrayList<Item> getItems(){
        return this.items;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }
}