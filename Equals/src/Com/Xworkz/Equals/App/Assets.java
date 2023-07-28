package Com.Xworkz.Equals.App;

public class Assets {
	private String ownerName;
	private String category;
	private int cost;
	private Object Assets;

	public Assets() {
		System.out.println("invoking  no argument parameterised cons of Asserts");
	}

	public Assets(String ownerName, String category, int cost) {
		this.ownerName = ownerName;
		this.category = category;
		this.cost = cost;
		System.out.println("invoking no argument parameterized cons of asseert");
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getCategory() {
		return category;
	}

	public int getCost() {
		return cost;
	}

	@Override
	public String toString() {
		return ("ownerName:" + this.ownerName + "category:" + category + "cost:" + cost);
	}

	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("argument is not null,do comparision");

			if (obj instanceof Assets) {
				Assets casted = (Assets) obj;
				System.out.println(this);
				System.out.println(obj);
				if (this.ownerName == casted.ownerName && this.category == casted.category
						&& this.cost == casted.cost) {
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
