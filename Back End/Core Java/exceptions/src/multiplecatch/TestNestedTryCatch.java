package multiplecatch;

public class TestNestedTryCatch 
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		NestedTryCatch n1=new NestedTryCatch();
		n1.write(2, "sunil");
		n1.write(2, null);
		System.out.println("main ended");
	}

}
