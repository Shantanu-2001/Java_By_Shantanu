import java.util.Scanner;
public class Sum2{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);// for taking input from keyboard
                
		System.out.println("Enter the first number :- ");
		int num1= input.nextInt();

		System.out.println("Enter the second number :- ");
		int num2= input.nextInt();

		int Sum=num1+num2;

		System.out.println("The Sum is :- "+Sum);

	}
}

