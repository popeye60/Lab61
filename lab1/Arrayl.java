import java.util.Scanner;

public class Arrayl {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
/*1.จงเขียนการนิยามอาร์เรย์ที่เหมาะสมสำหรับข้อต่างๆ ต่อไปนี้
	•	อาร์เรย์ c ซึ่งเป็นอาร์เรย์ 1  มิติของจำนวนเต็มที่มีสมาชิก 12 ตัว และมีค่าเริ่มต้นต่อไปนี้  1  4  7  10 … 34
	•	อาร์เรย์ point ซึ่งเป็นอาร์เรย์ 1 มิติของอักขระ
	•	อาร์เรย์ n เป็นอาร์เรย์ 2 มิติขนาด 3 x 4
	•	อาร์เรย์ const ซึ่งเป็นอาร์เรย์ 1 มิติของทศนิยม ซึ่งมีสมาชิก 6 ตัว
*/
		
	/*	
		int [] c = { 1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34};
		char[] point = new char[5];
		int [][] n = new int[3][4];
		double [] cons = new double[6];
		
	 */
	
/*2.จงประกาศตัวแปร Array เพื่อเก็บข้อมูล ดังนี้
	•	ตัวแปร Array ที่เก็บข้อมูลค่าใช้จ่ายประจำปี ซึ่งแจกแจงเป็นเดือนที่ 1 ถึงเดือนที่ 12
	•	ตัวแปร Array ที่เก็บข้อมูลรายรับและรายจ่ายประจำปี ซึ่งแจกแจงเป็นเดือนที่ 1 ถึงเดือนที่ 12
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

