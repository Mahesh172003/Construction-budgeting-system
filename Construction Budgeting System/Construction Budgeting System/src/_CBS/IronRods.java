package _CBS;

public class IronRods {
	public static int IronRodsPricePerUnit=35;
	public long IronRodsTotalPrice;
	public int floorCount;
	public int roomCount;
	public  String buildingType;
	public IronRods(int floorCount, int roomCount, String buildingType) {
		super();
		this.floorCount = floorCount;
		this.roomCount = roomCount;
		this.buildingType = buildingType;
	}
	public long calcIronRodsPrice(String buildingType,int floorCount ,int roomCount) {
		if (buildingType=="Individual house") {
			IronRodsTotalPrice=(long) (( 1400 * IronRodsPricePerUnit ) * ( 8*8 ) / 400 *  roomCount)*floorCount;
			 System.out.println("Estimated Budget for Iron Rods is: "+IronRodsTotalPrice);
		}
		else if(buildingType=="Apartment") {
			IronRodsTotalPrice=(long) (( 1400 * IronRodsPricePerUnit ) * ( 2 * 6*6) / 400 *  roomCount)*floorCount;
			 System.out.println("Estimated Budget for Iron Rods is: "+IronRodsTotalPrice);
		}
		return IronRodsTotalPrice;
	}
}
