package CheckedException;

public class ExceptionB 
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		Student s1=new Student();
		try {
			Object s2=s1.clone();//if we dont implement clonable interface in student class we will get exception
			Class c1=Class.forName("Student");//it is searching class in the package,if wee give(packagename) CheckedException.student it will not give exception
		} catch (CloneNotSupportedException e) 
		{
			System.out.println("clone not supported");
			
		}
		catch(ClassNotFoundException a)
		{
			System.out.println("class not found");
		}
		System.out.println("main ended");
	}

}
