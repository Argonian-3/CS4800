enum PizzaSize {
		SMALL("Small"), MEDIUM("Medium"), LARGE("Large");
		PizzaSize(String newString) {string = newString;}
		private final String string;
		public String toString() {return string;}
}