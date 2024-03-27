class WithCheese extends WithFood {
	public WithCheese(Food food) {
		this.food=food;
	}
	public String toString() {
		return food+" + cheese";
	}
	public int cost() {
		return food.cost()+25;
	}
}