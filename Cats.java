
public class Cats extends Mammals {
private String meowFrequency;
Double yrs;
String name;
	
	public Cats(String name,String meowFrequency ,double yrs,String color) {
		super(color);
		this.name = name;
		this.yrs = yrs;
		this.meowFrequency = meowFrequency;
	}
	public void display() {
		System.out.println(this.name +" "+ this.meowFrequency + " " +this.yrs +" yrs "+ this.getColor() + " " );
	}
}

