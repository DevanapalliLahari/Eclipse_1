package Com.Xworkz.InheritenceAndEnum;

public class ShoeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("running main");
      PumaShoe pumaShoe=new PumaShoe("puma Fierce Core","india",2000,ShoeSize.TEN,ShoeColor.BLACK);
      pumaShoe.printInfo();
      
      NikeShoe nikeShoe=new NikeShoe("Mark","Krunal Rajput",1000,ShoeSize.EIGHT,ShoeColor.WHITE);
      nikeShoe.printInfo();
    		 
	}

}
