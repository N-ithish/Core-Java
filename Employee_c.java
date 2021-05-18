
public class Employee_c implements Comparable<Employee_c>{

	String name ;
	int salary;
	int exp;
	public Employee_c(String name, int salary, int exp) {
		super();
		this.name = name;
		this.salary = salary;
		this.exp = exp;
	}
	@Override
	public int compareTo(Employee_c o) {
		if(this.exp < o.exp) {
			return -1;
		}else if(this.exp > o.exp) {
			return 1;
		}
		return 0;
	}
	@Override
	public String toString() {
		return "Employee_c [name=" + name + ", salary=" + salary + ", exp=" + exp + "]";
	}
	
}
