package Com.Xworkz.Association;

public class Owner {
String name;
String gender;
long bankBalance;
double weight;


Owner()
{
	System.out.println("no parameterised constructor");
}
Owner(String name,String gender,long bankBalance,double weight)
{
	System.out.println("String,String,long,double parameterised constructor");
	this.name=name;
	this.gender=gender;
	this.bankBalance=bankBalance;
	this.weight=weight;
}
void printInfo()
{
	System.out.println("name:"+name);
	System.out.println("gender:"+gender);
	System.out.println("bankBalance:"+bankBalance);
	System.out.println("weight:"+weight);
}
}
