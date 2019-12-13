import java.util.List;
import java.util.Scanner;

import com.capgemini.phonesimulatorapplication.bean.ContactInfo;
import com.capgemini.phonesimulatorapplication.factory.ContactFactory;
import com.capgemini.phonesimulatorapplication.services.ContactServices;

public class SearchContact {

	private static final String String = null;

	public static void main(String[] args) {
		ContactServices services=ContactFactory.instanceOfContactServicesImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name to search details");
		String name=sc.nextLine();
		String list=services.getContact(name);
		if(list!=null)
		{
			System.out.println(list);
		}
		

	}

}
