package Com.Xworkz.Metod.App;

public class Mixture {
	private String name;
	private String color;
	private String manufactureDate;
	private double price;
	private int weight;

	@Override
	public String toString() {
		return( " name: " + this.name + " color: " + this.color + " manufacture date: " + this.manufactureDate + " price: " + this.price + " weight: " + this.weight );
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
	
	public String getManufactureDate() {
		return manufactureDate;
	}
	
	public void setManufactureDate(String ManufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
