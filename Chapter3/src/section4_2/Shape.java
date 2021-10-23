package section4_2;

public abstract class Shape {

	public String shapeName;
	
	public Shape(String name) {
		shapeName = name;
	}
	
	public abstract double computerArea();
	public abstract double computerPerimeter();
}
