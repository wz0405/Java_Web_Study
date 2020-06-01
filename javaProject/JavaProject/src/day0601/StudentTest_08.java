package day0601;

public class StudentTest_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_08 st = new Student_08();
		//참조변수명.변수로 값을 불러올수 없다
		//수정메서드로 수정 가능
		st.setName("한현희");
		st.setAge(26);
		String name=st.getName();
		int age=st.getAge();
		System.out.println(name+age);
	}

}
