package flyweight;

public class B {
	int x;
	int y;
	
	public static void main(String[] args) {
		
		
		A a=new A();
		A a1=a;
		System.out.println(a);
		System.out.println(a1);
	}
}
