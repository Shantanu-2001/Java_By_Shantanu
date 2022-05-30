import java.util.Scanner;
public class Q4 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number :-");
	int n=in.nextInt();
	
	System.out.println("Enter the number whose occurence you want to know :-");
	int o=in.nextInt();
    int count=0;
    int rem;
	while(n >0) {
		rem =n%10;
		n= n/10;
		if(rem==o) {
			count++;
		}
	}
	System.out.println(o+ " is present "+count+" times.");
}
}

