package Com.Xworkz.Metod.App;

public class Calculator {
	private String name;
	private double price;
	private int noOfKeys;
	private double version; 
	private String type;

	@Override
	public String toString() {
		return( " name: " + this.name + " price: " + this.price + " no Of keys: " + this.noOfKeys + "version: " + this.version + " type: " + this.type );
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfKeys() {
		return noOfKeys;
	}

	public void setNoOfKeys(int noOfKeys) {
		this.noOfKeys = noOfKeys;
	}

	public double getVersion() {
		return  version;
	}
	public void setVersion() {
		this.version=version;
	}

	public String getType() {
		return type;
	}

	public void setType(String Type) {
		this.type = type;
}

		
	}

