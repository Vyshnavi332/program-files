package programming;

import java.util.Scanner;

public class question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		/*int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);*/
		//we can also use another method without using another variable
		System.out.println("Before");
		System.out.println(a);
		System.out.println(b);

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("-------------------------------");
		System.out.println("After");
		System.out.println(a);
		System.out.println(b);

	}

}
