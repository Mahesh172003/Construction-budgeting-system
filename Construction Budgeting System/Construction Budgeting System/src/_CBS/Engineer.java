package _CBS;

public class Engineer extends TimeFrame {
	private static long EngMonthSal=40000;
	public long totalEngSal;
	public long totalEngPayCheck(double time) {
		 totalEngSal=(long) (time*EngMonthSal);
		 System.out.println("Estimated salary for Engineer: "+totalEngSal);
		 return totalEngSal;
	}

}


