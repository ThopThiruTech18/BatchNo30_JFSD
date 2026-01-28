package in.versionit;

public class Student {

	int id;
	String name;
	int marks;
	int age;
	char grade;

	Student(int id, String name, int marks, int age, char grade) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
		this.grade = grade;
	}

	void printStudentData() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(marks);
		System.out.println(age);
		System.out.println(grade);
	}

	public static void main(String[] args) {

		Student student1 = new Student(101, "vinay", 60, 20, 'A');
		student1.printStudentData();
		System.out.println("-------------------------------------------");
		Student student2 = new Student(102, "charan", 60, 20, 'A');
		student2.printStudentData();
		System.out.println("-------------------------------------------");
		Student student3 = new Student(103, "deep", 60, 20, 'A');
		student3.printStudentData();
		System.out.println("-------------------------------------------");
		Student student4 = new Student(104, "vijay", 60, 20, 'A');
		student4.printStudentData();
		System.out.println("-------------------------------------------");
		Student student5 = new Student(105, "chandu", 60, 20, 'A');
		student5.printStudentData();
		System.out.println("-------------------------------------------");
		Student student6 = new Student(106, "kiran", 60, 20, 'A');
		student6.printStudentData();
		System.out.println("-------------------------------------------");
		
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());
		System.out.println(student4.hashCode());
		System.out.println(student5.hashCode());
		System.out.println(student6.hashCode());
		

	}

}
