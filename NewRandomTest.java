/*
 * Jamie Gashler
 * 09/29/22
 * This is a program that tests the six different NewRandom.java methods
 */

public class NewRandomTest 
{

	public static void main(String[] args) 
	{
		NewRandom rand = new NewRandom();
		int test = 25;

		//Test for method 1
		System.out.println("\nMethod 1: nextInt(5,9)");
		for (int i = 0; i < test; i++) 
		{
			int a = rand.nextInt(5, 9);
			System.out.print(a + " ");

		}
		System.out.println();

		
		
		//Test for method 2
		System.out.println("\nMethod 2: nextChar()");
		for (int i = 0; i < test; i++) 
		{
			char a = rand.nextChar();
			System.out.print(a + " ");
		}
		System.out.println();

		
		
		//Test for method 3
		System.out.println("\nMethod 3-1: nextChar(c,f)");
		for (int i = 0; i < test; i++) 
		{
			char a = rand.nextChar('c', 'f');
			System.out.print(a + " ");
		}
		System.out.println();

		System.out.println("\nMethod 3-2: nextChar(x,c)");
		for (int i = 0; i < test; i++) 
		{
			char a = rand.nextChar('x', 'c');
			System.out.print(a + " ");
		}
		System.out.println();

		
		
		//Test for method 4
		System.out.println("\nMethod 4-1: nextCharNone(c,f)");
		for (int i = 0; i < test; i++) 
		{
			char a = rand.nextCharNone('c', 'f');
			System.out.print(a + " ");
		}
		System.out.println();

		System.out.println("\nMethod 4-2: nextCharNone(x,c)");
		for (int i = 0; i < test; i++) 
		{
			char a = rand.nextCharNone('x', 'c');
			System.out.print(a + " ");
		}
		System.out.println();

		
		//Test for method 5
		System.out.println("\nMethod 5-1: nextChar(c,3)");
		for (int i = 0; i < test; i++) {
			char a = rand.nextChar('c', 3);
			System.out.print(a + " ");
		}
		System.out.println();

		System.out.println("\nMethod 5-2: nextChar(x,5)");
		for (int i = 0; i < test; i++) 
		{
			char a = rand.nextChar('x', 5);
			System.out.print(a + " ");
		}
		System.out.println();

		System.out.println("\nMethod 5-3: nextChar(c,-3)");
		for (int i = 0; i < test; i++) 
		{
			char a = rand.nextChar('c', -3);
			System.out.print(a + " ");
		}
		System.out.println();

		System.out.println("\nMethod 5-4: nextChar(x,-3)");
		for (int i = 0; i < test; i++) 
		{
			char a = rand.nextChar('x', -3);
			System.out.print(a + " ");
		} 
		System.out.println();

		System.out.println("\nMethod 5-5: nextChar(k,0)");
		for (int i = 0; i < test; i++) 
		{
			char a = rand.nextChar('k', 0);
			System.out.print(a + " ");
		}
		System.out.println();
		
		
		//Test for method 6
		System.out.println("\nMethod 6: nextSpecialChar()");
		for (int i = 0; i < test; i++) 
		{
			char a = rand.nextSpecialChar();
			System.out.print(a + " ");

		}
		System.out.println();
	}

}
