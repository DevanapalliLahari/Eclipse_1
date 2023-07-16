package Com.Xworkz.Association;

public class IplTeam {
String teamName;
int noOfPlayers;
int noOfTeams;
String telecasting;


Franchise franchise=new Franchise("Reliance","john",150,"Delhi");
IplTeam()
{
	System.out.println("passing no argument Parameter");
}
IplTeam(String teamName,int noOfPlayers,int noOfTeams,String telecasting)
{
	System.out.println("passing String,int,int,String parameters");
	this.teamName=teamName;
	this.noOfPlayers=noOfPlayers;
	this.noOfTeams=noOfTeams;
	this.telecasting=telecasting;
}
void printInfo()
{
	System.out.println("printing info");
	System.out.println("teamName:"+teamName);
	System.out.println("noOfPlayers:"+noOfPlayers);
	System.out.println("noOfTeams:"+noOfTeams);
	System.out.println("telecasting:"+telecasting);
	this.franchise.printInfo();
}

}
