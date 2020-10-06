import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CustomerClassTest {

    CustomerClass customer;

    @BeforeEach
    public void setup(){
        customer=new CustomerClass();
        customer.setName("Harish");
        List<Lists> itemsList=new ArrayList<Lists>();
        Lists item1 =Mockito.mock(Lists.class);
        Lists item2 =Mockito.mock(Lists.class);
        Lists Item3 =Mockito.mock(Lists.class);
        Lists Item4 =Mockito.mock(Lists.class);
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(Item3);
        itemsList.add(Item4);


        customer.setItemsList(itemsList);
        when(item1.getName()).thenReturn("Milk");
        when(item2.getName()).thenReturn("Sugar");
        when(Item3.getName()).thenReturn("CoffeePowder");
        when(Item4.getName()).thenReturn("CoffeeMug");
        when(item1.price("Milk")).thenReturn(100);
        when(item2.price("Sugar")).thenReturn(200);
        when(Item3.price("CoffeePowder")).thenReturn(300);
        when(Item4.price("CoffeeMug")).thenReturn(500);

    }

    @Test
    public void calculateBillTest() {
        int totalAmount = customer.billCalculation();
        assertEquals(1100, totalAmount);
    }
}
