package Com.Xworkz.Equals.App;

public class DryFruit {
private String name;
private int cost;
private String brand;
private int weight;
private double proteins;
private String color;
public DryFruit(String name, int cost, String brand, int weight, double proteins, String color) {
	super();
	this.name = name;
	this.cost = cost;
	this.brand = brand;
	this.weight = weight;
	this.proteins = proteins;
	this.color = color;
}
public String getName() {
	return name;
}
public int getCost() {
	return cost;
}
public String getBrand() {
	return brand;
}
public int getWeight() {
	return weight;
}
public double getProteins() {
	return proteins;
}
public String getColor() {
	return color;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return("name:"+this.name+"cost:"+this.cost+"brand:"+this.brand+"weight:"+this.weight+"proteins:"+this.proteins+"color:"+this.color);
	}
public boolean equals(Object obj) {
	if (obj != null) {
		System.out.println("argument is not null,do comparision");

		if (obj instanceof DryFruit) {
			DryFruit casted = (DryFruit) obj;
			System.out.println(this);
			System.out.println(obj);
			if (this.name == casted.name && this.cost == casted.cost&& this.brand == casted.brand && this.weight == casted.weight&& this.proteins == casted.proteins && this.color==casted.color) {
				return true;
			} else {
				return false;
			}
		} else {
			System.err.println("argument is null,stop comparision");
		}

	}
	return false;
}
}
