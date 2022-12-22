package _CBS;

import java.util.Scanner;



public class Test_Driver {

	public static void main(String Args[])  {
		   Scanner cin=new Scanner (System.in);   
		int fc,rc,choice;
		long area;
		double Foundation_budget,Labour_budget,Material_budget,A_b,E_b,S_b;
		double Time;
		String soilType;
		
		System.out.println("\t ----------WELCOME TO CONSTRUCTION BUDGETIING SYSTEM----------\t");
		System.out.println("\nEnter the required information of the building;");
	
			System.out.print("Enter total number of floors: ");
		fc=cin.nextInt();
		System.out.print("Enter total number of rooms per home: ");
		rc=cin.nextInt();
		System.out.print("Enter total area of land: ");
		area=cin.nextLong();
		System.out.println("\nSelect Building Type:\n1. Individual house\n2. Apartment\n");
	    System.out.print("Enter building choice(1 or 2): " );
	     choice=cin.nextInt();
	     PropertyDetails P=new PropertyDetails();
	     P.setArea(area);
	     P.setFloorCount(fc);
	     P.setRoomCount(rc);
	    
		System.out.println("\n\t----------FOUNDATION BUDGETING----------");
		Foundation F=new Foundation();
		System.out.println("Soil Types:\n1. Rock\n2. Gravel\n3. Sand\n4. Soft Clay\n5. Stiff Clay");
		System.out.print("Enter the name of soil type as mentioned: ");
		soilType=cin.next();
		//System.out.println("\n");
		Foundation_budget=F.Suggestion(soilType, area);
		//System.out.println(Foundation_budget);
		System.out.println("____________________________________________________________________________________________________________________________");
		 P.setSoilType(soilType);
		     
			if(choice==1)
		     {
		    	 System.out.println("\t----------BUILDING TYPE: INDIVIDUAL HOUSE----------\t");
		    	 System.out.println("\n1) LABOUR BUDGETING:\n");
		    	 Labour L=new Labour("Individual house", fc, rc);
		    	 Labour_budget=L.totallabour_calc();
		    	 System.out.println("Total Estimation of Labour: "+ Labour_budget);
		    	 System.out.println("____________________________________________________________________________________________________________________________");
		    	 System.out.println("2) MATERIAL BUDGETING:\n");
		    	 Materials M=new Materials();
		    	 M.storeDetails(fc, rc, "Individual house");
		    	 Material_budget=M.total_Mat_Calc();
		    	 System.out.println("\n Total Estimation of Materials: "+ Material_budget);
		    	 System.out.println("\n");
				M.floor_Calc();
				System.out.println("____________________________________________________________________________________________________________________________");
				System.out.println("3)TIME FRAME FOR COMPLETION OF PROJECT:\n");
				TimeFrame T=new TimeFrame();
				Time=T.calcTimeFrame(fc, rc, "Individual house");
				System.out.println("Estimated time(in months): "+Time);
				System.out.println("____________________________________________________________________________________________________________________________");
				System.out.println("4)ENGINEER, ARCHITECT AND SUPERVISOR BUDGETING:\n");
				Architect A=new Architect();
				A_b = A.archTotalPay(area);
				Engineer E= new Engineer();
				Supervisor S =new Supervisor();
				E_b=E.totalEngPayCheck(Time);
				S_b=S.totalSupPayCheck(Time);
				System.out.println("____________________________________________________________________________________________________________________________");
				 Site_Value S1= new Site_Value();
			     float landVal;
			     double landPrice,year;
			     System.out.println("5)FORECAST OF INCREASE IN SITE VALUE IN 'N' YEARS:\n ");
			     System.out.print("Enter a year(less than 2050):");
			     year=cin.nextDouble();
			     System.out.print("\nEnter the value of land(per sq. feet):");
			     landVal=cin.nextFloat();
			     landPrice=area*landVal;
			     S1.increase_val(year,landPrice); 
				double Total_cost;
			     Total_cost=A_b+E_b+S_b+Material_budget+Labour_budget+Foundation_budget;
			     System.out.println("____________________________________________________________________________________________________________________________");
			     System.out.println("\t----------FINAL BUDGET----------\n");
			     System.out.println("Total Price estimation: "+ Total_cost);
			     System.out.println("\n____________________________________________________________________________________________________________________________");
		     }
		     else if(choice==2) {
		    	 System.out.println("\t----------BUILDING TYPE: APARTMENT----------\t");
		    	 System.out.println("\n1) LABOUR BUDGETING:\n");
		    	 Labour L=new Labour("Apartment", fc, rc);
		    	 Labour_budget=L.totallabour_calc();
		    	 System.out.println("Total Estimation of Labour: "+ Labour_budget);
		    	 System.out.println("____________________________________________________________________________________________________________________________");
		    	 System.out.println("\t2) MATERIAL BUDGETING:\n");
		    	 Materials M=new Materials();
		    	 M.storeDetails(fc, rc, "Apartment");
		    	 Material_budget=M.total_Mat_Calc();
		    	 System.out.println("\n Total Estimation of Materials: "+ Material_budget);
		    	 System.out.println("\n");
				M.floor_Calc();
				System.out.println("____________________________________________________________________________________________________________________________");	
				System.out.println("3)TIME FRAME FOR COMPLETION OF PROJECT:\n");
				TimeFrame T=new TimeFrame();
				Time=T.calcTimeFrame(fc, rc, "Apartment");
				System.out.println("\nEstimated time(in months): "+Time);
				System.out.println("____________________________________________________________________________________________________________________________");
				System.out.println("4)ENGINEER, ARCHITECT AND SUPERVISOR BUDGETING:\n");
				Architect A=new Architect();
				A_b = A.archTotalPay(area);
				Engineer E= new Engineer();
				Supervisor S =new Supervisor();
				E_b=E.totalEngPayCheck(Time);
				S_b=S.totalSupPayCheck(Time);
				System.out.println("____________________________________________________________________________________________________________________________");
				 Site_Value S1= new Site_Value();
			     float landVal;
			     double landPrice,year;
			     System.out.println("5)FORECAST OF INCREASE IN SITE VALUE IN 'N' YEARS:\n ");
			     System.out.print("Enter a year(less than 2050):");
			     year=cin.nextDouble();
			     System.out.print("\nEnter the value of land(per sq. feet):");
			     landVal=cin.nextFloat();
			     landPrice=area*landVal;
			     S1.increase_val(year,landPrice); 
				double Total_cost;
			     Total_cost=A_b+E_b+S_b+Material_budget+Labour_budget+Foundation_budget;
			     System.out.println("____________________________________________________________________________________________________________________________");
			     System.out.println("\t----------FINAL BUDGET----------\n");
			     System.out.println("Total Price estimation: "+ Total_cost);
			     System.out.println("\n____________________________________________________________________________________________________________________________");
		     }
		     
		    
		
		     
		}
		
}
