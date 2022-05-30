import java.util.Scanner;
public class Q2{
public static void main(String[] args) {
	int a=0;
	int b=1;
	int count=2;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the value of n:- ");
	int n=in.nextInt();
	
	while(count <=n) {
	       int temp=b;
	       b=b+a;
	       a=temp;
	       count++;
	       
	}
System.out.print(b);
}
}
