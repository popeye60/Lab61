import java.util.Scanner;

public class DecimalNumber {

	public static void main(String[] args) {
		
		/*1 .����¹������ʴ���ͤ��������������ҵ���Ţ�ȹ��� 1 ��� ���ͺǡ�Ѻ�Ţ 3.33 ���ǹӼ��Ѿ������ǡ�Ѻ 3.33 ���������� � �����Ҽ��Ѿ����ҡ����������ҡѺ 30.00 ������֧��ش��÷ӧҹ*/
		
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
