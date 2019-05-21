import java.util.Scanner;

public class Methodell {

	public static void main(String[] args) {
		
		
/*2. จงเขียนโปรแกรมหาเลขยกกำลังของเลขฐานใด ๆ โดยที่กำลังสามารถเป็นได้ทั้งตัวเลขจำนวนเต็มบวก หรือลบ โดยที่ x0 = 1,	x4 = x*x*x*x, x(-p)  = (1/xp) */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a base number: ");
		double x = in.nextInt();
		System.out.println("Enter a power number: ");
		int y = in.nextInt();
	
		System.out.println( x +  " raised to the power "+ y + " = " + Power(x, y));
}
		
public static double Power(double x, int y) {
			 
	double c = 0;
			 for(int i = 0 ; i < y ; i++){
					if(i == 0) {
					c = x * 1;
					}else {
					c = c * x;
					}
				}
			 return c;
			}	
		}

