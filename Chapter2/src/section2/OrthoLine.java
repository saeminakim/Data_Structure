package section2;

public class OrthoLine {
	public MyPoint2 u;
	public MyPoint2 v;
	
	public OrthoLine(MyPoint2 p, MyPoint2 q) {
		u = p;
		v = q;
		
		// 수직 선분의 경우 위쪽이 u, 아래쪽이 v, 수평선분의 경우 왼쪽이 u, 오른쪽이 v라고 가정
		// 그렇지 않은 경우 swap() 호출하여 숫자 swap 해줌
		if( p.x > q.x || p.x == q.x && p.y > q.y) {
			swap();
		}
	}
	
	public void swap() {
		MyPoint2 tmp = u;
		u = v;
		v = tmp;
	}
	
	public OrthoLine(int x1, int y1, int x2, int y2) {
		u = new MyPoint2(x1, y1);
		v = new MyPoint2(x2, y2);
	}
	
	public boolean isVertical() {
		return u.x == v.x;   // x 좌표가 같으면 수직선상에 있다는 뜻
	}	
	
	public boolean intersects(OrthoLine other) {
		if(isVertical() && !other.isVertical()) {			
			return (other.u.x < u.x && other.v.x > u.x && u.y < other.u.y && v.y > other.u.y);			
		} else if(!isVertical() && other.isVertical()) {			
			return (other.u.y < u.y && other.v.y > u.y && u.x < other.u.x && v.x > other.u.x);			
		} else 
			return false;
	}
}
