package Com.Xworkz.Enum;

public class TheaterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("The main method is running");
     Theater theater=new Theater("Imax");
     theater.type= TheaterType.FULL_ROCKER;
     theater.capacity=180;
     theater.display();
     Theater theater1=new Theater("Ambition");
     theater1.type=TheaterType.BALCONY;
     theater1.capacity=200;
     theater1.display();
	}

}
