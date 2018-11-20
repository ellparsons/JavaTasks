package conditonals;

public class Conditionals {

	public static void main(String[] args) {
	boolean isAdd = true;
	int num1 = 2;
	int num2 = 9;
	System.out.println(addMulti(num1, num2, isAdd));
	}
	
	
	public static int addMulti(int number1, int number2, boolean choice) 
	{
		int sum;
		if(choice)
		{
			sum = number1 + number2;
			
		}
		else
		{
			sum = number1 * number2;
		}
		return sum;
	}
}
