package section3;

public class Test {
	public int a = 10;
	public double x = 1.23;
	
//	public String toString() {
//		return a + " " + x;
//	}
	
	public boolean equals(Object other) {
		Test other2 = (Test) other;
		return a == other2.a && x == other2.x;
	}
	
	public static void main(String[] args) {
//		Test test = new Test();
//		Test test2 = new Test();
//		
////		test2.a = 5;
////		test2.x = 1.234253;
//		
//		System.out.println(test.toString());
//		
//		if (test2.equals(test)) {
//			System.out.println("yes");
//		} else {
//			System.out.println("no");
//		}
		
		Object[] array = new Object[100];
		int a = 20;
//		Integer age = new Integer(a); // wrapping
//		array[0] = age;
		
		array[0] = a;   // 원래 primitive type은 Object 타입 배열에 못 넣지만.. 자바가 autoboxing 해주는 것
		
//		int b = age.intValue();  // unwrapping
		
		int b = (Integer) array[0]; // autounboxing
		System.out.println(b);
		
		String str = "1234";
		int c = Integer.parseInt(str);
		System.out.println(c);
	}
}
