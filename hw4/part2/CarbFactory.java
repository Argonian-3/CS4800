class CarbFactory extends FoodFactory {
	private static CarbFactory instance = null;
	public static CarbFactory getInstance() {
		if (instance==null)
			instance = new CarbFactory();
		return instance;
	}
	public Food[] getMacronutrient() {
		Food[] carbs = {Food.cheese,Food.bread,Food.lentils,Food.pistachio};
		return carbs;
	}
}