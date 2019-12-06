
public class checkmuttable
{
	public static void main(String[] args) {
	StringBuffer s1=new StringBuffer("sunil");
	System.out.println(s1.hashCode());
	s1=s1.append("biradar");
	System.out.println(s1.hashCode());
	}

}
