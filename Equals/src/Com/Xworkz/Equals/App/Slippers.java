package Com.Xworkz.Equals.App;

import java.io.ObjectInputStream.GetField;

public class Slippers {
private String brand;
private String type;
private double price;
private int noOfPeaces;
private int size;
private boolean exchange;
private String shop;
public Slippers(String brand, String type, double price, int noOfPeaces, int size, boolean exchange, String shop) {
	super();
	this.brand = brand;
	this.type = type;
	this.price = price;
	this.noOfPeaces = noOfPeaces;
	this.size = size;
	this.exchange = exchange;
	this.shop = shop;
}

public String getBrand() {
	return brand;
}
public String getType() {
	return type;
}
public double getPrice() {
	return price;
}
public int getNoOfPeaces() {
	return noOfPeaces;
}
public int getSize() {
	return size;
}
public boolean getExchange() {
    return exchange;
}
public String getShop() {
	return shop;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("brand:"+this.brand+"type:"+this.type+"price:"+this.price+"noOfPeaces:"+this.noOfPeaces+"size:"+this.size+"exchange:"+this.exchange+"shop:"+this.shop);
	}
public boolean equals(Object obj) {
	if (obj != null) {
		System.out.println("argument is not null,do comparision");

		if (obj instanceof Slippers) {
			Slippers casted = (Slippers) obj;
			System.out.println(this);
			System.out.println(obj);
			if (this.brand == casted.brand && this.type == casted.type && this.price==casted.price && this.noOfPeaces==casted.noOfPeaces && this.size==casted.size && this.exchange==casted.exchange && this.shop==casted.shop) {
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
