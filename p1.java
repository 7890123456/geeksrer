package day1;
import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		// Take input from user and print greatest number among three numbers.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no 1-");
		int a=sc.nextInt();
		System.out.println("Enter no 2-");
		int b=sc.nextInt();
		System.out.println("Enter no-3");
		int c=sc.nextInt();	
		if(a>b && a>c)
			System.out.println(a);
		else if(b>a && b>c)
			System.out.println(b);
		else
			System.out.println(c);
	}

}
