import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class BaristaTest {
    public static void main(String[] args) {
        Item item1 = new Item("mocha", 4.0);
        Item item2 = new Item("latte", 3.5);
        Item item3 = new Item("drip coffee", 2.5);
        Item item4 = new Item("capuccino", 3.0);

        Order order1 = new Order("Andrew");
        order1.addItem(item1);
        order1.addItem(item2);
        System.out.println(order1.getItems());
        System.out.println(order1.getStatusMessage());
        System.out.println(order1.getOrderTotal());
        order1.display();
    }
}