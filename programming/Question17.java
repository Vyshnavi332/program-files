package programming;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		/*for(int i=1;i<=n;i++)
		{
			 if(n%i==0)
			{
				System.out.println(i + " ");
			}
			//we can write above code but it is not that efficient
			
		}*/
		for(int i=2;i<=n;i=i+2)//for odd numbers---> for(i=1;i<=n;i=i+2)
		{
				System.out.println(i);	
		}
		

	}

}
