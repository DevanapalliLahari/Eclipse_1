package Com.Xworkz.InheritenceAndEnum;

public class ShoeUtil {
	ShoeUtil(Shoe shoe)
 
{
	System.out.println("invoking Shoe of ShoeUtil");
	if(shoe!=null)
	{
		System.out.println("price:"+shoe.price);
		System.out.println("size:"+shoe.size);
		System.out.println("color:"+shoe.color);
		if(shoe instanceof PumaShoe)
		{
			PumaShoe pumaShoe=(PumaShoe)shoe;
			pumaShoe.printInfo();
		}
		if(shoe instanceof NikeShoe)
		{
			NikeShoe nikeShoe=(NikeShoe)shoe;
			nikeShoe.printInfo();
		}
	}
}
}
