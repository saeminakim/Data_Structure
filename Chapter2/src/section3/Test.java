package section3;

public class Test {
	static int s = 0;
	int t = 0;
	
	public static void print1() {
		System.out.println("s = " + s); 
//		System.out.println("t = " + t); 
		// non-static 멤버인 t에는 엑세스 불가
		// t는 object 멤버이기 때문에 class 멤버인 static 메서드에 존재하지 않음
	}
	
	public void print2() {
//		System.out.println("s = " + s); 
		System.out.println("t = " + t); 
	}
	
	public static void main(String[] args) {
		s = 100;
//		t = 100;
		print1();
//		print2(); // 아래처럼 객체를 먼저 생성해야 object 멤버의 변수와 메서드에 접근할 수 있음
		
		Test test = new Test();
		test.t = 100;
		test.print2();
		
	}
}
