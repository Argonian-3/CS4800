enum Food {
	cheese(Tag.DAIRY), bread(Tag.CARB), lentils(Tag.CARB), pistachio(Tag.NUT), fish(Tag.MEAT),
	chicken(Tag.MEAT), beef(Tag.MEAT), tofu, avocado, sour_cream(Tag.DAIRY),
	tuna(Tag.MEAT), peanuts(Tag.DAIRY);
	private final Tag tag;
	Food() {
		tag=Tag.NULL;
	}
	Food(Tag tag) {
		this.tag=tag;
	}
	public Tag getTag() {
		return tag;
	}
}