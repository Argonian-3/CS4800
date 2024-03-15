class ProteinFactory extends FoodFactory {
	private static MacronutrientFactory instance=null;
	public static MacronutrientFactory getInstance() {
		if (instance==null)
			instance = new ProteinFactory();
		return instance;
	}
	private ProteinFactory() {
		Food[] proteins = {Food.fish,Food.chicken,Food.beef,Food.tofu};
		foods = proteins;
	}
}