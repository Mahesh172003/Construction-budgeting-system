package _CBS;

public class Cement {
	public static int CementPricePerUnit=350;
	public long CementTotalPrice;
	public int floorCount;
	public int roomCount;
	public  String buildingType;
	
	public Cement(int floorCount, int roomCount, String buildingType) {
		super();
		this.floorCount = floorCount;
		this.roomCount = roomCount;
		this.buildingType = buildingType;
	}

	public long calcCementPrice(String buildingType,int floorCount ,int roomCount) {
		if (buildingType=="Individual house") {
			CementTotalPrice=(long) ( ( 100 * CementPricePerUnit ) * ( 8*8 ) / 4.3 * roomCount)*floorCount;
			 System.out.println("Estimated Budget for Cement is: "+CementTotalPrice);
		}
		else if(buildingType=="Apartment") {
			CementTotalPrice=(long) ((( 100 * CementPricePerUnit ) * ( 2*6*6 ) / 4.3) * roomCount)*floorCount;
			 System.out.println("Estimated Budget for Cement is: "+CementTotalPrice);
		}
		return CementTotalPrice;
	}

}
