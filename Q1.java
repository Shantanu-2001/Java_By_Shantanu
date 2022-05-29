import java.util.Scanner;
public class Q1{

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter first number :- ");
		int a=input.nextInt();
		
		System.out.println("Enter Second number :- ");
		int b=input.nextInt();
		
		System.out.println("Enter third number :- ");
		int c=input.nextInt();
		
		if(a>b) {
			System.out.println(a+" is largest.");
		}
		else if(b>c) {
			System.out.println(b+" is largest.");
		}
		else {
			System.out.println(c+" is largest.");
		}
		
	}
}
