import java.util.Scanner;

public class PositiveSum {

	public static void main(String[] args) {
		
		/*2.����¹�����ǹ�ٻ �����Ѻ��Ҩӹǹ���� � �����Ҽ���� �����Ҽ����л�͹��Ң����Ź���ҵԴź ���Ǿ�������������ش�����͡�� (��������ҵԴź)*/
		
		Scanner in = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter Number [If the user enters a value, import data a negative exit,The program quits.] : ");
		int n = in.nextInt();
			   
			do {
				if (n >= 0) {
	            	sum = sum + n;
	            	n = in.nextInt();
	            
				} else {
					System.out.println(" ");
				
	            }
			}while (n >= 0);
			
				System.out.println("total = " + sum);
		
		}
			
	}


