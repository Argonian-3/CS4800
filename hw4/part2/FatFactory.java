class FatFactory extends FoodFactory {
	private static MacronutrientFactory instance=null;
	public static MacronutrientFactory getInstance() {
		if (instance==null)
			instance=new FatFactory();
		return instance;
	}
	private FatFactory() {
		Food[] fats = {Food.avocado, Food.sour_cream, Food.tuna, Food.peanuts};
		foods=fats;
	}
}