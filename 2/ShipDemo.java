public class ShipDemo {
	public static Ship[] ships;
	public static void main(String[] args) {
		ships = new Ship[3];
		Ship myShip = new Ship("ship one", "2024");
		ships[0] = myShip;
		CruiseShip myCruiseShip = new CruiseShip("ship two", "2024");
		myCruiseShip.setMaxPassengers(20000);
		ships[1]=myCruiseShip;
		CargoShip myCargoShip = new CargoShip("ship three", "2024");
		myCargoShip.setTonnage(50000);
		ships[2]=myCargoShip;
		for (Ship s:ships)
			s.print();
	}
}