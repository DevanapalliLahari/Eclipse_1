package Com.Xworkz.method;

public class SimCard {
 static int price;
 String type;
 
 static void call()
 {
	 price=650;
	 price=450;
	 System.out.println("price:"+price);
	 
 }
 void message()
 {
	 System.out.println("type:"+type);
	 System.out.println("price:"+price);
	 SimCard.call();
 }
}
