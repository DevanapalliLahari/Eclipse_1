package Com.Xworkz.Association;

public class Franchise {
  String name;
  String owner;
  int cost;
  String place;
  
  Franchise()
  {
	  System.out.println("passing no argument parameters");
  }
  Franchise(String name,String owner,int cost,String place)
  {
	  System.out.println("passing String,String,int,String parameters");
	  this.name=name;
	  this.owner=owner;
	  this.cost=cost;
	  this.place=place;
  }
  void printInfo()
  {
	  System.out.println("name:"+name);
	  System.out.println("owner:"+owner);
	  System.out.println("cost:"+cost);
	  System.out.println("place:"+place);
  }
}
