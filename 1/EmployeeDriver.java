import java.io.FileInputStream;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
public class EmployeeDriver {
	public static void main(String[] args) throws IOException {
		Object x = 0;
		FileInputStream inS = new FileInputStream("employeeData.txt");
		Scanner scnr = new Scanner(inS);
		List<Employee> employees = new ArrayList<Employee>();
		SalariedEmployee joe = new SalariedEmployee();
		employees.add(joe);
		joe.setWeeklySalary(2500);
		HourlyEmployee stephanie = new HourlyEmployee();
		employees.add(stephanie);
		stephanie.setWage(25);
		stephanie.setHoursWorked(32);
		HourlyEmployee mary = new HourlyEmployee();
		employees.add(mary);
		mary.setWage(19);
		mary.setHoursWorked(47);
		CommissionEmployee nicole = new CommissionEmployee();
		employees.add(nicole);
		nicole.setCommissionRate(15);
		nicole.setGrossSales(50000);
		SalariedEmployee renwa = new SalariedEmployee();
		employees.add(renwa);
		renwa.setWeeklySalary(1700);
		BaseEmployee mike = new BaseEmployee();
		employees.add(mike);
		mike.setBaseSalary(95000);
		CommissionEmployee mahnaz = new CommissionEmployee();
		employees.add(mahnaz);
		mahnaz.setCommissionRate(22);
		mahnaz.setGrossSales(40000);
		for (int i=0;i<employees.size();i++) {
			Employee current = employees.get(i);
			current.setFirstName(scnr.next());
			current.setLastName(scnr.next());
			current.setSocialSecurityNumber(scnr.next());
		}
		System.out.println(joe.getFirstName()+" "+joe.getLastName()+" ("
		+joe.getSocialSecurityNumber()+") earns "+joe.getWeeklySalary());
	}
}