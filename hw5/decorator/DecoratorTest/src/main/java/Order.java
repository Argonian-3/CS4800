import java.util.*;
interface Order {
	public void addFood(Food food);
	public boolean removeFood(Food food) ;
	public void setLoyalty(LoyaltyStatus status);
	public int cost();
	public String toString();
}