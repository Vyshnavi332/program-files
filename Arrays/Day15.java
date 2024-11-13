package Arrays;

import java.util.Scanner;

public class Day15 {
	
	static void countOccurence(int[] ar)
	{
		int count=1;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]==ar[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(ar[i] + "-" + count);
				count=1;
			}
			
		}
		System.out.println(ar[ar.length-1] + "-" + count);
	}
	
	
	static void withoutRepeatingElements(int[] ar)
	{
		int count=1;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]==ar[i+1])
			{
				count++;
			}
			else
			{
			System.out.println(ar[i]);
			count=1;
			}
		}
		System.out.println(ar[ar.length-1]);
	}
	
	static void uniqueElements(int[] ar)
	{
		int count=1;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]==ar[i+1])
			{
				count++;
			}
			else
			{
				if(count==1)
				{
					System.out.println(ar[i]);
				}
				count=1;
			}
		}
		if(count==1)
		{
			System.out.println(ar[ar.length-1]);
		}
	}
	 static int countUniqueElements(int[] ar)
	 {
		 int count=1;
		 int uniqueCount=0;
		 for(int i=0;i<ar.length-1;i++)
		 {
			 if(ar[i]==ar[i+1])
			 {
				 count++;
			 }
			 else 
			 {
				 if(count==1)
				 {
					 uniqueCount++;
				 }
				 count=1;
			 }
		 }
		 if(count==1)
		 {
			 uniqueCount++;
		 }
		 return uniqueCount;
	 }
	 
	 
	 
	 
	 
	 
	 static int largestRepeatingElement(int[] ar)
	 {
		 for(int i=ar.length-2;i>=0;i--)
		 {
			 if(ar[i]==ar[i+1])
			 {
				return ar[i];
			 }
		 }
	 }
	
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int[] ar =new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		//countOccurence(ar);
		//withoutRepeatingElements(ar);
		//uniqueElements(ar);
		//System.out.println(countUniqueElements(ar));
		System.out.println(largestRepeatingElement(ar));
	}

}
