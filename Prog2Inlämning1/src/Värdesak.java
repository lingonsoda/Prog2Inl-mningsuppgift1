
abstract public class Värdesak {
	
	private String namn;
	private final double MOMS = 1.25;
	
	public Värdesak(String namn) {
		this.namn = namn;
	}
	
	public String getNamn() {
		return namn;
	}
	
	abstract public double Värde();
	
	abstract public String toString();
	
	public double VärdeMedMoms() {
		return Värde() * MOMS;
	}
}
