package classes;

class Student{
	String name;
	int age;
	String address;
	Student(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student details name=" + name + ", age=" + age + ", address=" + address;
	}
	
}


public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student("Sohan", 21, "Pune");
		System.out.println("Name = " + s.getName());
		System.out.println("Age = " + s.getAge());
		System.out.println("Address = " + s.getAddress());
		System.out.println(s);

	}

}
