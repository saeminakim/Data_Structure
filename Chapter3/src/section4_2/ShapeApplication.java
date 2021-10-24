package section4_2;

import java.util.Arrays;
import java.util.Scanner;

public class ShapeApplication {
	
	private int capacity = 10;
	private Shape[] shapes = new Shape[capacity];
	private int n = 0;
	private Scanner kb = new Scanner(System.in);	

	public void processCommand() {
		while(true) {
			System.out.print("$ ");
			String command = kb.next();
			if(command.equals("add"))
				handleAdd();
			else if(command.equals("show") || command.equals("showdetail"))
				handleShow(command.equals("showdetail"));
			else if(command.equals("sort"))
//				MyUtilities.bubbleSort(shapes, n);
				Arrays.sort(shapes, 0, n); // 자바에서 기본적으로 제공하는 sort 메서드
			else if(command.equals("exit"))
				break;
		}
		kb.close();
	}
	
//	private void bubbleSort() {
//		for(int i = n-1; i > 0; i--) {
//			for(int j = 0; j < i; j++) {
//				if(shapes[j].computeArea() > shapes[j+1].computeArea()) {
//					Shape tmp = shapes[j];
//					shapes[j] = shapes[j+1];
//					shapes[j+1] = tmp;
//				}
//			}
//		}
//	}
	
	private void handleShow(boolean detailed) {
		for (int i = 0; i < n; i++) {
			System.out.println((i+1) + ". " + shapes[i].toString());
			if(detailed) {
				System.out.println("    The area is " + shapes[i].computeArea());
				System.out.println("    The perimeter is " + shapes[i].computerPerimeter());
			}
		}
	}

	private void handleAdd() {
		String type = kb.next();
		
		switch(type) {
		case "R":
			addShape(new Rectangle(kb.nextInt(), kb.nextInt()));
			break;
		case "C":
			addShape(new Circle(kb.nextInt()));
			break;
		case "T":
			// 생략
		}
	}

	private void addShape(Shape shape) {
		if(n >= capacity)
			reallocate();
		shapes[n++] = shape;
	}

	private void reallocate() {
		capacity *= 2;
		Shape[] tmp = new Shape[capacity];
		System.arraycopy(shapes, 0, tmp, 0, shapes.length);
		shapes = tmp;
	}

	public static void main(String[] args) {
		ShapeApplication app = new ShapeApplication();
		app.processCommand();
	}

}
