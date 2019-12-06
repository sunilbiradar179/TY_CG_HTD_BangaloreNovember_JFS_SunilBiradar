import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput 
{
	public static void main(String[] args) {
		
		
		try {
			FileOutputStream f1=new FileOutputStream("sunil.txt");
			String s1="sunil biradar";
			byte b1[]=s1.getBytes();
			f1.write(b1);
			System.out.println("success...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
