import java.util.Scanner;

public class Arrayl {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
/*1.����¹��ù�������������������������Ѻ��͵�ҧ� ���仹��
	�	�������� c ������������� 1  �ԵԢͧ�ӹǹ����������Ҫԡ 12 ��� ����դ��������鹵��仹��  1  4  7  10 � 34
	�	�������� point ������������� 1 �ԵԢͧ�ѡ���
	�	�������� n ���������� 2 �ԵԢ�Ҵ 3 x 4
	�	�������� const ������������� 1 �ԵԢͧ�ȹ��� �������Ҫԡ 6 ���
*/
		
	/*	
		int [] c = { 1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34};
		char[] point = new char[5];
		int [][] n = new int[3][4];
		double [] cons = new double[6];
		
	 */
	
/*2.����С�ȵ���� Array �����红����� �ѧ���
	�	����� Array ����红����Ť������»�Шӻ� ���ᨡᨧ����͹��� 1 �֧��͹��� 12
	�	����� Array ����红���������Ѻ�����¨��»�Шӻ� ���ᨡᨧ����͹��� 1 �֧��͹��� 12
*/
	
	int[] month = {1,2,3,4,5,6,7,8,9,10,11,12};
	int i , l ,j = 0;
	final int ROW = 12, COLUMN = 2;
	int [][] r = new int[ROW][COLUMN];
        for ( l = 0; l < ROW; l++) {
        	
        	System.out.println ("Enter Revenue and Expenditure in Month " + month[l] +" : " );
            
        	for ( j = 0; j < COLUMN; j++) {
            	
        		r[l][j] = input.nextInt();
        		
            }
            System.out.println();
        }
        System.out.println("Month  Revenue  Expenditure");
        	for ( l = 0; l < ROW; l++) {
                for ( j = 0; j < COLUMN; j++) {
                	
                	System.out.print ( month[l] +"      "+r[l][j] );
                	j++;
                	System.out.println ("       "+r[l][j] );
            	
            		
                }
                System.out.println();
            }
		}
	}

