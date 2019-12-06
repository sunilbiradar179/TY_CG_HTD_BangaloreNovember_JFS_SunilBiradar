
public class Employee implements Comparable<Employee>
{
	int age;
	int salary;
	String name;
	public Employee(int age, int salary, String name) {
		super();
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	/*@Override//this is for comparing with salary
	public int compareTo(Employee o) {
		if(this.salary>o.salary)
			return 1;
		else if(this.salary<o.salary)
			return -1;
		else
			return 0;
		
	}*/
	
	/*@Override//this is for comparing with  name
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}*/
		
	
	
	/*@Override//this is for coapring with age
	public int compareTo(Employee o) {
		if(this.age>o.age)
			return 1;
		else if(this.age<o.age)
			return -1;
		else
			return 0;
	}*/
	
	
	
	@Override
	public String toString() {
		return "Employee [age=" + age + ", salary=" + salary + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	

}
