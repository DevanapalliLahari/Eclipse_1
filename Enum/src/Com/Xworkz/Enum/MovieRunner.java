package Com.Xworkz.Enum;

public class MovieRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("the main method is running");
     Movie movie=new Movie(190);
     movie.gerne=MovieGerne.ACTION;
     movie.panindia=false;
     movie.display();
     
     Movie movie1=new Movie(200);
     movie1.gerne=MovieGerne.ADVENTURE;
     movie1.panindia=true;
     movie1.display();
	}

}
