package _CBS;

public class Supervisor extends TimeFrame {
	private static long SupMonthSal=40000;
	public long totalSupSal;
	public long totalSupPayCheck(double time) {
		 totalSupSal=(long) (time*SupMonthSal);
		 System.out.println("Estimated salary for Supervisor: "+ totalSupSal);
		 return totalSupSal;
}
}