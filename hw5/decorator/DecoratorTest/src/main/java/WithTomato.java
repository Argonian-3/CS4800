class WithTomato extends WithFood {
	public WithTomato(Food food) {
		this.food=food;
	}
	public String toString() {
		return food+" + tomato";
	}
	public int cost() {
		return food.cost()+10;
	}
}