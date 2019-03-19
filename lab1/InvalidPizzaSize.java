import java.util.Scanner;

public class InvalidPizzaSize {

	public static void main(String[] args) {

		
/*2.จงเขียนโปรแกรมเพื่อให้ลูกค้าเลือกขนาดของ pizza  – S,M,L or X – จากนั้นให้แสดงราคาของขนาดที่ลูกค้าเลือก  และรับจำนวนชิ้น แสดงราคารวม หากลูกค้าเลือกขนาดผิด ให้แสดง  “Invalid pizza size”. */

		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Pizza size [S, M, L, X]: ");
		char n = in.next().charAt(0);
		int a = 0 ;
		switch(n) {
			
		case 'S' : System.out.println("Pizza size 'S' price 100$");
				   System.out.println("How many pieces of pazza do you want?");
					a = in.nextInt();
				   System.out.println("Total = " + (a * 100) + " $");
				   break;
		case 'M' : System.out.println("Pizza size 'M' price 150$");
		   		   System.out.println("How many pieces of pazza do you want?");
		   		   a = in.nextInt();
		           System.out.println("Total = " + (a * 150) + " $"); 
		           break;
		case 'L' : System.out.println("Pizza size 'L' price 200$");
		           System.out.println("How many pieces of pazza do you want?");
		           a = in.nextInt();
		           System.out.println("Total = " + (a * 200) + " $"); 
		           break;
		case 'X' : System.out.println("Pizza size 'S' price 250$");
		   		   System.out.println("How many pieces of pazza do you want?");
		   		   a = in.nextInt();
		   		   System.out.println("Total = " + (a * 250) + " $");  
		   		   break;
		
			default:
					System.out.println("...Invalid pizza size...");
					break;
		}
	}

}
