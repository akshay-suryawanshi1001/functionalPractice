package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionPractice {

	public static void main(String[] args) {
		List<Student> student = Arrays.asList(
				new Student(3,"akshay",67.79),
				new Student(1,"baban",77.79),
				new Student(4,"curran",87.79),
				new Student(5,"donnie",97.79),
				new Student(17,"eliza",47.79)
				);
		//Collections.sort(student,(one,two) -> one.getName().compareTo(two.getName()));
		Collections.sort(student,(one,two) -> two.getPercentage().compareTo(one.getPercentage()));
		for(Student s : student) {
			System.out.print(s.toString());
		}
	}

}
