class NoRestriction implements DietPlan {
	public Food[] restrictFood(Food[] foods) {
		return foods;
	}
	public String toString() {
		return "No restriction";
	}
}