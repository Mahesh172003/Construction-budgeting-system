package _CBS;

public class Window {
	public static int WindowPricePerUnit= 3000;
	public long WindowTotalPrice;
	public int floorCount;
	public int roomCount;
	public  String buildingType;
	
	public Window(int floorCount, int roomCount, String buildingType) {
		super();
		this.floorCount = floorCount;
		this.roomCount = roomCount;
		this.buildingType = buildingType;
	}

	public long calcWindowPrice(String buildingType,int floorCount ,int roomCount)  {
		if (buildingType=="Individual house") {
			WindowTotalPrice=(long)  ( 2 * WindowPricePerUnit *   roomCount)*floorCount;
			 System.out.println("Estimated Budget for Window is: "+ WindowTotalPrice);
		}
		else if(buildingType=="Apartment") {
			WindowTotalPrice=(long)  ( 1 * WindowPricePerUnit *  roomCount)*floorCount;
			 System.out.println("Estimated Budget for Window is: "+ WindowTotalPrice);
		}
		return WindowTotalPrice;
	}


}
