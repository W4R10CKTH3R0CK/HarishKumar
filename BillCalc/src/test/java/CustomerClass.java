import java.util.List;

/**
 * @author HJ084748
 */

public class CustomerClass {
    String itemNames;
    List<Lists> itemsList;

    public int billCalculation() {
        int total = 0;              // Initally total amount is taken as 0
        for (Lists lists : itemsList) // It loops through all the items and calculates the total
        {
            total += lists.price(lists.getName());
        }
        return total;       // It gives the total amount for the items
    }

    public void setName(String name) {
        this.itemNames = name;
    }

    public void setItemsList(List<Lists> itemsList) {
        this.itemsList = itemsList;
    }



}
