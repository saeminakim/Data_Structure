package section1;

public class Code01_2 {

	public static void main(String[] args) {

		Person1 first;  // Person1 Ÿ�� ���� first�� �����ϰ�
		first = new Person1(); // Person1Ÿ���� ��ü(object) �ϳ��� �����ؼ� first�� ����
		
		first.name = "John";
		first.number = "01012345667";
		
		System.out.println("Name: " + first.name + ", Number: " + first.number);
		
		Person1 second = first;  // first�� second�� ������ ��ü�� �����ϰ� ����
		second.name = "Tom";
		
		System.out.println("Name: " + first.name + ", Number: " + first.number);
//		System.out.println("Name: " + second.name + ", Number: " + second.number);
		
		
		Person1[] members = new Person1[100];  // Person1 Ÿ���� �迭 ���� �� members ��ü ����
		members[0] = first;
		members[1] = second;
		
		System.out.println("Name: " + members[0].name + ", Number: " + members[0].number);
		System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);
		
		members[2] = new Person1();
		members[2].name = "David";  // member[2]�� �����ؾ� �� ��ü�� �������� �ʾұ� ������ ���� �߻�
		members[2].number = "234345657"; // ���� new Person1() ����� ��
		
		System.out.println("Name: " + members[2].name + ", Number: " + members[2].number);  
	}

}
