class Customer {
	public Customer(String name) {
		this.name=name;
		dietPlan=new NoRestriction();
	}
	private String name;
	private DietPlan dietPlan;
	public void setDietPlan(DietPlan dietPlan) {
		this.dietPlan=dietPlan;
	}
	public DietPlan getDietPlan() {
		return dietPlan;
	}
	public String getName() {
		return name;
	}
}