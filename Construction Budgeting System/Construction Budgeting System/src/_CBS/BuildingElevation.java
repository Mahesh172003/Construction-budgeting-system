package _CBS;

public class BuildingElevation {
	 public static double ElevationPricePerUnit;
	   public long ElevTotalPrice;
	   public int FloorCount;
	   public int RoomCount;
	   public  String BuildingType;
	   public BuildingElevation(String buildingType6, int floorCount6, int roomCount6) {
		      this.BuildingType=buildingType6;
			  this.FloorCount =floorCount6;
			  this.RoomCount=roomCount6;
	}
	   public double ElevTotalPrice(String BuildingType, int FloorCount ,int RoomCount)
	   {
		   if(BuildingType.equals("Individual house"))
		   {
			   ElevTotalPrice = 7000;
		   System.out.println("Estimated Budget for BuildingElevation is: "+ElevTotalPrice);
		   }
		   else
		   {
			   ElevTotalPrice=7000;
			   System.out.println("Estimated Budget for BuildingElevation is: "+ElevTotalPrice);
		   }
		   return  ElevTotalPrice ;
	   }
	   
	}

