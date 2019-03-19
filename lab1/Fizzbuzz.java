import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {
		
		
/*1.โจทย์  Fizzbuzz เงื่อนไขของโจทย์มีดังนี้   ตัวเลขที่หารด้วย 3 ลงตัวให้แสดง "Fizz"   ตัวเลขที่หารด้วย 5 ลงตัวให้แสดง "Buzz" ตัวเลขที่หาร 3 และ 5 (สองเงื่อนไข) ลงตัวให้แสดง "FizzBuzz" ถ้าไม่ใช่ในสามกรณีนี้ให้แสดงตัวเลขนั้นออกมา*/

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = in.nextInt();
		
			if ((num % 3 == 0)&&(num % 5 == 0)) {
				System.out.println("...FizzBuzz...");
			}
			else if( num % 3 == 0) {
				System.out.println("...Fizz... ");
			}
			else if (num % 5 == 0) {
				System.out.println("...Buzz...");
			}
			else {
				System.out.println("..." + num +"...");
			}
	}

}
