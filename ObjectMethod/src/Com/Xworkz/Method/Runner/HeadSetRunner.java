package Com.Xworkz.Method.Runner;

import Com.Xworkz.Metod.App.HeadSet;

public class HeadSetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("runninng main");
    HeadSet headSet = new HeadSet();
    headSet.getName();
    headSet.getColor();
    headSet.getWarenty();
    headSet.getPrice();
    headSet.getType();
	System.out.println(headSet.toString());
	  HeadSet headSet1 = new HeadSet();
	headSet1.setName ("beast");
	headSet1.setColor ("black");
	headSet1.setWarenty (5);
	headSet1.setPrice (2000);
	headSet1.setType ("wire less");
	
	System.out.println(headSet1.toString());
	}

}
