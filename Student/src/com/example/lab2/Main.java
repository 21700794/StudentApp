package com.example.lab2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student(101, "Kim", 23);
		al.add(s1);
		Student s2 = new Student(102, "Choi", 21);
		al.add(s2);
		al.add(new Student(103, "Park", 25));
		al.add(new Student(104, "Cho", 26));
		al.add(new Student(105, "Jeong", 22));
		al.add(new Student(106, "Lee", 20));
		al.add(new Student(107, "Hong", 24));
		al.add(new Student(108, "Kang", 25));
		al.add(new Student(109, "Seo", 23));
		al.add(new Student(110, "Bang", 27));
		
		Collections.sort(al); //Traverse elements of arraylist (ordered)
		for (Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder()); // Traverse elements of arrayList (reverse ordered_
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}

}
