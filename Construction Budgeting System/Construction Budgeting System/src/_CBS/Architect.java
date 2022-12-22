package _CBS;

public class Architect  {
	private static int BuildDesign= 15000;
	private static int perSqFeetDesCost=60;
	public long totalArchSal;
	public long archTotalPay(long area) {
		totalArchSal = BuildDesign + perSqFeetDesCost*area;
		System.out.println("Estimated salary for Architect: "+totalArchSal);
		return totalArchSal;
	}

}
