package Com.Xworkz.Metod.App;

public class HeadSet {
	private String name;
	private String color;
	private int warenty;
	private double price;
	private String type;

	@Override
	public String toString() {
		return( " name: " + this.name + " color: " + this.color + " warenty: " + this.warenty + " price: " + this.price + " type: " + this.type );
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
	
	public int getWarenty() {
		return warenty;
	}
	
	public void setWarenty(int  warenty) {
		this.warenty = warenty;
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
		this.type = type;
	}
}
