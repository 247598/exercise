package exercise1;

//public class creationalpatternfactory {
//
//	public creationalpatternfactory() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

interface Shape {
	 void draw();
	}

	//Concrete Product 1
	class Circle implements Shape {
	 @Override
	 public void draw() {
	     System.out.println("Drawing Circle");
	 }
	}

	//Concrete Product 2
	class Square implements Shape {
	 @Override
	 public void draw() {
	     System.out.println("Drawing Square");
	 }
	}

	//Factory class
	class ShapeFactory {
	 public static Shape getShape(String type) {
	     if (type == null) {
	         throw new IllegalArgumentException("Shape type cannot be null");
	     }
	     switch (type.toLowerCase()) {
	         case "circle": return new Circle();
	         case "square": return new Square();
	         default: throw new IllegalArgumentException("Unknown shape: " + type);
	     }
	 }
	}

	//Driver class
	public class creationalpatternfactory {
	 public static void main(String[] args) {
	     Shape circle = ShapeFactory.getShape("circle");
	     circle.draw();

	     Shape square = ShapeFactory.getShape("square");
	     square.draw();

	     // Uncomment to test invalid case
	     // Shape unknown = ShapeFactory.getShape("triangle");
	     // unknown.draw();
	 }
	}

