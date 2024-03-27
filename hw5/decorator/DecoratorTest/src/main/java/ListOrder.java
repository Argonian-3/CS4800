import java.util.*;
class ListOrder implements Order {
	List<Food> foods;
	LoyaltyStatus status;
	public ListOrder() {
		foods = new ArrayList<>();
		status=LoyaltyStatus.NONE;
	}
	public void addFood(Food food) {
		foods.add(food);
	}
	public boolean removeFood(Food food) {
		return foods.remove(food);
	}
	public void setLoyalty(LoyaltyStatus status) {
		this.status=status;
	}
	public int cost() {
		int sum=0;
		for (Food food : foods)
			sum = sum+food.cost();
		return (int)(status.discount*sum);
	}
	public String toString() {
		return foods.toString();
	}
}