package Com.Xworkz.InheritenceAndEnum;

public class NikeShoe extends Shoe {
String ceo;
String brandAmbassador;
NikeShoe(String ceo,String brandAmbassador,int price,ShoeSize size,ShoeColor color)
{
	super(price,size,color);
	this.ceo=ceo;
	this.brandAmbassador=brandAmbassador;
	System.out.println("invoking String,String,int,int,String cons of NikeShoe");
}
void printInfo()
{
 System.out.println("print the info");	
 System.out.println(this.price);
 System.out.println(this.size);
 System.out.println(this.color);
 System.out.println(this.ceo);
 System.out.println(this.brandAmbassador);
}
}
