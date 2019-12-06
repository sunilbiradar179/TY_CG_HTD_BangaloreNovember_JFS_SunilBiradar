import java.util.TreeSet;

public class TreeSet1
{
	public static void main(String[] args)
	{
		TreeSet t1=new TreeSet();
		t1.add(10);
		t1.add(06);
		t1.add(74);
		t1.add(22);
		t1.add(10);
		//t1.add(null);//null is not allowed
		//t1.add("sunil");//you can not store hetrogeneous data
		t1.remove(10);
		
		for (Object o1 : t1)
		{
			System.out.println(o1);
			
		}
	}

}
