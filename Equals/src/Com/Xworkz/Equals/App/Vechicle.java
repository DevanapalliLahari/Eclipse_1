package Com.Xworkz.Equals.App;

public class Vechicle {
	private String name;
	private String fuelType;
	private int noOfShowRooms;
	private int price;
	private int capacity;

	public Vechicle(String name, String fuelType, int noOfShowRooms, int price, int capacity) {
		super();
		this.name = name;
		this.fuelType = fuelType;
		this.noOfShowRooms = noOfShowRooms;
		this.price = price;
		this.capacity = capacity;
		System.out.println("invoking String,String,int,int,int parameterized cons of Vechicle");
	}

	public String getName() {
		return name;
	}

	public String getFuelType() {
		return fuelType;
	}

	public int getNoOfShowRooms() {
		return noOfShowRooms;
	}

	public int getPrice() {
		return price;
	}

	public int getCapacity() {
		return capacity;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("name:" + this.name + "fuelType:" + this.fuelType + "noOfShowRooms:" + this.noOfShowRooms + "price:"
				+ this.price + "capacity:" + this.capacity);
	}

	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("argument is not null,do comparision");

			if (obj instanceof Vechicle) {
				Vechicle casted = (Vechicle) obj;
				System.out.println(this);
				System.out.println(obj);
				if (this.name == casted.name && this.fuelType == casted.fuelType
						&& this.noOfShowRooms == casted.noOfShowRooms && this.capacity == casted.capacity
						&& this.price == casted.price) {
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
