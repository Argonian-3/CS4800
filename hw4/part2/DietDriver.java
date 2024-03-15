class DietDriver {
	public static void main(String[] args) {
		final int NUMBER_OF_CUSTOMERS = 6;
		String[] names = {"Alice","Bob","Carol","Dave","Eve","Faith","Grant",
		"Heather","Irene","Jack","Kepler","Larry","Mary","Nixon","Obama","Percy",
		"Quincy","Randall","Sarah","Trevor","Uriel","Vinny","Walter","Xerxes","Yu","Zack"};
		DietPlan[] diets = {new NoRestriction(), new Paleo(), new Vegan(), new NutAllergy()};
		for (int i=0;i<NUMBER_OF_CUSTOMERS;i++) {
			Customer customer = new Customer(names[i%names.length]);
			customer.setDietPlan(diets[i%diets.length]);
			System.out.println(customer.getName()+" has " +
				customer.getDietPlan()+":"+getMealFor(customer));
		}
	}
	public static String getMealFor(Customer customer) {
		Food carb = CarbFactory.getInstance().getFoodFor(customer);
		Food protein = ProteinFactory.getInstance().getFoodFor(customer);
		Food fat = FatFactory.getInstance().getFoodFor(customer);
		return carb.name().replace("_"," ")+" "+protein.name().replace("_"," ")
		+" "+fat.name().replace("_"," ");
	}
}