package deco;

public class Client {
	
	public static void main(String[] args) {
		
		Dosa dosa=new PlainDosa();
		System.out.println(dosa.makeDosa());
		
		OnionDosa onionDosa=new OnionDosa(dosa);
		System.out.println(onionDosa.makeDosa());
	}

}
