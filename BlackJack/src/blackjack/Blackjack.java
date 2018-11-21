package blackjack;

import java.util.Random;

public class Blackjack  
	{
static Random numgen = new Random();	
	
	public static void main(String[]args)
	{
		calculation();
	}

	public static void calculation()
	{
		int number1 = (numgen.nextInt(21) +2);
		int number2 = (numgen.nextInt(21) +2);
		
		if (number1 < 22) {
			System.out.println(number1);
			}
			else if (number2 < 22) {
				System.out.println(number2);
		}
	}
}
