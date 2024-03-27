import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FoodTester {
    Food food = BaseFood.getBuilder().setName("Food")
            .setCost(100).build();
    Order order = new ListOrder();
    @Test
    public void testFoodToString() {
        assertEquals("Food",food.toString());
    }
    @Test
    public void testFoodCost() {
        assertEquals(100,food.cost());
    }
    @Test
    public void testDecoratorCost() {
        assertEquals(125,new WithCheese(food).cost());
        assertEquals(110,new WithTomato(food).cost());
    }
    @Test
    public void testDecoratorString() {
        assertEquals("Food + cheese",new WithCheese(food).toString());
    }
    @Test
    public void testOrderCost() {
        order.addFood(food);
        order.addFood(food);
        assertEquals(food.cost()*2,order.cost());
    }
    @Test
    public void testLoyaltyStatus() {
        order.addFood(food);
        order.setLoyalty(LoyaltyStatus.REGULAR);
        assertEquals(98,order.cost());
    }
    @Test
    public void testFoodRemoval() {
        order.addFood(food);
        assertTrue(order.removeFood(food));
        assertFalse(order.removeFood(food));
    }
    @Test
    public void testOrderToString() {
        order.addFood(food);
        assertEquals("[Food]", order.toString());
    }
}
