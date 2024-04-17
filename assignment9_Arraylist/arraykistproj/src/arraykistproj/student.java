package arraykistproj;

public class student implements Comparable<student>{

	int roll;
	String name;

	public student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	double marks;

	public student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	@Override
	public int compareTo(student o) {
		this.roll=o.roll;
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		else if (this==obj) {
			return true;
		}
		return false;
		if
		return this.roll-obj.r;
	}
	

}
