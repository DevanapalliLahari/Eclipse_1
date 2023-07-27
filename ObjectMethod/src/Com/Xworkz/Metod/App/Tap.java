package Com.Xworkz.Metod.App;

public class Tap {
	private String name;
	private String color;
	private String use;
	private double price;
	private String type;

	@Override
	public String toString() {
		return( " name: " + this.name + " color: " + this.color + " use: " + this.use + " price: " + this.price + " type: " + this.type );
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getUse() {
		return use;
	}
	
	public void setUse(String use) {
		this.use = use;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type= type;
	}
}
