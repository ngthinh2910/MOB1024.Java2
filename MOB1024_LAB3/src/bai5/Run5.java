package bai5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bai4.Student;
import bai4.StudentType;

public class Run5 {
	public static void main(String[] args) {
		List<Student> listS = new ArrayList<Student>(
				Arrays.asList(new Student("S01", "Ngọc Thịnh", StudentType.REGULAR, 3.3)
							 ,new Student("S02", "Bích Ngọc", StudentType.INTERNATIONAL, 5.0)
							 ,new Student("S03", "Văn Anh", StudentType.PART_TIME, 3)
							 ,new Student("S04", "Cảnh Kao", StudentType.PART_TIME, 2.1)
							 ,new Student("S05", "Thanh Bình", StudentType.REGULAR, 3.6)
							 ,new Student("S06", "Thanh Cảnh", StudentType.INTERNATIONAL, 3.2)
							 ,new Student("S07", "Thị Dung", StudentType.PART_TIME, 2.1)
							 ,new Student("S08", "Nguyễn Ethan", StudentType.INTERNATIONAL, 1.6)
							 ,new Student("S09", "Văn Fu", StudentType.REGULAR, 5.6)
							 ,new Student("S10", "Đõ Uyên", StudentType.PART_TIME, 1.5)
				)
		);
		
		System.out.println("Đếm số sinh viên theo từng StudentType.");
		Map<StudentType, Long> countType = listS.stream()
												.collect(Collectors.groupingBy(Student::getType, Collectors.counting()));
		System.out.println(countType.toString());
		
		System.out.println("---------------------------------------");
		System.out.println("Tính GPA avg theo từng Type");
		Map<StudentType, Double> avgGpa = listS.stream()
											   .collect(Collectors.groupingBy(Student::getType, Collectors.averagingDouble(Student::getGpa)));
		System.out.println(avgGpa);
		
	}
}
