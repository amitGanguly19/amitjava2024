package miit.amit.practice.collections;

public class App {

		public static void main(String[] args) {
			Student s1 = new Student("Amit", 31, 175.45);
			Student s2 = new Student("Amit", 21, 180);
			Student s3 = new Student(s1);
			
			s1.printInfo(s1.name);
			s1.printInfo(s1.name, s1.age);
		}
}
