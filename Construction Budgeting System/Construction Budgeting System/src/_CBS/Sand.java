package _CBS;

public class Sand {
	public static int SandPricePerUnit=45;
	public long SandTotalPrice;
	public int floorCount;
	public int roomCount;
	public  String buildingType;
	
	public Sand(int floorCount, int roomCount, String buildingType) {
		super();
		this.floorCount = floorCount;
		this.roomCount = roomCount;
		this.buildingType = buildingType;
	}

	public long calcSandPrice(String buildingType,int floorCount ,int roomCount) {
		if (buildingType=="Individual house") {
			SandTotalPrice=(long) ( ( 100 *SandPricePerUnit ) * ( 8*8 ) / .9 * roomCount)*floorCount;
			 System.out.println("Estimated Budget for Sand is: "+SandTotalPrice);
		}
		else if(buildingType=="Apartment") {
			SandTotalPrice=(long) (( 100 * SandPricePerUnit ) * ( 2*6*6) / .9 *  roomCount)*floorCount;
			 System.out.println("Estimated Budget for Sand is: "+SandTotalPrice);
		}
		return SandTotalPrice;
	}

}
