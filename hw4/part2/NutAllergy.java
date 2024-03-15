import java.util.*;
class NutAllergy implements DietPlan {
	public Food[] restrictFood(Food[] foods) {
		List<Food> correctFoods = new LinkedList<>();
		for (Food food : foods) {
			if (food.getTag() != Tag.NUT)
				correctFoods.add(food);
		}
		return correctFoods.toArray(new Food[0]);
	}
	public String toString() {
		return "Nut Allergy";
	}
}