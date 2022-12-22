package _CBS;

public class Materials {
	public double total_Mat,t_mat;
	public float ground_Calc;
	public int floorCount;
	public int roomCount;
	public int Fcount;
	public double first_Calc,floorCalc;
	public  String buildingType;
    public Door D= new Door(floorCount,roomCount,buildingType);
    public Window W1=new Window(floorCount, roomCount, buildingType);
    public Cement C=new Cement(floorCount, roomCount, buildingType);
    public Sand S=new Sand(floorCount, roomCount, buildingType);
    public Water W2=new Water(floorCount, roomCount, buildingType);
    public Brick B= new Brick(floorCount, roomCount, buildingType);
    public Paint P=new Paint(floorCount, roomCount, buildingType);
    public JellyStone J= new JellyStone(floorCount, roomCount, buildingType);
    public IronRods I= new IronRods(floorCount, roomCount, buildingType);
    void storeDetails(int floorCount,int roomCount, String buildingType) {
    	this.floorCount=floorCount;
    	this.roomCount=roomCount;
    	this.buildingType=buildingType;
    }
    public double total_Mat_Calc() {
    	System.out.println("---- ESTIMATION FOR TOTAL BUILDING ----\n");
    	total_Mat=D.calcDoorPrice(buildingType, floorCount, roomCount)+W1.calcWindowPrice(buildingType, floorCount, roomCount)+
    			C.calcCementPrice(buildingType, floorCount, roomCount)+S.calcSandPrice(buildingType, floorCount, roomCount)+
    			W2.calcWaterPrice(buildingType, floorCount, roomCount)+B.calcBrickPrice(buildingType, floorCount, roomCount)+
    			P.calcPaintPrice(buildingType, floorCount, roomCount)+J.calcJellyStonePrice(buildingType, floorCount, roomCount)+
    			I.calcIronRodsPrice(buildingType, floorCount, roomCount);
    	return (total_Mat/2);
    }
    public void floor_Calc() {
    	System.out.println("---- ESTIMATION FOR INDIVIDUAL FLOOR ----\n");
    	
    	ground_Calc=(D.calcDoorPrice(buildingType, 1, roomCount)+W1.calcWindowPrice(buildingType, 1, roomCount)+C.calcCementPrice(buildingType, 1, roomCount)+S.calcSandPrice(buildingType, 1, roomCount)+W2.calcWaterPrice(buildingType, 1, roomCount)+B.calcBrickPrice(buildingType, 1, roomCount)+P.calcPaintPrice(buildingType, 1, roomCount)+J.calcJellyStonePrice(buildingType, 1, roomCount)+I.calcIronRodsPrice(buildingType, 1, roomCount))/2;
    	first_Calc=0.91*ground_Calc;
    	System.out.println("\nTotal Estimation of Materials for ground floor: "+ ground_Calc);
    	System.out.println("Total Estimation of Materials for first floor: "+ first_Calc);
    	Fcount=floorCount-2;
    	System.out.println("Cost estimation for each floor (from top to bottom floor count): ");
    	perFloorCalc(Fcount, first_Calc);
    
    }
    public double perFloorCalc(int Fcount, double first_Calc) {
		floorCalc=first_Calc+(1.1/100)*first_Calc;
		first_Calc=floorCalc;
		if( Fcount>=0) {
			perFloorCalc(Fcount-1,first_Calc);
			System.out.println("Estimated Cost for Floor "+ (Fcount+1) + " : "+first_Calc);
			return floorCalc;
		}
		else {
			return 0;
		}
		
	}

    
  
}
