package _CBS;

public class Paint {
	public static int PaintPricePerUnit=1100;
	public long PaintTotalPrice;
	public int floorCount;
	public int roomCount;
	public  String buildingType;
	
	public Paint(int floorCount, int roomCount, String buildingType) {
		super();
		this.floorCount = floorCount;
		this.roomCount = roomCount;
		this.buildingType = buildingType;
	}

	public long calcPaintPrice(String buildingType,int floorCount ,int roomCount) {
		if (buildingType=="Individual house") {
			PaintTotalPrice=(long) (( 1 * 3.8 ) * (8*8 )*PaintPricePerUnit / 350 * roomCount)*floorCount;
			 System.out.println("Estimated Budget for Paint is: "+PaintTotalPrice);
		}
		else if(buildingType=="Apartment") {
			PaintTotalPrice=(long) (( 1 * 3.8 ) * ( 6*6*2 )*PaintPricePerUnit / 350 * roomCount)*floorCount;
			 System.out.println("Estimated Budget for Paint is: "+PaintTotalPrice);
		}
		return PaintTotalPrice;
	}
}
