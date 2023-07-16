package Com.Xworkz.Association;

public class MovieRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("The mainn method is running");
      Movie movie=new Movie("Kanche");
      movie.heroine="Pragna jaiswal";
      movie.setBudget(10000);
      movie.printInfo();
      
      Movie movie1=new Movie("Tholi Prema");
      movie1.heroine="Rashi Kanna";
      movie1.setBudget(1289);  
      movie1.printInfo();
	}

}

