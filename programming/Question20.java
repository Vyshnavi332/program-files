package programming;

import java.util.Scanner;

public class Question20 {
public static void main(String []args)
{
	Scanner scan =new Scanner(System.in);
	int m=scan.nextInt();
	for(int j=1;j<=m;j++)
	{
	for(int i=1;i<=10;i++)
	{
		System.out.println(j + " x " + i + " = " + j*i);//to print tables from 1 to n
	}
	System.out.println();
	}
}
}
