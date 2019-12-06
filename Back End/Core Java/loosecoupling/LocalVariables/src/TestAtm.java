
public class TestAtm 
{
	public static void main(String[] args) {
		 Sbi s1=new Sbi();
		 Hdfc h1=new Hdfc();
		 Axis a1=new Axis();
		 Atm a2=new Atm();
		 Bank b1=new Bank();
		 
		 b1.enterAtm(s1);
		 b1.enterAtm(a1);
		 b1.enterAtm(a2);
		 b1.enterAtm(h1);
	}

}
