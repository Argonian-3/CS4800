enum Topping {
	PEPPERONI("Pepperoni"), SAUSAGE("Sausage"), MUSHROOMS("Mushrooms"), BACON("Bacon"),
	ONION("Onion"), EXTRA_CHEESE("Extra Cheese"), PEPPERS("Peppers"), CHICKEN("Chicken"),
	OLIVES("Olives"), SPINACH("Spinach"), TOMATO_AND_BASIL("Tomato and Basil"), BEEF("Beef"),
	HAM("Ham"), PESTO("Pesto"), SPICY_PORK("Spicy Pork"), HAM_AND_PINEAPPLE("Ham and Pineapple");
	Topping(String newTopping) {toppingName = newTopping;}
	private final String toppingName;
	public String toString() {return toppingName;}
}