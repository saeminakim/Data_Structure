package section2;

public class Term2 {  // 하나의 항을 표현하기 위한 클래스
	public int coef;
	public int expo;
	
	public int calcTerm(int x) {
		return (int) (coef * Math.pow(x, expo));
	}
	
	public void printTerm() {
		System.out.print(coef + "x^" + expo);
	}
}
