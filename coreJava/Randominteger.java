package coreJava;

public class Randominteger {
	public static void main(String[]args) {
		
		for (int num = 1; num <= 5 ; num++) {
			int a = (int) (Math.random()*100) ;
			System.out.println(a);
		}
	}

}
