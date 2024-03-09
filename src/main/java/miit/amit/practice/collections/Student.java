package miit.amit.practice.collections;

class Student{
	String name;
	int age;
	double height;
	
	

	Student(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	Student(Student s3){
	    this.name = s3.name;
	    this.age = s3.age;
	    this.height =s3.height;
	}
	
	public void printInfo(String name) {

		System.out.println(name);
	}
	public void printInfo(int age) {

		System.out.println(age);
	}
	public void printInfo(String name,int age) {

		System.out.println(name+ " " +age);
	}
	

}
