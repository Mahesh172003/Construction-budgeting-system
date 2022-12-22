package _CBS;

public class Foundation  {
    private static String foundationType[]= {"Matt","Pile"};
    private static float Matt=240;
    private static float Pile=300;
    public String foundation ;
    public String Soiltype;
    public double budget;
    
   public long Suggestion(String s,double Area)
   {
	   this.Soiltype=s;
	   if(Soiltype.equals("Rock"))
	   {
		   budget=Area*Matt;
		   System.out.println("Suggested type of Foundation is :"+ foundationType[0]);
		   System.out.println("Estimation Cost is :"+budget);
	   }
	   else if(Soiltype.equals("Gravel"))
	   {
		   budget=Area*Matt;
		   System.out.println("Suggested type of Foundation is :"+ foundationType[0]);
		   System.out.println("Estimation Cost is :"+budget);
	   }
	   else if(Soiltype.equals("Sand"))
	   {
		   budget=Area*Matt;
		   System.out.println("Suggested type of Foundation is :"+ foundationType[0]);
		   System.out.println("Estimation Cost is :"+budget);
	   }
	   else if(Soiltype.equals("Soft Clay"))
	   {
		   budget=Area*Pile;
		   System.out.println("Suggested type of Foundation is :"+ foundationType[1]);
		   System.out.println("Estimation Cost is :"+budget);
		   
	   }
	   else if(Soiltype.equals("Stiff Clay"))
	   {
		   budget=Area*Pile;
		   System.out.println("Suggested type of Foundation is :"+ foundationType[1]);
		   System.out.println("Estimation Cost is :"+budget);
	   }
	   return (long)budget;

	
   }
}
