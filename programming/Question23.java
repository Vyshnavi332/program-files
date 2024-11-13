package programming;

import java.util.Scanner;
//<------------------<>--------------<>------------------<Low  efficiency>----------------------<>-------------------------------->
public class Question23 {
	public static void checkPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
		if(count==2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
	
	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
	 checkPrime(n);
	}

}

//<------------------<>--------------<>------------------<Moderate efficiency>----------------------<>-------------------------------->
/*public class Question23 {
public static String checkPrime(int n)
{
	int count=0;
	for(int i=1;i<=n;i++)
{
	if(n%i==0)
	{
		count++;
	}
}
	if(count==2)
	{
		return "Prime";
	}
		return "Not Prime";
	}

public static void main(String[] args) {
 Scanner scan=new Scanner(System.in);
 int n=scan.nextInt();
 System.out.println(checkPrime(n));
}

}*/


//<------------------<>--------------<>------------------<High efficiency>----------------------<>-------------------------------->
/*public class Question23 {
public static String checkPrime(int n)
{
	if(n<=1)
	{
	return "Not Prime";
	}
	
	for(int i=1;i<=n;i++)
{
	if(n%i==0)
	{
		return "Not Prime";
	}
}
			return "Prime";
	}

public static void main(String[] args) {
 Scanner scan=new Scanner(System.in);
 int n=scan.nextInt();
 System.out.println(checkPrime(n));
}

}*/

