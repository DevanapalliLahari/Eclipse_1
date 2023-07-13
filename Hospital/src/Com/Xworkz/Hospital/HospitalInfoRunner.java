package Com.Xworkz.Hospital;

public class HospitalInfoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HospitalInfo hospital=new HospitalInfo();
      HospitalInfo.name="usmaniya";
      hospital.branch="Hyderabad";
      hospital.cheifDoctor="prasad";
      hospital.displayInstance();
       
      HospitalInfo hospital1=new HospitalInfo();
      HospitalInfo.name="st john";
      hospital1.branch="BTM";
      hospital1.cheifDoctor="Chitra";
      hospital.displayInstance();
      
      HospitalInfo hospital2=new HospitalInfo();
      HospitalInfo.name="jaideva";
      hospital2.branch="BTM";
      hospital2.cheifDoctor="Samaram";
      hospital.displayInstance();
	}

}
