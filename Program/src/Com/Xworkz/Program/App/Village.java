package Com.Xworkz.Program.App;

public final class Village {
	final String name = "Kondapalli";
	final String president;
	final int noOfHouses;

	public Village(String president, int noOfHouses) {
		this.president = president;
		this.noOfHouses = noOfHouses;
		System.out.println("invoking String,int paarameterized cons of Village");
	}

	public void Display() {
		System.out.println("display Village");
		System.out.println("name:" + this.name);
		System.out.println("president:" + this.president);
		System.out.println("noOfHouses:" + this.noOfHouses);
	}
}
