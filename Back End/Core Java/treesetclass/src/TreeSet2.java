import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 
{
	public static void main(String[] args) {
		TreeSet<Student> t1=new TreeSet<Student>();
		t1.add(new Student(12,"sunil"));
		t1.add(new Student(34,"sathya"));
		t1.add(new Student(10,"sachin"));
		t1.add(new Student(12,"sunil"));
		
		Iterator<Student> itr=t1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
