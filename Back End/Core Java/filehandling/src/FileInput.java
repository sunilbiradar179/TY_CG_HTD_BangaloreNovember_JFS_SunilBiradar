import java.io.FileInputStream;
import java.io.IOException;

public class FileInput 
{
	public static void main(String[] args) {
		
		try {
			FileInputStream f1=new FileInputStream("sunil.txt");
			int a=f1.read();
			int j=0;
			while((j=f1.read())!=-1)
			{
				System.out.println((char)j);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
