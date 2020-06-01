package day0601;
class Person{
	String name;
	int age;
	
	public Person() {
		this("송가인",35);
	}
	public Person(String name) {
		this(name,25);
	}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("호출");
	}
	public void write() {
		System.out.println("이름 "+name+" 나이 "+age);
	}
}
public class ConstThis_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person pe = new Person("현희",26);
		Person pe1 = new Person("홍길동");
		pe1.write();
	}

}
