import java.util.Scanner;

public class QuickTest {

	public static void main(String[] args) {

/*11. Write a QuickTest. The equation for this conversion is Celsius = 5.0 / 9.0 * (Fahrenheit - 32.0).
Have your program convert and display the Celsius temperature corresponding to 98.6 degrees Fahrenheit.*/

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Fahrenheit : ");
		 double f = in.nextDouble();
		 double c = 5.0 / 9.0 * ( f - 32.0);
		 System.out.println("Fahrenheit is "+ f + " F" + " Celsius = " + c + " C");
		
	}

}
