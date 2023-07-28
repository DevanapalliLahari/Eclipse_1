package Com.Xworkz.Equals.App;

public class Grocery {

	private String name;
	private int cost;

	public Grocery() {
		System.out.println("invoking no argument parameterized cons of grocery");
	}

	public Grocery(String name, int cost) {
		this.name = name;
		this.cost = cost;
		System.out.println("invoking String,int parameterized cons of grocery");
	}

	@Override
	public String toString() {
		return ("Name:" + this.name + "Cost:" + this.cost);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost() {
		this.cost = cost;
	}

	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("argument is not null,do comparision");

			if (obj instanceof Grocery) {
				Grocery casted = (Grocery) obj;
				System.out.println(this);
				System.out.println(obj);
				if (this.name == casted.name && this.cost == casted.cost) {
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
