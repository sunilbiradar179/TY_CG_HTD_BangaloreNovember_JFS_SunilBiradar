
public class Student 
{
	
	int studId;
	String studName;
	public Student(int studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}
	public String toString()//here overriding the toString method from object class
	{
		return "student id is:"+studId+"student name is:"+studName;
	}

}
