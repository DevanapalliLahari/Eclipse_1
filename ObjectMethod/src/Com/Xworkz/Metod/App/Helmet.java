package Com.Xworkz.Metod.App;

public class Helmet {
	private String name;
	private String color;
	private String type;
	private double price;
	private String shape;

	@Override
	public String toString() {
		return( " name: " + this.name + " color: " + this.color + " type: " + this.type + " price: " + this.price + " shape: " + this.shape );
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
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getShape() {
		return shape;
	}
	
	public void setShape(String shape) {
	this.shape=shape;
	}
}