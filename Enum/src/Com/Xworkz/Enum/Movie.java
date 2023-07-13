package Com.Xworkz.Enum;

public class Movie {
String name="mirchi";
MovieGerne gerne;
int budget;
boolean panindia;

Movie(int budget)
{
	System.out.println("The movie is running");
	this.budget=budget;
	System.out.println(budget);
}
void setPanindia(boolean panindia)
{
	this.panindia=panindia;
	System.out.println(panindia);
}
void display()
{
	System.out.println(name);
	System.out.println(gerne);
	System.out.println(budget);
	System.out.println(panindia);
}
}
