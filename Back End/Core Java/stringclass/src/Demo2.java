
public class Demo2
{
	public static void main(String[] args) {
		String s1=new String("john");
		System.out.println("s1 hashcode"+s1.hashCode());
		String s2=new String("mikel");
		String s3=new String("john");//this will refer to different object but hashcode value is same because object content are same
		s1=new String("sunil");
		System.out.println("s1 hashcode"+s1.hashCode());
		System.out.println("s2 hashcode"+s2.hashCode());
		System.out.println("s3 hashcode"+s3.hashCode());
	}

}
