package Com.Xworkz.Metod.App;

public class Satellite {
	private String type;
	private String name;
	private String location;
	private String uses;
	private int weight;

	@Override
	public String toString() {
		return( " type: " + this.type + " name: " + this.name + " location:" + this.location + " uses: " + this.uses + " weight: " + this.weight );	
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getUses() {
		return uses;
	}

	public void setUses(String uses) {
		this.uses = uses;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
