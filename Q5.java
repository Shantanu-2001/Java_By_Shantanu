import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the Number :- ");
		int n=in.nextInt();
		int ans=0;
		while(n>0) {
			int rem;
			rem=n%10;
			ans=ans*10+rem;
			n=n/10;
		}
		System.out.println("Reverse :-"+ans);
	}

}
