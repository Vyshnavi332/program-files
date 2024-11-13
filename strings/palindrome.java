package strings;

import java.util.Scanner;

public class palindrome {

	public static boolean palindrome(String s)
	{
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i) !=s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s=scan.nextLine();
		if(palindrome(s)
				{
					System.out.print("Yes");
				}
		else
		{
			System.out.print("No");
		}
		}

	}

