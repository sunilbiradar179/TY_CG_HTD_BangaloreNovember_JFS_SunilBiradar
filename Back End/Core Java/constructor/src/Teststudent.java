
public class Teststudent 
{
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println("age="+s1.studAge);
		System.out.println("name="+s1.studName);
		Student s2=new Student(10,"sunil");
		System.out.println("age="+s2.studAge);
		System.out.println("name="+s2.studName);
		
	}

}
