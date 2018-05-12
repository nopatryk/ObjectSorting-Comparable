package object;

public class Employer implements Comparable<Employer> {

	private double salary;
	
	public Employer(double salary) {
		this.setSalary(salary);
	}
	
	//setters & getters
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	
	@Override
	public int compareTo(Employer o) {
		
		if(this.salary < o.getSalary())
			return -1;
		if(this.salary == o.getSalary())
			return 0;

		return 1;
	}
}
