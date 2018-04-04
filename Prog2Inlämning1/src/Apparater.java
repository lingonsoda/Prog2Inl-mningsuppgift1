
public class Apparater extends Värdesak {
	
	private double inköpsPris;
	private int slitage;
	
	public Apparater(String namn, double inköpsPris, int slitage) {
		super(namn);
		this.inköpsPris = inköpsPris;
		this.slitage = slitage;
	}
	
	@Override
	public double Värde() {
		return inköpsPris * (slitage * 0.1);
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + ": " + getNamn() + " värde:" + VärdeMedMoms() + " pris:" + inköpsPris + " slitage:" + slitage;
	}

}
