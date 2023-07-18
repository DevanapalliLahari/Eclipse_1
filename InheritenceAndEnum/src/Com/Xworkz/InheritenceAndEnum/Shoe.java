package Com.Xworkz.InheritenceAndEnum;

public class Shoe {
int price;
ShoeSize size;
ShoeColor color;
Shoe(int price,ShoeSize size,ShoeColor color)
{
	System.out.println("invoking int,int,String cons of Shoe");
	this.price=price;
	this.size=size;
	this.color=color;
	
}

}
