package arraykistproj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class project1 {

	public static void main(String[] args) {

		List<student> studentlist = new ArrayList<>();
		studentlist.add(new student(5, "abc", 100));
		studentlist.add(new student(3, "kriti", 40));
		studentlist.add(new student(2, "uvw", 30));
		studentlist.add(new student(4, "keshri", 50));
		studentlist.add(new student(1, "xyz", 20));

		for (student student : studentlist)
			System.out.println(student);

		class StudentNameComparator implements Comparator<student> {
			@Override
			public int compare(student o1, student o2) {

				return o1.name.compareTo(o2.name);
			}
		}

		Comparator<student> StudentNameCmp = new StudentNameComparator();
		Collections.sort(studentlist, StudentNameCmp);

		for (student student : studentlist)
			System.out.println(student);

		student sturollno = new student();
		sturollno.roll = 3;
		if(studentlist.contains(sturollno))
		{
			System.out.println("student exists");
		}
		else {
			System.out.println("student not found");
		}
	}

}
