package java8.java8;

import java.util.*; 
//import java.util.stream.IntStream; 

class LambdaExpression2 { 

	public static void main(String[] args) 
	{ 
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		List<String> l=new ArrayList<String>();
      	System.out.println("Enter the number of strings");
		int n=sc.nextInt();
		System.out.println("Enter the strings");
		for(int i=0;i<n;i++)
		{
			String s =sc.next();
			l.add(s);
		}
		for(int i=0;i<n;i++)
		{
			if(l.get(i).length()==3 && l.get(i).charAt(0)=='a')
			{
					System.out.println(l.get(i));

			}
			else
			{
				System.out.println("Inavlid");
			}
		}
	}
}