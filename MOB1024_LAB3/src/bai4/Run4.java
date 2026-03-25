package bai4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Run4 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>(
				Arrays.asList(new Student("S01", "Ngọc Thịnh", StudentType.REGULAR, 3.3)
							 ,new Student("S02", "Bích Ngọc", StudentType.INTERNATIONAL, 5.0)
							 ,new Student("S03", "Văn Anh", StudentType.PART_TIME, 3)
							 ,new Student("S05", "Thanh Bình", StudentType.REGULAR, 3.6)
							 ,new Student("S06", "Thanh Cảnh", StudentType.INTERNATIONAL, 3.2)
							 ,new Student("S07", "Thị Dung", StudentType.PART_TIME, 2.1)
							 ,new Student("S08", "Nguyễn Ethan", StudentType.INTERNATIONAL, 1.6)
							 ,new Student("S09", "Văn Fu", StudentType.REGULAR, 5.6)
							 ,new Student("S10", "Đõ Uyên", StudentType.PART_TIME, 1.5)
				)
		);
		
		System.out.println("Lọc danh sách sinh viên INTERNATIONAL có gpa >= 3.2");
		System.out.println("-------------------------------------------------");
		System.out.printf("%-5s %-15s %-20s %s\n", "ID", "NAME", "TYPE", "GPA");
		list.stream().filter(s -> s.getType() == StudentType.INTERNATIONAL || s.getGpa() >= 3.2)
					 .forEach(System.out::println);
		
		
		
		System.out.println("Sắp xếp theo GPA giảm dần và lấy TOP 3");
		System.out.println("-------------------------------------------------");
		System.out.printf("%-5s %-15s %-20s %s\n", "ID", "NAME", "TYPE", "GPA");
		list.stream().sorted((o1, o2) -> Double.compare(o2.getGpa(), o1.getGpa()))
											   .limit(3)
											   .forEach(System.out::println);
		
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("Tạo danh sách chỉ gồm name của sinh viên PART_TIME");
		List<String> parttimeS = list.stream()
									.filter(st -> st.getType() == StudentType.PART_TIME)
									.map(Student::getName)
									.collect(Collectors.toList());
		parttimeS.forEach(System.out::println);
		
	}
}
