package section1;

public class Notebook extends Computer {  // extends �ϳ��� Ŭ������ Ȯ���Ѵٴ� �������� ����

	public double screenSize;
	public double weight;
	
	public Notebook(String man, String proc, int ram, int disk, double speed, double screen, double weight) {
		super(man, proc, ram, disk, speed); 

		screenSize = screen;
		this.weight = weight;
	}
	
	public static void main(String[] args) {
		Notebook test = new Notebook("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2);
		
		System.out.println(test.computePower());
		System.out.println(test.toString());
		
	}
	
}
