package Com.Xworkz.method;

public class ContactLens {
static String type;
int price;

static void lens()
{
	type="fibre";
	type="glass";
	System.out.println("type:"+type);
	
}
void glasses()
{
	System.out.println("price:"+price);
	System.out.println("type:"+type);
	ContactLens.lens();
}
}
