package Com.Xworkz.Enum;

public class TempleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("running main");
    Temple temple=new Temple("Krishna Temple");
    temple.place=TempleLocation.BTM;	
    temple.noOfPeople=100;
    temple.display();
    Temple temple1=new Temple("Baba Temple");
    temple1.place=TempleLocation.HONSANDRA;	
    temple1.noOfPeople=180;
    temple1.display();
	}
	

}
