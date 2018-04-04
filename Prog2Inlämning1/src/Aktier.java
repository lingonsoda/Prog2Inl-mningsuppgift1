
public class Aktier extends Värdesak {
	
	private int antalAktier;
	private double kurs;
	
	public Aktier(String namn, int antalAktier, double kurs) {
		super(namn);
		this.antalAktier = antalAktier;
		this.kurs = kurs;
	}
	
	public void setKurs(int newKurs) {
		kurs = newKurs;
	}
	
	@Override
	public double Värde() {
		return antalAktier * kurs;
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + ": " + getNamn() + " värde:" + VärdeMedMoms() + " antal:" + antalAktier + " kurs:" + kurs;
	}

}
