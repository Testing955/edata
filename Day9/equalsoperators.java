package Day9;

public class equalsoperators {

	public static void main(String[] args) 
	{
//Case 1 without new object
String g = "ABC";     // (==) it is used for primitive data type (i.e: int,char,float,double)
String h = "ABC";      // (equals) it is used for non primitive data type (i.e String list, String comparison, array list, array comparison)
System.out.println(g==h); //true
System.out.println(g.equals(h));  //true

//Case 2 with object
String y = "welcome";
String f = new String("welcome");
String z = f;
System.out.println(y==f); //false
System.out.println(f==z); //true
System.out.println(y.equals(f)); // true

//Case
y="Place";
f=new String ("Place");
z=f;
System.out.println(y==z); //false
System.out.println(y.equals(z)) ;
	}

}
