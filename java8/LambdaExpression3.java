package java8.java8;

import java.util.*;
interface Palin{  
    String say(String str);  
}  
  
public class LambdaExpression3{  
    public static void main(String[] args) {  
      	List<String> l=new ArrayList<String>();
      	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
      	System.out.println("Enter the number of strings to validate wheather it is a palindron or not");
		int n=sc.nextInt();
		System.out.println("Enter the strings");
		for(int i=0;i<n;i++)
		{
			l.add(sc.next());
		}
	         	Palin s = (str)-> {  
	  	String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1+=str.charAt(i);
		}        
		if(str1.equals(str))
			return "Palindrone";
		else
			return "Not an Palindrone";
	          };  
		for(int i=0;i<n;i++)
		{
	         	System.out.println(s.say(l.get(i)));
		}
	    }  
}  