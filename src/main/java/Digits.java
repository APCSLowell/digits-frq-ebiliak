import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{
		digitList = new ArrayList <Integer>();
		int digit;
		int rem = num;
		while(rem > 0){
			digit = rem % 10;
			rem = rem /10;
			digitList(0,digit);
		}
		
	}
	    

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i = 0; i < digitlist.size()-1; i++){
			if(digitList.get(i) >= digitList.get(i+1)){
				return false;
			}
			return true;
		}
		

	}
	
	public String toString()
	{
		return digitList.toString();
	}

}
