package Com.Xworkz.InheritenceAndEnum;

public class PumaShoe extends Shoe{
	String model;
	String origin;
	PumaShoe(String model,String origin,int price,ShoeSize size,ShoeColor color)
	{
		super(price,size,color);
		this.model=model;
		this.origin=origin;
		System.out.println("invoking String,String,int,int,String cons of pumaShoe");
	}
 void printInfo()
 {
	  System.out.println("print the info");	
	  System.out.println(this.price);
	  System.out.println(this.size);
	  System.out.println(this.color); 
	  System.out.println(this.model);
	  System.out.println(this.origin);
 }
}
