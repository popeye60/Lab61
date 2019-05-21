import java.util.Scanner;

public class Methodel {

	public static void main(String[] args) {
		/*จงเขียนโปรแกรมรับตัวอักษรเข้าทีละบรรทัด แล้วแสดงผลเฉพาะบรรทัดที่มีตัวอักษรยาวที่สุด กำหนด Method public static int TextLong(String text);*/
		
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter no of lines : ");
		int n  = input.nextInt();
		int c = 0;
		int max = 0;
		String text1 = " " , maxtext = " ";
		
		for (int i = 0; i < n; i++) {
			
			 text1 = input.next();
			 int sc = TextLong(text1);
			 
			 if(sc > max) {
				 max = sc;
				 maxtext = text1;
			 }
			
		}	
		System.out.println("The longest string is " + maxtext);
	}
	
	public static int TextLong(String text){
			 int c = 0;
			 c = text.length();

			 return c ;
         
	}
 
}


