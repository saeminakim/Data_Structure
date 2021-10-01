package section1;

public class Code01_2 {

	public static void main(String[] args) {

		Person1 first;  // Person1 타입 변수 first를 선언하고
		first = new Person1(); // Person1타입의 객체(object) 하나를 생성해서 first에 대입
		
		first.name = "John";
		first.number = "01012345667";
		
		System.out.println("Name: " + first.name + ", Number: " + first.number);
		
		Person1 second = first;  // first와 second가 동일한 객체를 참조하고 있음
		second.name = "Tom";
		
		System.out.println("Name: " + first.name + ", Number: " + first.number);
//		System.out.println("Name: " + second.name + ", Number: " + second.number);
		
		
		Person1[] members = new Person1[100];  // Person1 타입의 배열 선언 및 members 객체 생성
		members[0] = first;
		members[1] = second;
		
		System.out.println("Name: " + members[0].name + ", Number: " + members[0].number);
		System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);
		
		members[2] = new Person1();
		members[2].name = "David";  // member[2]가 참조해야 할 객체를 생성하지 않았기 때문에 에러 발생
		members[2].number = "234345657"; // 위에 new Person1() 해줘야 함
		
		System.out.println("Name: " + members[2].name + ", Number: " + members[2].number);  
	}

}
