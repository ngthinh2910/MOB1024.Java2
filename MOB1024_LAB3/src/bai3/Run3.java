package bai3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import bai2.Employee;

public class Run3 {
	public static void main(String[] args) {
		List<Employee> listEmp = new ArrayList<Employee>(
				Arrays.asList(new Employee("E01", "Ngọc Thịnh", 8000000)
						, new Employee("E02", "Phương Thảo", 90000000)
						, new Employee("E03", "Văn Thu", 15000000)
						, new Employee("E04", "Tân Tiến", 7000000)
						, new Employee("E05", "Anh Quân", 6000000)
						, new Employee("E06", "Văn Bảnh", 5500000)
						, new Employee("E07", "Khá Khẩm", 7600000)
						, new Employee("E08", "Tuấn Tú", 56600000)
				)
		);
		
		System.out.println("Tổng lương tất cả nhân viên: ");
		double tongLuong =  listEmp.stream().mapToDouble(emp -> emp.getSalary()).sum();
		System.out.printf("%.0f%n",tongLuong);
		
		System.out.println("\n=============================================\n");
		
		System.out.println("Lương trung bình.");
		Double luongTb = listEmp.stream()
								.mapToDouble(Employee::getSalary)
								.average()
								.orElse(0.0);
		
		System.out.printf("%.0f",luongTb);
		
		
		System.out.println("\n=============================================\n");
		
		
		System.out.println("Nhân viên có lương cao nhất (kết quả là 1 Employee)");
		Employee empMax = listEmp.stream()
								 .max(Comparator.comparingDouble(Employee::getSalary))
								 .orElse(null);
								 
		System.out.println(empMax);
		
	}
}
