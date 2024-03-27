class OrderDriver {
	public static void main(String[] args) {
		// set base foods
		final Food hamburger = BaseFood.getBuilder().setName("Hamburger")
		.setCost(299).build();
		final Food fries = BaseFood.getBuilder().setName("Fries").setCost(99)
		.build();
		final Food hotDog = BaseFood.getBuilder().setName("Hot Dog").setCost(199)
		.build();
		// receive orders
		Order order = new ListOrder();
		order.addFood(new WithCheese(new WithTomato(hamburger)));
		order.addFood(new WithCheese(fries));
		order.setLoyalty(LoyaltyStatus.REGULAR);
		printOrder(order);
		order=new ListOrder();
		order.addFood(new WithTomato(hotDog));
		order.addFood(fries);
		order.setLoyalty(LoyaltyStatus.MEMBER);
		printOrder(order);
	}
	static void printOrder(Order order) {
		System.out.println(order+" is "+formatPrice(order.cost()));
	}
	static String formatPrice(int price) {
		int decimalPrice=price%100;
		if (decimalPrice<10)
			decimalPrice=decimalPrice*10;
		return "$"+price/100+"."+decimalPrice;
	}
}