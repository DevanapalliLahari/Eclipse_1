package Com.Xworkz.Program.App;

public class Indian extends Ocean {
	String beaches;

	public Indian(String name, int area, String beaches) {
		super(name, area);
		this.beaches = beaches;
		System.out.println("invoking String,int,String parameterized cons of Indian");
	}

	@Override
	public void display() {
		System.out.println("display");
		super.display();
		System.out.println("beaches:" + this.beaches);
	}
}
