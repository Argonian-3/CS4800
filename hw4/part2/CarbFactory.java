class CarbFactory extends FoodFactory {
	private static MacronutrientFactory instance = null;
	public static MacronutrientFactory getInstance() {
		if (instance==null)
			instance=new CarbFactory();
		return instance;
	}
	private CarbFactory() {
		Food[] carbs = {Food.cheese, Food.bread, Food.lentils, Food.pistachio};
		foods=carbs;
	} 
}