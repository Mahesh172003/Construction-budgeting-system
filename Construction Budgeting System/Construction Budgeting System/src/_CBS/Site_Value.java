package _CBS;
import java.util.ArrayList;
public class Site_Value {
	    private ArrayList<Double> Xdata;
	    private ArrayList<Double> Ydata;
	    private double result1;
	    private double result2;

	    private double getXMean(ArrayList<Double> Xdata) {
	        result1 = 0.0 ;
	        for (Integer i = 0; i < Xdata.size(); i++) {
	            result1 = result1 + Xdata.get(i);
	        }
	        return result1/Xdata.size();
	    }

	    private double getYMean(ArrayList<Double> Ydata) {
	        result2 = 0.0 ;
	        for (Integer i = 0; i < Ydata.size(); i++) {
	            result2 = result2 + Ydata.get(i);
	        }
	        return result2/Ydata.size();
	    }

	    /**
	     * The equation of straight line is "y = m * x + c"
	     * where m is the line slope and (x, y) are the data point
	     * coordinates and c is the Yintercept.
	     * 
	     *        Y1  = m *   X1  + c
	     *      Ymean = m * Xmean + c
	     *    ------------------------------
	     *     (Ymean - Y1) = m * (Xmean - X1)
	     *    ------------------------------
	     * 
	     * Multiply both sides by (Xmean - X1) and calculate m to 
	     * get line slope.
	     */
	    private double getLineSlope (double Xmean,double Ymean, double X1, double Y1) {
	    	double num1 = X1 - Xmean;
	    	double num2 = Y1 - Ymean;
	    	double denom = (X1 - Xmean) * (X1 - Xmean);
	        return (num1 * num2) / denom;
	    }

	    /**
	     * The equation of straight line is "y = m * x + c"
	     * where m is the line slope and (x, y) are the data point
	     * coordinates and c is the Yintercept.
	     * 
	     *      y - (m * x) = Yintercept
	     */
	    private double getYIntercept (double Xmean, double Ymean, double lineSlope) {
	        return Ymean - (lineSlope * Xmean);
	    }

	    /**
	     * To predict the Y value for a given data point, 
	     * just substitute the values m, x and c in 
	     * y = m * x + c
	     */
	    private Double predictValue (Double inputValue) {
	    	Double X1 = Xdata.get(0) ;
	    	Double Y1 = Ydata.get(0) ;
	    	Double Xmean = getXMean(Xdata) ;
	    	Double Ymean = getYMean(Ydata) ;
	    	Double lineSlope = getLineSlope(Xmean, Ymean, X1, Y1) ;
	    	Double YIntercept = getYIntercept(Xmean, Ymean, lineSlope) ;
	    	Double prediction = (lineSlope * inputValue) + YIntercept ;
	        return prediction ;
	    }

	    public void increase_val(double year,double landPrice) {
	        Site_Value lRegression = new Site_Value();
	        lRegression.Xdata = new ArrayList<>() ;
	        lRegression.Ydata = new ArrayList<>() ;

	        lRegression.Xdata.add((double) 2000) ;
	        lRegression.Xdata.add((double) 2005) ;
	        lRegression.Xdata.add((double) 2010) ;
	        lRegression.Xdata.add((double) 2015) ;
	        lRegression.Xdata.add((double) 2025) ;
	        lRegression.Xdata.add((double) 2030) ;
	        lRegression.Xdata.add((double) 2035) ;
	        lRegression.Xdata.add((double) 2040) ;
	        lRegression.Xdata.add((double) 2045) ;
	        lRegression.Xdata.add((double) 2050) ;


	        lRegression.Ydata.add((landPrice*0.05)) ;
	        lRegression.Ydata.add((landPrice*0.30)) ;
	        lRegression.Ydata.add((landPrice*0.55)) ;
	        lRegression.Ydata.add((landPrice*0.80)) ;
	        lRegression.Ydata.add((landPrice*1.05)) ;
	        lRegression.Ydata.add((landPrice*1.30)) ;
	        lRegression.Ydata.add((landPrice*1.55)) ;
	        lRegression.Ydata.add((landPrice*1.80)) ;
	        lRegression.Ydata.add((landPrice*2.05)) ;
	        lRegression.Ydata.add((landPrice*2.30)) ;
	        lRegression.Ydata.add((landPrice*2.55)) ;


	System.out.print("The forecasted price increase till "+(int)year+"  is: ");
	        System.out.println(lRegression.predictValue(year));
	    }
	}



