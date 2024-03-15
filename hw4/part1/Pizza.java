import java.util.*;
public class Pizza {
	private final String pizzaMaker;
	private final PizzaSize size;
	private final List<Topping> toppings;
	private Pizza(PizzaBuilder pizzaChain) {
		this.pizzaMaker = pizzaChain.name;
		this.size = pizzaChain.size;
		toppings=new ArrayList<>();
		for (Topping topping : pizzaChain.toppings) {
			toppings.add(topping);
		}
	}
	public void eat() {
		System.out.println(this);
	}
	public String toString() {
		String toppingsString = toppings.toString();
		return pizzaMaker.toString().replace("null","")+" "+size.toString()+" "+toppingsString.substring(1,toppingsString.length()-1);
	}
	public static SizeSetter getBuilder() {
		return new PizzaBuilder();
	}
	public interface SizeSetter {
		PizzaBuilder setSize(PizzaSize size);
	}	
	public static class PizzaBuilder implements SizeSetter {
		private String name;
		private PizzaSize size;
		private Set<Topping> toppings;
		public PizzaBuilder() {
			toppings=new HashSet<>();
		}
		public PizzaBuilder setName(String name) {
			this.name=name;
			return this;
		}
		public PizzaBuilder setSize(PizzaSize size) {
			this.size=size;
			return this;
		}
		public PizzaBuilder addToppings(List<Topping> toppings) {
			this.toppings.addAll(toppings);
			return this;
		}
		public PizzaBuilder removeAllToppings() {
			this.toppings.clear();
			return this;
		}
		public Pizza build() {
			return new Pizza(this);
		}
	}
}