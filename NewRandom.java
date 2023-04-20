
/*
 * Jamie Gashler
 * 09/29/22
 * This program functions as an upgrade to the 
 * built-in java.util.Random class that will
 * add new methods making it easier to deal 
 * with random characters and not just numbers.
 */

import java.util.Random;

/*
 * This NewRandom uses inheritance by extending 
 * Random which gives it all of the built-in methods 
 * for generating random integers
 */
public class NewRandom extends Random
{

	//Method 1
	/*
	 * Overloads Random's nextInt() to return a random 
	 * number between low and high, both inclusive. 
	 * [low, high]
	 */
	public int nextInt(int low, int high)
	{
		/*
		 * the + 1 makes it so that the higher number 
		 * is included in the final result
		 */
		int n = nextInt(1 + high - low) + low;

		return n;
	}


	//Method 2
	//Returns a random lowercase letter
	public char nextChar()
	{
		/*
		 * this uses char directly instead 
		 * of numerical values
		 */
		int n = nextInt('a','z');
		return (char)n;
	}


	//Method 3
	/*
	 * Returns a random lowercase letter 
	 * from a certain set of letters
	 */
	public char nextChar(char from, char to)
	{
		int random = 0;
		int n = 0;
		if(from<to)
		{		
			/*
			 * if the lower letter is less than the 
			 * higher, n is a random char between them
			 */
			n = nextInt(from,to);
		}		
		else if(from>to)
		{
			/*
			 * if the lower letter is greater than 
			 * the higher, n is a random char between 
			 * the lower and 'z' and the higher and 'a'
			 */
			random = nextInt(0,1);
			
			if(random == 0)
			{
				n = nextInt(from,'z');
			}
			else if(random == 1) 
			{
				n = nextInt('a',to);
			}
		}
		else 
		{
			//if from == to  n equals the letter itself
			n = from;
		}	
		return(char)n;
	}


	//Method 4
	/*
	 * Returns a random lowercase letter 
	 * except from a certain set of letters
	 */
	public char nextCharNone(char from, char to)
	{
		int random = 0;
		int n = 0;
		
		/*
		 * if the lower letter is less than the 
		 * higher, n is a random char between the higher 
		 * and 'z' and the lower and 'a' so that 
		 * everything between the bounds is excluded
		 */
		if(from<to)
		{
			random = nextInt(0,1);
			if(random == 0)
			{
				n = nextInt(to + 1,'z');
			}
			else if(random == 1)
			{
				n = nextInt('a', from - 1);
			}
		}	
		else if(from>to)
		{
			/*
			 * if the lower letter is greater than the 
			 * higher, n is a random char between them 
			 * exclusive of the upper and lower bounds
			 */
			n = nextInt(to + 1, from - 1);
		}	
		else 
		{
			//if from == to  n equals the letter itself
			n = from;
		}
		return(char)n;
	}	

	
	//Method 5
	/*
	 * Returns a random lowercase 
	 * letter given a letter and a number
	 */
	public char nextChar(char from, int num)
	{	
		if(num > 0)
		{
			/*
			 * if num > 0, n is a random int between 
			 * from and the number of characters in front
			 */
			int n = nextInt(from, from + num);
			if(n > 'z')
			{
				n = n - ('z' + 1 - 'a');
			}
			return (char)n;
		}
		else if(num < 0)
		{
			/*
			 * if num < 0, n is a random int between from 
			 * and the number of characters behind
			 */
			int n = nextInt(from + num, from);
			if(n < 'a')
			{
				n = n + ('z' + 1 - 'a');
			}
			return (char)n;
		}	
		else
		{
			//if from == to  n equals the letter itself
			return (char)from;
		}
	}

	
	//Method 6
	//Returns a random special character
	public char nextSpecialChar()
	{
		int low = 33;
		int high = 126;
		int lowNum = 47;
		int highNum = 59;
		int lowCaps = 64;
		int highCaps = 92;
		int lowLetter = 96;
		int highLetter = 124;
		char c =' ';
		boolean special = false;
		
		while(!special)
		{
			int n=nextInt(low, high);
			c=(char)n;
					
			if(c>lowNum && c<highNum)
			{	
				/*
				 * if between the bounds where 
				 * the ASCII values are numbers, 
				 * c is not a special character
				 */
				special = false;
			}			
			else if(c>lowCaps && c<highCaps)
			{
				/*
				 * if between the bounds where 
				 * the ASCII values are capital letters, 
				 * c is not a special character
				 */
				special = false;
			}			
			else if(c>lowLetter && c<highLetter)
			{
				/*
				 * if between the bounds where 
				 * the ASCII values are lowercase letters, 
				 * c is not a special character
				 */
				special = false;
			}						
			else
			{
				/*
				 * if c is not a number AND not a letter, 
				 * c is a special character
				 */
				special=true;
			}
		}
		return c;

	}

}
