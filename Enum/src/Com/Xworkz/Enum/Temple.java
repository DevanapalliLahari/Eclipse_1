package Com.Xworkz.Enum;

public class Temple {
String godName;
TempleLocation place;
String founder="sam";
int noOfPeople;

Temple(String godName)
{
	System.out.println("The temple is innvoking");
	this.godName=godName;
	System.out.println(godName);
}
void setFounder(String founder)
{
	this.founder=founder;
	System.out.println(founder);
	
}
void display()
{
	System.out.println(godName);
	System.out.println(founder);
	System.out.println(place);
	System.out.println(noOfPeople);
}
}

