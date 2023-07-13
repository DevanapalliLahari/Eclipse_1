package Com.Xworkz.Hospital;

public class HospitalInfo {
	static String name;
	String branch;
	String cheifDoctor;
	
	void displayInstance()
	{
		System.out.println("invoking the instance");
		System.out.println("name:"+name);
		System.out.println("branch"+this.branch);
		System.out.println("cheifDoctor:"+this.cheifDoctor);
		displayStatic();
	}
	static void displayStatic()
	{
		System.out.println("invoking the static");
		System.out.println("name:"+name);
	}

}
