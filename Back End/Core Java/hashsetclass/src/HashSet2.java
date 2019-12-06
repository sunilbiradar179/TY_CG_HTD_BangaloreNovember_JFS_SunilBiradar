import java.util.HashSet;

public class HashSet2 
{
	public static void main(String[] args) {
		HashSet<Student> hs1=new HashSet<Student>();
		
		hs1.add(new Student(22,"sunil"));//here we are storing student object with values
		hs1.add(new Student(23,"sathya"));
		hs1.add(new Student(22,"sunil"));//we must override equals() in student class otherwise it will show duplicate value
		hs1.add(new Student(23,"sathya"));
		hs1.add(new Student(24,"sathya"));
		
		for (Student s1 : hs1)
		{
			System.out.println("age is"+s1.studAge+"and name is"+s1.studName);
			
		}
	}

}
