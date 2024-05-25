import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	String gender;
	String department;
	int yearofjoining;
	double salary;
	Employee(int id,String name, String gender,String department,int yearofjoining,double salary){
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.department=department;
		this.yearofjoining=yearofjoining;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearofjoining() {
		return yearofjoining;
	}
	public void setYearofjoining(int yearofjoining) {
		this.yearofjoining = yearofjoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", department=" + department
				+ ", yearofjoining=" + yearofjoining + ", salary=" + salary + "]";
	}
	
}



public class Java8Features {
	static List<Employee> employeelist = new ArrayList<Employee>();

	public static void main(String[] args) {
		employeelist.add(new Employee(1,"yash","male","delivery",2019,10));
		employeelist.add(new Employee(2,"mohit","male","delivery",2018,20));
		employeelist.add(new Employee(3,"juhi","female","delivery",2017,30));
		employeelist.add(new Employee(4,"karnika","female","hr",2018,5));
		
		//male female employee in org
		Map<String, Long> noofmalefemale = employeelist.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		noofmalefemale.entrySet().forEach(System.out::println);
	
		
		//Q print all dept in 
		//forEach(System.out::println);
//		System.out.println(employeelist.stream().map(i->i.getDepartment()).distinct().count());
		
	}

}
