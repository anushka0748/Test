package coreJava;

public class StringMethod{
	public static void main(String[]args) {
		 String name =" Amanshu Sahu";
		 System.out.println(" String Length -" + name.length());
		 System.out.println(" 7th character is -" + name.charAt(6));
		 System.out.println(" Sahu index is-" + name.indexOf("Sahu"));
		 System.out.println(" First a position -" + name.indexOf("a"));
		 System.out.println(" Last a position -" + name.lastIndexOf("a"));
		 System.out.println(" a is replaced by b-" + name.replace("a","b"));
		 System.out.println(" a is replaced by b-" + name.replaceAll("a","b"));
		 System.out.println(" Chhota Amanshu -" + name.toLowerCase());
		 System.out.println(" Bada Sahu -" + name.toUpperCase());
		 System.out.println(" ends With Amanshu - " + name.endsWith("Amanshu"));
		 System.out.println(" Substring -" + name.substring(6));
		 
		 
	}
}
