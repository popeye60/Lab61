import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {
		
		
/*1.⨷��  Fizzbuzz ���͹䢢ͧ⨷���մѧ���   ����Ţ�����ô��� 3 ŧ�������ʴ� "Fizz"   ����Ţ�����ô��� 5 ŧ�������ʴ� "Buzz" ����Ţ������ 3 ��� 5 (�ͧ���͹�) ŧ�������ʴ� "FizzBuzz" �������������óչ������ʴ�����Ţ����͡��*/

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
