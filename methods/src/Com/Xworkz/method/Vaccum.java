package Com.Xworkz.method;

public class Vaccum {
static String brand;
 int weight;
 
 static void cleaner()
 {
	 System.out.println("The cleaner is invokinng");
	 brand="Roomba";
	 brand ="Kirby";
	 System.out.println("brand:"+brand);
 }
 void room()
 {
	 System.out.println("The room is cleaned by vaccum ");
	 System.out.println("weight:"+weight);
	 Vaccum.cleaner();
 }
}
