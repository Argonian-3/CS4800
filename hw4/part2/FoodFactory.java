import java.util.Random;
public class FoodFactory implements MacronutrientFactory  {
	protected Food[] foods;
	public Food getFoodFor(Customer customer) {
		Food[] correctFood = customer.getDietPlan().restrictFood(foods);
		Random random = new Random();
		return correctFood[random.nextInt(correctFood.length)];
	}
}	