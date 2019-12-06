import java.util.ArrayList;

public class ArrayListDoubleGeneric
{
	public static void main(String[] args) {
		ArrayList<Double> a1=new ArrayList<Double>();
		a1.add(12.12);
		a1.add(23.45);
		System.out.println(a1);
		a1.remove(12.12);
		System.out.println(a1);
	}

}
