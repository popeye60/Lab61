
public class Dogs extends Mammals {
String barkFrequency;
Double yrs;
String name;
	
	public Dogs(String name,String barkFrequencyint ,double yrs,String color) {
		super(color);
		this.name = name;
		this.yrs = yrs;
		this.barkFrequency = barkFrequency;
	}
	
	public void display() {
		System.out.println(this.name +" "+ this.barkFrequency + " " +this.yrs +" yrs "+ this.getColor() + " " );
	}


}
