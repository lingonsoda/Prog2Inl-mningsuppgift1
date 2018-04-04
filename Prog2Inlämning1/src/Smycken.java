
public class Smycken extends Värdesak {
	
	private int antalÄdelstenar;
	private boolean gjordAvGuld;
	
	public Smycken(String namn, int antalÄdelstenar, boolean gjordAvGuld) {
		super(namn);
		this.antalÄdelstenar = antalÄdelstenar;
		this.gjordAvGuld = gjordAvGuld;
	}
	
	@Override
	public double Värde() {
		return antalÄdelstenar * 500 + (gjordAvGuld ? 2000 : 700);
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + ": " + getNamn() + " värde:" + VärdeMedMoms() + " stenar:" + antalÄdelstenar + " " + (gjordAvGuld ? "guld" : "silver");
	}

}
