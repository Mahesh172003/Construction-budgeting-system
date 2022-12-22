package _CBS;

public class TimeFrame extends PropertyDetails
{
	public float time;
	public float calcTimeFrame(int floorCount,int roomCount, String Btype )
	{
		if (Btype=="Individual house")
		{
			if( floorCount < 2)
			{
				time= 6;
			}
			else 
			{
				time=(6 + 2*(floorCount-1));
			}
		}
		else if (Btype=="Apartment")
		{
			if( floorCount < 2)
			{
				time= 9;
			}
			else 
			{
				time=(9 + 4*(floorCount-1));
			}
		}
		return time;
	}
	
}
