package Section1;

public class Code01 {

	public static void main(String[] args) {

		Person1 first;  // Person1 Ÿ�� ���� first�� �����ϰ�
		first = new Person1(); // Person1Ÿ���� ��ü(object) �ϳ��� �����ؼ� first�� ����
		
		first.name = "John";
		first.number = "01012345667";
		
		System.out.println("Name: " + first.name + ", Number: " + first.number);
		
		Person1[] members = new Person1[10];  // Person1 Ÿ���� �迭 ���� �� members ��ü ����
		members[0] = first;
		members[1] = new Person1();
		members[1].name = "David";
		members[1].number = "01023445667";
		
		System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);
	}

}
