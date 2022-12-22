package _CBS;

public class Brick {
	public static int BrickPricePerUnit=7;
	public long BrickTotalPrice;
	public int floorCount;
	public int roomCount;
	public  String buildingType;
	public Brick(int floorCount, int roomCount, String buildingType) {
		super();
		this.floorCount = floorCount;
		this.roomCount = roomCount;
		this.buildingType = buildingType;
	}
	public long calcBrickPrice(String buildingType,int floorCount ,int roomCount) {
		if (buildingType=="Individual house") {
			BrickTotalPrice=(long) (( 1702 * BrickPricePerUnit ) * ( 8 * 8 ) / 144 *roomCount)*floorCount;
			 System.out.println("Estimated Budget for Brick is: "+BrickTotalPrice);
		}
		else if(buildingType=="Apartment") {
			BrickTotalPrice=(long) (( 1072 * BrickPricePerUnit ) * ( 2 * 6 * 6 ) / 144 * roomCount)*floorCount;
			 System.out.println("Estimated Budget for Brick is: "+BrickTotalPrice);
		}
		return BrickTotalPrice;
	}
}
