package section1;

public class Notebook extends Computer {  // extends 하나의 클래스를 확장한다는 개념으로 이해

	public double screenSize;
	public double weight;
	
	public Notebook(String man, String proc, int ram, int disk, double speed, double screen, double weight) {
		super(man, proc, ram, disk, speed); 

		screenSize = screen;
		this.weight = weight;
	}
	
	public String toString() {
		String result = super.toString() +
				"\nScreen Size: " + screenSize + " inches" +
				"\nWeight: " + weight + " kg";
		
		return result;
	}
	
	public static void main(String[] args) {
		// Notebook test = new Notebook("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2);
		Computer test = new Notebook("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2);
		// 다형성
		// Computer 타입의 변수 test가 Notebook 타입의 객체를 참조하고 있다.		
		// Notebook test2 = new Computer("Dell", "i5", 4, 1000, 3.2);  // 에러 발생
		// 반대의 경우는 안됨

		System.out.println(test.computePower());
		System.out.println(test.toString());  
		// static binding vs. dynamic binding
		// Notebook class의 toString 메서드 호출됨. dynamic binding
		
	}
	
}
