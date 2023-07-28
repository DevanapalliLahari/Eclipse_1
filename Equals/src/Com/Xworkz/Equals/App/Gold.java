package Com.Xworkz.Equals.App;

public class Gold {
private String shop;
private String location;
private int carat;
private int amount;


public Gold()
{
	System.out.println("invoking no argument parameterized cons of gold");
}
public Gold(String shop,String location,int carat,int amount)
{
	this.shop=shop;
	this.location=location;
	this.carat=carat;
	this.amount=amount;
	System.out.println("invoking String String,int,int parameterized cons of gold ");
}
public String getShop() {
	return shop;
}
public String getLocation() {
	return location;
}
public int getCarat() {
	return carat;
}
public int getAmount() {
	return amount;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("shop:"+this.shop+"location:"+this.location+"carat:"+this.carat+"amount:"+this.amount);
}
public boolean equals(Object obj) {
	if (obj != null) {
		System.out.println("argument is not null,do comparision");

		if (obj instanceof Gold) {
			Gold casted = (Gold) obj;
			System.out.println(this);
			System.out.println(obj);
			if (this.shop == casted.shop && this.location == casted.location && this.carat == casted.carat && this.amount==casted.amount) {
				return true;
			} else {
				return false;
			}
		} else {
			System.err.println("argument is null,stop comparision");
		}

	}
	return false;
}
}
