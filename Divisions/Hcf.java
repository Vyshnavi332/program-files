package Divisions;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int m = sc.nextInt();
	// implement your logic here

	int hcf=findHCF(n,m);
	System.out.print(hcf + " ");
	}
	public static int findHCF (int a, int b)
	{
	if(b>a)
	{
	return findHCF(b,a);
	}
	if(b==0)
	{
	return a;
	}
	return findHCF(b,a%b);
	}
	}

