package pack1;

public class Test1 {

	public static void main(String[] args) {
		
		/*String x="10";
		String y="4";
		float m=Float.parseFloat(x);
		float n=Float.parseFloat(y);
		float z=m/n;
		if(m%n>n/2 || m%n == n/2)
		{
			System.out.println(m%n);
		}*/
		
		int x=true ? (int) Math.round(100 -Float.parseFloat(String.valueOf(Integer.parseInt("1000")))/Float.parseFloat(String.valueOf(Integer.parseInt("396")))) : 10;
		System.out.println(x);
	}
}
