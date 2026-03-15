package Application;

import java.util.ArrayList;

import entity.Employee;
import entity.FullTimeEmployee;
import entity.PartTimeEmployee;

public class Run {
	public static void main(String[] args) {
		ArrayList<Employee> listEmp = new ArrayList<Employee>();
		Employee emp01 = new Employee("EMP01", "Văn A", 1000000);
		FullTimeEmployee emp02 = new FullTimeEmployee("EMP02", "Văn B", 9000000, 500000, 20000);
		FullTimeEmployee emp03 = new FullTimeEmployee("EMP03", "Văn C", 5000000, 4000000, 500000);
		PartTimeEmployee emp04 = new PartTimeEmployee("EMP04", "Văn D", 3000000, 13, 3);
		PartTimeEmployee emp05 = new PartTimeEmployee("EMP05", "Văn E", 2000000, 8, 2);
		listEmp.add(emp01);
		listEmp.add(emp02);
		listEmp.add(emp03);
		listEmp.add(emp04);
		listEmp.add(emp05);
		System.out.println("DANH SÁCH NHÂN VIÊN");
		for (Employee emp : listEmp) {
			System.out.println(emp.toString());
		}
		listEmp.sort((e1,e2) -> Double.compare(e2.inCome(), e1.inCome()));
		Employee highestEmp = listEmp.get(0);
		System.out.println("Nhân viên có lương cao nhất là: " + highestEmp);
	}
}
