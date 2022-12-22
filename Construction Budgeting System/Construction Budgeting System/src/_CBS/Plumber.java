package _CBS;

public class Plumber {
   public static long plumberPricePerUnit=400;
   public long plumberTotalPrice;
   public int  FloorCount;
   public int RoomCount;
   public  String BuildingType;
   public Plumber(String buildingType2, int floorCount2, int roomCount2) {
	      this.BuildingType=buildingType2;
		  this.FloorCount =floorCount2;
		  this.RoomCount=roomCount2;
}
public long plumberTotalPrice(String BuildingType, int FloorCount ,int RoomCount)
   {
	   if(BuildingType.equals("Individual house"))
	   {
		   plumberTotalPrice= FloorCount*RoomCount * 8 * 8  * 400 * 1/5;
	   System.out.println("Estimated Budget for plumber is: "+plumberTotalPrice);
	   }
	   else 
	   {
		   plumberTotalPrice=FloorCount*RoomCount * 4 * 3 * 2 * 400 * 2/5;
		   System.out.println("Estimated Budget for plumber is: "+plumberTotalPrice);
	   }
	   return  plumberTotalPrice ;
   }
   
}
