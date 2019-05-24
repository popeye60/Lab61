import java.util.Scanner;

public class CatAndDogFarm {

	public static void main(String[] args) {

				Scanner input = new Scanner(System.in);
				System.out.println("Cat And Dog Farn");
				System.out.println("Number of Dog : 2");
				Mammals[] d = new Dogs[2];
				Mammals[] c = new Cats[1];
				
				d[0] = new Dogs("Tribute Boo","Pomeranian",1,"White");
				d[1] = new Dogs("Theo Shih","Tzu",1.5,"Dark Brown");
				
				c[0] = new Cats("Willie","Siberian",0.5,"Brown");
				
				for(int i = 0; i < d.length; i++) {
					((Dogs)d[i]).display();
				}
				System.out.println("Number of Dog : 1");
					((Cats)c[0]).display();
				}
			}
