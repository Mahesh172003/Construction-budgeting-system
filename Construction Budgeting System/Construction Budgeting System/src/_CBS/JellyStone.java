package _CBS;

public class JellyStone {
	public static int JellyStonePricePerUnit=2800;
	public long JellyStoneTotalPrice;
	public int floorCount;
	public int roomCount;
	public  String buildingType;
	public JellyStone(int floorCount, int roomCount, String buildingType) {
		super();
		this.floorCount = floorCount;
		this.roomCount = roomCount;
		this.buildingType = buildingType;
	}
	public long calcJellyStonePrice(String buildingType,int floorCount ,int roomCount) {
		if (buildingType=="Individual house") {
			JellyStoneTotalPrice=(long) (( 1.6 * 2800 ) * ( 8*8 ) / 100 *  roomCount)*floorCount;
			 System.out.println("Estimated Budget for Jelly Stone is: "+JellyStoneTotalPrice);
		}
		else if(buildingType=="Apartment") {
			JellyStoneTotalPrice=(long) (( 1.6 * 2800 ) * ( 2 * 6*6 ) / 100 *  roomCount)*floorCount;
			 System.out.println("Estimated Budget for Jelly Stone is: "+JellyStoneTotalPrice);
		}
		return JellyStoneTotalPrice;
	}
}
