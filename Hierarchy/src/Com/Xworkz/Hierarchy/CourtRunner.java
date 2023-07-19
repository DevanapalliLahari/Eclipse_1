package Com.Xworkz.Hierarchy;

public class CourtRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Court court=new Court();	
     court.justice();
     
     SupremeCourt supremeCourt =new SupremeCourt();
     supremeCourt.justice();
     supremeCourt.importanceCase();
     Court court1=new SupremeCourt();
     court1.justice();
    
     HighCourt highCourt=new HighCourt();
     highCourt.justice();
     highCourt.importanceCase();
     highCourt.criminalCase();
     highCourt.forgeryCase();
     SupremeCourt supremecourt1=new HighCourt();
     supremecourt1.justice();
     supremecourt1.importanceCase();
     Court court2=new HighCourt();
     court2.justice();
     
     CivilCourt civilCourt=new CivilCourt();
     civilCourt.justice();
     civilCourt.importanceCase();
     civilCourt.criminalCase();
     civilCourt.forgeryCase();
     civilCourt.propertyCase();
     civilCourt.theftCase();
     HighCourt highCourt1=new CivilCourt();
     highCourt1.justice();
     highCourt1.importanceCase();
     highCourt1.criminalCase();
     highCourt1.forgeryCase();
     SupremeCourt supremecourt2=new CivilCourt();
     supremecourt2.justice();
     supremecourt2.importanceCase();
     Court court3=new HighCourt();
     court3.justice();
     
    FamilyCourt familyCourt=new FamilyCourt();
    familyCourt.justice();
    familyCourt.importanceCase();
    familyCourt.criminalCase();
    familyCourt.forgeryCase();
    familyCourt.propertyCase();
    familyCourt.theftCase();
    familyCourt.divorce();
    CivilCourt civilCourt1=new FamilyCourt();
    civilCourt1.justice();
    civilCourt1.importanceCase();
    civilCourt1.criminalCase();
    civilCourt1.forgeryCase();
    civilCourt1.propertyCase();
    civilCourt1.theftCase();
    HighCourt highCourt2=new FamilyCourt();
    highCourt2.justice();
    highCourt2.importanceCase();
    highCourt2.criminalCase();
    highCourt2.forgeryCase();
    SupremeCourt supremecourt3=new FamilyCourt();
    supremecourt3.justice();
    supremecourt3.importanceCase();
    Court court4=new FamilyCourt();
    court4.justice();
    
	}
}
