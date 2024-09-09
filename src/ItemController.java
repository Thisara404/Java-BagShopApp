import java.util.ArrayList;
import java.util.List;

public class ItemController {
    // Method to return a list of items
    public List<Item> getItems() {
        // Create a list to store items
        List<Item> items = new ArrayList<>();
        
        // Add item objects with different details (name, image path, price)
        items.add(new Item("Item1", "/images/A campus classic Herschel Classic Backpack XL (1).jpg.jpg", "50.00"));
        items.add(new Item("Item2", "/images/item2.jpg", "60.00"));
        items.add(new Item("Item3", "/images/item3.jpg", "70.00"));
        
        return items; // Return the list of items
    }
}
