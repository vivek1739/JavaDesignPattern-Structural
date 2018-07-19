package deco;

public class OnionDosa extends DosaDecorator {
	


	public OnionDosa(Dosa dosa) {
		super(dosa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeDosa() {
		return dosa.makeDosa()+onionAdded();
	}
	
	public String onionAdded()
	{
		return "onion added";
	}

}
