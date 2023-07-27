package Com.Xworkz.Method.Runner;

import Com.Xworkz.Metod.App.NewsPaper;

public class NewsPaperRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("running main");
    NewsPaper newsPaper = new NewsPaper();
    newsPaper.getName();
    newsPaper.getNoOfPages();
    newsPaper.getPrice();
    newsPaper.getTypes();
    newsPaper.getCategory();
	System.out.println(newsPaper.toString());
	NewsPaper newsPaper1 = new NewsPaper();
	newsPaper1.setName ("prajavani");
	newsPaper1.setNoOfPages(6);
	newsPaper1.setPrice (5);
	newsPaper1.setTypes ("kannada");
	newsPaper1.setCategory ("rural news");
	
	System.out.println(newsPaper1.toString());

	}

}
