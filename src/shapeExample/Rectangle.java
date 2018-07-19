package shapeExample;

public class Rectangle extends Shape {
	
	
	@Override
	public void draw(Color color) {
		
		color.fillColor();
	}
	
	public static void main(String[] args) {
		
		Rectangle r=new Rectangle();
		Color c=new Blue();
		r.draw(c);
		
		
	}
		
	}
