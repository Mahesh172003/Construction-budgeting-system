package _CBS;

public class Door  {
	public static int DoorPricePerUnit=5000;
	public long DoorTotalPrice;
	public int floorCount;
	public int roomCount;
	public  String buildingType;
	
	public Door(int floorCount, int roomCount, String buildingType) {
		super();
		this.floorCount = floorCount;
		this.roomCount = roomCount;
		this.buildingType = buildingType;
	}

	public long calcDoorPrice(String buildingType,int floorCount ,int roomCount) {
		if (buildingType=="Individual house") {
			DoorTotalPrice=(long)  ( DoorPricePerUnit * roomCount)*floorCount;
			 System.out.println("Estimated Budget for Door is: "+DoorTotalPrice);
		}
		else if(buildingType=="Apartment") {
			DoorTotalPrice=(long)  2 *(DoorPricePerUnit* roomCount)*floorCount;
			 System.out.println("Estimated Budget for Door is: "+DoorTotalPrice);
		}
		return DoorTotalPrice;
	}

}
