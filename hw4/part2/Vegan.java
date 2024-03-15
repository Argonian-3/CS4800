import java.util.*;
class Vegan implements DietPlan {
	public Food[] restrictFood(Food[] foods) {
		List<Food> correctFoods = new LinkedList<>();
		for (Food food : foods) {
			if (food.getTag() != Tag.MEAT && food.getTag() != Tag.DAIRY)
				correctFoods.add(food);
		}
		return correctFoods.toArray(new Food[0]);
	}
	public String toString() {
		return "Vegan";
	}
}