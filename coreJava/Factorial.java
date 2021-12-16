package coreJava;

public class Factorial {
	public static void main(String[]args) {
		
		int j = 1;
		
		for (int i = 7; i >= 1 ; i --)
		{
			j = i * j ;
			if ( i == 1 )
			{
				System.out.println(j);
			}
		}
		
	}

}
