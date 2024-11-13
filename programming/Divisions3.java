package programming;
import java.util.Scanner;
public class Divisions3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			if(n%2==0 && n%5==0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
	}

}
