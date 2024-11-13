package Arrays;

import java.util.Scanner;

public class largestRepeatingElement {
	public static int printingLargestRepeatingElement(int[] arr)
	{
		for(int i=arr.length-1;i>=1;i--)
		{
			if(arr[i] ==arr[i-1])
			{
				return arr[i];
			}
		}
		return arr[i];
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		int res=printingLargestElement(arr);
		System.out.print(res);
	}

}
