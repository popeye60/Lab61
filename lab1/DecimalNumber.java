import java.util.Scanner;

public class DecimalNumber {

	public static void main(String[] args) {
		
		/*1 .จงเขียนโปรแกรมแสดงข้อความให้ผู้ใช้ใส่ค่าตัวเลขทศนิยม 1 ค่า เพื่อบวกกับเลข 3.33 แล้วนำผลลัพธ์ที่ได้บวกกับ 3.33 ต่อไปเรื่อย ๆ จนกว่าผลลัพธ์จะมากกว่าหรือเท่ากับ 30.00 โปรแกรมจึงหยุดการทำงาน*/
		
		Scanner in = new Scanner(System.in);
		int i = 0;
		System.out.println("Input number with 2 floating point : ");
		double number = in.nextDouble();
		
		number = number + 3.33;
		System.out.println("Number + 3.33 = " + number);
		
			for ( i = 0; number < 30 ; i++){
				number = number + 3.33;
				
				if (number < 30.00) {
					
					System.out.println("Number + 3.33 = " + number);
				}
				else {
			
					System.out.println("Sorry! No more than 30.00");
					
					}
			}
		}
	}
