class BaseFood implements Food {
	private final String name;
	private final int cost;
	public String toString() {
		return name;
	}
	public int cost() {
		return cost;
	}
	public static NameSetter getBuilder() {
		return new BaseFoodBuilder();
	}
	public interface NameSetter {
		BaseFoodBuilder setName(String name);
	}
	public static class BaseFoodBuilder implements NameSetter {
		private String name;
		private int cost;
		public BaseFoodBuilder(){
			cost=0;
		}
		public BaseFoodBuilder setName(String name) {
			this.name=name;
			return this;
		}
		public BaseFoodBuilder setCost(int cost) {
			this.cost=cost;
			return this;
		}
		public BaseFood build() {
			return new BaseFood(this);
		}
	}
	private BaseFood(BaseFoodBuilder builder) {
		this.name=builder.name;
		this.cost=builder.cost;
	}
}