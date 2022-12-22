package _CBS;

public class Electrican {
	 public double cost;
	   public double electricanPriceperunit;
	   public double electricanTotalPrice;
	   public int FloorCount;
	   public int RoomCount;
	   public  String BuildingType;
	  
	   public Electrican( String buildingType3,int floorCount3, int roomCount3) {
		
		FloorCount = floorCount3;
		RoomCount = roomCount3;
		BuildingType = buildingType3;
	}

	public double electricanTotalPrice(String BuildingType, int FloorCount ,int RoomCount)
	   {
		   if(BuildingType.equals("Individual house"))
		   {
		   electricanTotalPrice = 5000 + 3*RoomCount * FloorCount * 500 + 1 *FloorCount *750;
		   System.out.println("Estimated Budget for Electrican is:"+electricanTotalPrice);
		   }
		   else
		   {
			   electricanTotalPrice=(2*FloorCount* 5000) + (2*RoomCount * FloorCount * 500)+(1 *FloorCount *750);
			   System.out.println("Estimated Budget for Electrican is:"+electricanTotalPrice);
		   }
		   return electricanTotalPrice ;
	   }	   
	}

