package Com.Xworkz.Enum;

public class Resort {
 String name;
 String ownerName;
 ResortType type;
 boolean breakFast=true;
 
 Resort(String name)
 {
	 System.out.println("The resort name is innvoking");
	 this.name=name;
	 System.out.println("name:"+name);
 }

 void setOwnerName(String ownerName)
 {
	 System.out.println("The owner name is invoking");
	 this.ownerName= ownerName;
 }
 void display()
 {
	 System.out.println("invoking the display");
	 System.out.println("name:"+name);
	 System.out.println("ownerName:"+ownerName);
	 System.out.println("type:"+type);
	 System.out.println("breaakFast:"+breakFast);
 }
}
