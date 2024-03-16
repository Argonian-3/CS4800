class FatFactory extends FoodFactory {
	private static MacronutrientFactory instance=null;
	public static MacronutrientFactory getInstance() {
		if (instance==null)
			instance=new FatFactory();
		return instance;
	}
	public Food[] getMacronutrient() {
		Food[] fats = {Food.avocado, Food.sour_cream, Food.tuna, Food.peanuts};
		return fats;
	}
}