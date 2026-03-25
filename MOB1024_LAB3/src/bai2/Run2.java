package bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Run2 {
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
		
		
		System.out.println("In danh sách nhân viên có lương >= 15tr");
		listEmp.stream()
			.filter(emp -> emp.getSalary() >= 15000000)
			.forEach(System.out::println);
		
		System.out.println("\n=============================================\n");
		
		System.out.println("Sắp xếp nhân viên theo salary giảm dần.");
		listEmp.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
						.forEach(System.out::println);
		
		System.out.println("\n=============================================\n");
		
		List<String> employeeNames = listEmp.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
		System.out.println(employeeNames.toString());
		
		
		System.out.println("\n=============================================\n");
		long count = listEmp.stream().filter(emp -> emp.getName().toLowerCase().startsWith("a")).count();
		System.out.println(count);
	}
}
