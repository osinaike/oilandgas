package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OilAndGas {
    @Test
    @DisplayName("Testing That the Object Exist")
    public void ardo(){
        //given
        Oil oil = new Oil();
        //Assert That Object Exist
        assertNotNull(oil);
    }
    @Test
    @DisplayName("Testing That we can buy Fuel")
    public void thatWeCanBuyFuel() {
        //given
        Oil oil = new Oil();
        //When
        oil.buyFuel(4);
        //Assert that we can buy Fuel and Get Discounted Price
        assertEquals(784, oil.getAmount());
    }
}
