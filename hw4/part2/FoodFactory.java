import java.util.Random;
public abstract class FoodFactory implements MacronutrientFactory  {
	public abstract Food[] getMacronutrient();
	public Food getFoodFor(Customer customer) {
		Food[] foods = getMacronutrient();
		Food[] correctFood = customer.getDietPlan().restrictFood(foods);
		Random random = new Random();
		return correctFood[random.nextInt(correctFood.length)];
	}
}	