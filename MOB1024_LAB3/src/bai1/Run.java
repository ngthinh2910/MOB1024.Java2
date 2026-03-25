package bai1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Run {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>(List.of("Thịnhhh", "Nammmm", "Thảo", "An", "Trang", "Phước", "Bình"));
		
		
		System.out.println("In danh sách sử dụng foreach (lamda):");
		names.forEach(ten -> System.out.print(ten + " "));
		
		
		System.out.println("\n");
		System.out.println("In các tên có độ dài > 5");
		names.stream().filter(ten -> ten.length()>5).forEach(System.out::println);
		
		System.out.println("\nSắp xếp danh sách theo thứ tự: ");
		names.stream().sorted().forEach(System.out::println);
		
		
		System.out.println("Sắp xếp theo độ dài tên");
		names.stream().sorted(Comparator.comparingInt(String::length)).forEach(name -> System.out.println(name));
	}
}
