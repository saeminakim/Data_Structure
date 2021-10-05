package section3;

public class Term3 {  // 하나의 항을 표현하기 위한 클래스
	private int coef;
	private int expo;
	
	public Term3(int c, int e) {
		setCoef(c);
		expo = e;
	}
	
	public int getExpo() { // getter method
		return expo;
	}
	
	public int calcTerm(int x) {
		return (int) (getCoef() * Math.pow(x, expo));
	}
	
	public void printTerm() {
		System.out.print(getCoef() + "x^" + expo);
	}

	public int getCoef() { // getter, accessor method
		return coef;
	}

	public void setCoef(int coef) { // setter, mutator
		this.coef = coef;
	}
}
