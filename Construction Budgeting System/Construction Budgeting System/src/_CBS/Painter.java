package _CBS;

public class Painter {
	   public double PainterPriceperUnit=20.0;
	   public double PainterTotalPrice;
	   public int FloorCount;
	   public int RoomCount;
	   public  String BuildingType;
	   public Painter(String buildingType4, int floorCount4, int roomCount4) {
		      this.BuildingType=buildingType4;
			  this.FloorCount =floorCount4;
			  this.RoomCount=roomCount4;
	}
	public double PainterTotalPrice(String BuildingType, int FloorCount ,int RoomCount)
	   {
		   if(BuildingType.equals("Individual house"))
		   {
			   PainterTotalPrice= FloorCount*RoomCount * 8 * 8  * PainterPriceperUnit;
		   System.out.println("Estimated Budget for Painter is:"+ PainterTotalPrice);
		   }
		   else
		   {
			   PainterTotalPrice=FloorCount*RoomCount * 8 *8* PainterPriceperUnit;
			   System.out.println("Estimated Budget for Painter is:"+ PainterTotalPrice);
		   }
		   return  PainterTotalPrice;
	   }
	   

}
