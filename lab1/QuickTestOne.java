import java.util.Scanner;

public class QuickTestOne {

	public static void main(String[] args) {
		
/*12.	Write a QuickTest program to calculate the Bath amount in a piggy bank. 
The bank currently contains 12 1000-Baht bank note, 20 500-Baht bank note, 32 100-Baht bank note, 
45  50-Baht bank note and 27 20-Baht bank note*/

	Scanner in = new Scanner(System.in);
		 System.out.println("Enter calculate the Bath amount : ");
		 System.out.println ("Bank 1000 Baht : ");
		 int a = in.nextInt();
		 System.out.println ("Bank 500 Baht : ");
		 int b = in.nextInt();
		 System.out.println ("Bank 100 Baht : ");
		 int c = in.nextInt();
		 System.out.println ("Bank 50 Baht : ");
		 int d = in.nextInt();
		 System.out.println ("Bank 20 Baht : ");
		 int e = in.nextInt();
		 
		 int total = 1000*a + 500*b + 100*c + 50*d + 20*e;
		 System.out.println ("ToTal : " + total + " Baht");
	}

}
