enum LoyaltyStatus {
	NONE(1.0), REGULAR(0.98), MEMBER(0.90);
	LoyaltyStatus(double discount) {this.discount=discount;}
	public final double discount;
}