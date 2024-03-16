class ProteinFactory extends FoodFactory {
	private static MacronutrientFactory instance=null;
	public static MacronutrientFactory getInstance() {
		if (instance==null)
			instance = new ProteinFactory();
		return instance;
	}
	public Food[] getMacronutrient() {
		Food[] proteins = {Food.fish,Food.chicken,Food.beef,Food.tofu};
		return proteins;
	}
}