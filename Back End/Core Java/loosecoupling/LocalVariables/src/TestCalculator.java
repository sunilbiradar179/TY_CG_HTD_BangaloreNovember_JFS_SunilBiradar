
public class TestCalculator 
{
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		int r1=c1.add(10);
		System.out.println("result1="+r1);
		int r2=c1.add(10, 20);
		System.out.println("result2="+r2);
		double r3=c1.add(10.11);
		System.out.println("result3="+r3);
		Calculator.mul(10);
		Calculator.mul(10, 20);
		Calculator.mul(10.11);
	}

}
