package Section1;

public class Code01 {

	public static void main(String[] args) {

		Person1 first;  // Person1 타입 변수 first를 선언하고
		first = new Person1(); // Person1타입의 객체(object) 하나를 생성해서 first에 대입
		
		first.name = "John";
		first.number = "01012345667";
		
		System.out.println("Name: " + first.name + ", Number: " + first.number);
		
		Person1[] members = new Person1[10];  // Person1 타입의 배열 선언 및 members 객체 생성
		members[0] = first;
		members[1] = new Person1();
		members[1].name = "David";
		members[1].number = "01023445667";
		
		System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);
	}

}
