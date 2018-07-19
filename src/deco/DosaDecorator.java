package deco;

public abstract class DosaDecorator implements Dosa {
	Dosa dosa;
	public DosaDecorator(Dosa dosa) {
		this.dosa = dosa;
	}
}
