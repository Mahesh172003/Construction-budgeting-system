package _CBS;

public class Worker {
	 public static double WorkerPricePerUnit;
	   public long WorkerTotalPrice;
	   public int FloorCount;
	   public int RoomCount;
	   public  String BuildingType;
	   public Worker(String buildingType5, int floorCount5, int roomCount5) {
		      this.BuildingType=buildingType5;
			  this.FloorCount =floorCount5;
			  this.RoomCount=roomCount5;
	}
	   public double WorkerTotalPrice(String BuildingType, int FloorCount ,int RoomCount)
	   {
		   if(BuildingType.equals("Individual house"))
		   {
			   WorkerTotalPrice= FloorCount*RoomCount * 8 * 8  * 400;
		   System.out.println("Estimated Budget for Worker is: "+WorkerTotalPrice);
		   }
		   else
		   {
			   WorkerTotalPrice=FloorCount*RoomCount *4 * 3 * 2 * 400;
			   System.out.println("Estimated Budget for Worker is: "+WorkerTotalPrice);
		   }
		   return  WorkerTotalPrice ;
	   }
	   
	}

