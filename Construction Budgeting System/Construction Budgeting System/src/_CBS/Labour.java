package _CBS;
public class Labour {
  public  String BuildingType;
  public int FloorCount;
  public int RoomCount;
  public double amount;
  public Plumber P =new Plumber(this.BuildingType,this.FloorCount ,this.RoomCount);
  public Electrican E =new Electrican(this.BuildingType,this.FloorCount ,this.RoomCount);
  public Painter P1 =new Painter(this.BuildingType,this.FloorCount ,this.RoomCount);
  public BuildingElevation BE =new BuildingElevation(this.BuildingType,this.FloorCount ,this.RoomCount);
  public Carpenter C = new Carpenter(this.BuildingType,this.FloorCount ,this.RoomCount);
  public Worker W=new Worker(this.BuildingType,this.FloorCount ,this.RoomCount);
  public Labour(String BuildingType,int FloorCount ,int RoomCount)
  {
	  this.BuildingType=BuildingType;
	  this.FloorCount =FloorCount;
	  this.RoomCount=RoomCount;
  }
  public double totallabour_calc()
  {
	  amount=P.plumberTotalPrice(BuildingType,FloorCount ,RoomCount)
			  +E.electricanTotalPrice(BuildingType,FloorCount,RoomCount)
	          +P1.PainterTotalPrice(BuildingType,FloorCount ,RoomCount)
	          +BE.ElevTotalPrice(BuildingType,FloorCount ,RoomCount)
	          +C.carpTotalPrice(BuildingType,FloorCount ,RoomCount)
	          +W.WorkerTotalPrice(BuildingType,FloorCount ,RoomCount);
	  System.out.println("");
	          return  amount;
  }
 
}
