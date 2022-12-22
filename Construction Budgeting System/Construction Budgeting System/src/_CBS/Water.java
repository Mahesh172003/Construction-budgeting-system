package _CBS;

public class Water {
	public static double WaterPricePerUnit=1.5;
	public long WaterTotalPrice;
	public int floorCount;
	public int roomCount;
	public  String buildingType;
	
	public Water(int floorCount, int roomCount, String buildingType) {
		super();
		this.floorCount = floorCount;
		this.roomCount = roomCount;
		this.buildingType = buildingType;
	}

	public long calcWaterPrice(String buildingType,int floorCount ,int roomCount) {
		if (buildingType=="Individual house") {
			WaterTotalPrice=(long) ((7 * 3.8* WaterPricePerUnit )*8*8 * roomCount)*floorCount;
			 System.out.println("Estimated Budget for Water is: "+WaterTotalPrice);
		}
		else if(buildingType=="Apartment") {
			WaterTotalPrice=(long) ((7* 3.8* 2*6*6)*WaterPricePerUnit * roomCount)*floorCount;
			 System.out.println("Estimated Budget for Water is: "+WaterTotalPrice);
		}
		return WaterTotalPrice;
		
	}
}
