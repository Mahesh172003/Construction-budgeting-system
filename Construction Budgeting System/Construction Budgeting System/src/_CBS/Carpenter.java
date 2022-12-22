package _CBS;

public class Carpenter {
	public static double carpPricePerUnit;
	   public long carpTotalPrice;
	   public int FloorCount;
	   public int RoomCount;
	   public  String BuildingType;
	   public Carpenter(String buildingType5, int floorCount5, int roomCount5) {
		      this.BuildingType=buildingType5;
			  this.FloorCount =floorCount5;
			  this.RoomCount=roomCount5;
	}
	   public double carpTotalPrice(String BuildingType, int FloorCount ,int RoomCount)
	   {
		   if(BuildingType.equals("Individual house"))
		   {
			   carpTotalPrice = FloorCount*RoomCount * 8 * 8  * 400 *1/6;
		   System.out.println("Estimated Budget for Carpenter is: "+ carpTotalPrice);
		   }
		   else
		   {
			   carpTotalPrice=FloorCount*RoomCount *4 * 3 * 2 * 400 *1/4;
			   System.out.println("Estimated Budget for Carpenter is: "+carpTotalPrice);
		   }
		   return  carpTotalPrice ;
	   }
	   
	}