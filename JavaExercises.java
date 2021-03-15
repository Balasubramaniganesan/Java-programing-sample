package sample;

public class JavaExercises {
	public static void main(String[] args)
	{
	   printPattern();
	}

	static void printPattern(){

		int a,b,c;

		for (a = 1; a <= 7; a++)
		{
		  for (b = 1; b <= a; ++b)
		      System.out.print(b);

		  for (c = 7 - a; c >= 1; c--)
		     System.out.print("*");

		  System.out.println("");
		      }



	  }

	}
	