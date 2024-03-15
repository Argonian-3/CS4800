import java.util.*;
import java.lang.Object;
class PizzaDriver {
	static final Topping[] toppings = (Topping[])Topping.BEEF.getClass().getEnumConstants();
	public static void main(String[] args) {
		makeThreePizzas("Pizza Hut");
		makeThreePizzas("Little Caesars");
		makeThreePizzas("Dominos");
		Pizza.getBuilder()
		.setSize(PizzaSize.LARGE)
		.addToppings(getToppingsOfAmount(3))
		.setName("Pizza Hut")
		.build()
		.eat();
		Pizza.getBuilder()
		.setSize(PizzaSize.SMALL)
		.setName("Pizza Hut")
		.addToppings(getToppingsOfAmount(2))
		.build()
		.eat();
		Pizza.getBuilder()
		.setSize(PizzaSize.MEDIUM)
		.setName("Little Caesars")
		.addToppings(getToppingsOfAmount(8))
		.build()
		.eat();
		Pizza.getBuilder()
		.setSize(PizzaSize.SMALL)
		.setName("Little Caesars")
		.addToppings(getToppingsOfAmount(6))
		.build()
		.eat();
		Pizza.getBuilder()
		.setSize(PizzaSize.SMALL)
		.setName("Dominos")
		.addToppings(getToppingsOfAmount(1))
		.build()
		.eat();
		Pizza.getBuilder()
		.setSize(PizzaSize.LARGE)
		.setName("Dominos")
		.addToppings(getToppingsOfAmount(3))
		.build()
		.eat();
	}
	public static void makeThreePizzas(String pizzaChain) {
		for (int i=1;i<4;i++) {
			Pizza pizza = Pizza.getBuilder()
			.setSize(PizzaSize.SMALL)
			.setName(pizzaChain)
			.addToppings(getToppingsOfAmount(i*3))
			.build();
			pizza.eat();
		}
	}
	public static List<Topping> getToppingsOfAmount(int amount) {
		Random random = new Random();
		List<Topping> toppingsToChooseFrom = new ArrayList<>();
		toppingsToChooseFrom.addAll(Arrays.asList(toppings));
		List<Topping> chosenToppings = new ArrayList<>();
		for (int i=0;i<amount;i++) {
			chosenToppings.add(toppingsToChooseFrom.remove(random.nextInt(0,
			toppingsToChooseFrom.size())));
		}
		return chosenToppings;
	}
}