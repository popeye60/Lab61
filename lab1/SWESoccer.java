import java.util.Scanner;

public class SWESoccer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SoccerPlayer[] f = new Forward[2];
		SoccerPlayer[] m = new Midfield[4];
		SoccerPlayer[] d = new Defense[4];
		SoccerPlayer[] g = new Goalkeeper[1];
		SoccerPlayer[] r = new Reserve[2];
		
		f[0] = new Forward("SSS",26);
		f[1] = new Forward("AAA",27);
		
		m[0] = new Midfield("BBB",28);
		m[1] = new Midfield("CCC",10);
		m[2] = new Midfield("EEE",12);
		m[3] = new Midfield("TTT",9);
		
		d[0] = new Defense("FFF",18);
		d[1] = new Defense("JJJ",10);
		d[2] = new Defense("KKK",11);
		d[3] = new Defense("RRR",22);
		
		g[0] = new Goalkeeper("NNN",1);
		
		r[0] = new Reserve("YYY",7);
		r[0] = new Reserve("XXX",25);
		
		System.out.println("SWE Soccer Team");
		System.out.println("-----------Forward-----------");
		for(int i = 0; i < f.length; i++) {
			((Forward)f[i]).display();
		}
		
		System.out.println("-----------Midfield-----------");
		for(int i = 0; i < m.length; i++) {
			((Midfield)m[i]).display();
		}
		
		System.out.println("-----------Defense-----------");
		for(int i = 0; i < d.length; i++) {
			((Defense)d[i]).display();
		}
		
		System.out.println("-----------Goalkeeper-----------");
			((Goalkeeper)g[0]).display();
		
		
		System.out.println("-----------Reserve-----------");
		for(int i = 0; i < r.length; i++) {
			((Reserve)r[i]).display();
		}
		

	}
}