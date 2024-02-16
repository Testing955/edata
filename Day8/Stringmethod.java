package Day8;

public class Stringmethod {

	public static void main(String[] args) 
	{
String a = "Welcome";
System.out.println(a);
//if we've to find out the length of the String we've to use .length() method
System.out.println(a.length());
String b = " To Java Class";
String c = " Selenium class also";
//If we've have to concat the two strings i.e adding two or more String we've to use concat() method
//System.out.println(a.concat(b));
System.out.println(a.concat(b).concat(c));
//if we have to trim the extra spaces from the left and right then we've to use trim() command
String d = "   Prince Gaurav     ";
String e = "Welcome";
//System.out.println(d.trim());
System.out.println(d.length());
System.out.println(d.trim().length());
//If we've to compare the Strings value then we've to use the equals() command
//If we've to ignore any String values then we've to ue equalsIgnoreCase() command
System.out.println(a.equals(e));
System.out.println(a.equalsIgnoreCase(e));
//if we've to find out the index number on the String we've to use charAt(0) command
System.out.println(a.charAt(0));
System.out.println(a.charAt(5));
//If we've to find out whether the String contains any particular value then we've to use contains() command
System.out.println(a.contains("wel"));
System.out.println(a.contains("Wel"));
//If we've to replace any char value from new value in the String then we've to use replace()
System.out.println(a.replace('W', 'w'));
//if we've to substring any value from the string range then we've to use substring() method
System.out.println(a.substring(2,5));
System.out.println(a.substring(1,4));
//if we've to split the string then we've to use split() command with the help of java
//Should not use for split * $ ^ ? . + -
a = "prince@gmail.com";
String p[]=a.split("@");
System.out.println(p[1]);
System.out.println(p[0]);
//If we've to print all the character of String in Upper case
System.out.println(a.toUpperCase());
//If we've to print all the character of String in Lower case
System.out.println(a.toLowerCase());



	}

}
