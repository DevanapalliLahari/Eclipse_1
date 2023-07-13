package Com.Xworkz.Enum;

public class ResortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Resort resort=new Resort("the jasmine");
    resort.ownerName="Prabash";
    resort.type=ResortType.STUDIO_ROOM;
    resort.display();
    
    Resort resort1=new Resort("The RoofTop");
    resort1.ownerName="ram";
    resort1.type=ResortType.SINGLE_ROOM;
    resort1.display();
	}

}
