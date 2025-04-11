import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
{
    digitList = new ArrayList<Integer>();
    digitList.add(0, new Integer(num % 10));

    int numRemaining = num / 10;
    while(numRemaining > 0)
    {
        digitList.add(0, new Integer(numRemaining % 10));
        numRemaining /= 10;
    }
}
	    

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i = 0; i < digitList.size()-1; i++){
			if(digitList.get(i) >= digitList.get(i+1)){
				return false;
			}
		
		}
		return true;

	}
	
	public String toString()
	{
		return digitList.toString();
	}

}
