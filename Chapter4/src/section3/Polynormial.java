package section3;

public class Polynormial {
	
	public char name;
	public MySingleLinkedList<Term> terms;
	
	public Polynormial(char name) {
		this.name = name;
		terms = new MySingleLinkedList<Term>();
	}
	
	public void addTerm(int coef, int expo) {
		if(coef == 0)
			return;
		
		Node<Term> p = terms.head, q = null;
		while(p != null && p.data.expo > expo) {
			q = p;
			p = p.next;
		}
		
		if(p != null && p.data.expo == expo) {
			p.data.coef += coef;
			if(p.data.coef == 0) {
				if(q == null)
					terms.removeFirst();
				else
					terms.removeAfter(q);
			}
		} 
		else {
			Term t = new Term(coef, expo);
			if(q == null)
				terms.addFirst(t);
			else
				terms.addAfter(q, t);			
		}
	}
	
	public int calc(int x) {
		int result = 0;
		
		Node<Term> p = terms.head;
		while(p != null) {
			result += p.data.calc(x);
			p = p.next;
		}		
		return result;		
	}
	
	public String toString() {
//		String result = "";
//		
//		Node<Term> p = terms.head;
//		while(p != null) {
//			result += (" + " +p.data.toString());
//			p = p.next;
//		}		
//		return result;	
		
		// 문자열의 사이즈가 클 때는 StringBuilder를 이용하는게 더 효율적
		StringBuilder sb = new StringBuilder();
		sb.append(name + "(x)=");
		Node<Term> p = terms.head;
		while(p != null) {
			sb.append(" + " +p.data.toString());
			p = p.next;
		}
		return sb.toString();		
	}	
}
