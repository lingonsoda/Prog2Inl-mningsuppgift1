import java.util.ArrayList;

public class TestProgram {
	
	private ArrayList<Värdesak> värdesaker = new ArrayList<>();
	
	public static void main(String[] args) {
		
		new TestProgram().run();
		
	}
	
	private void run() {
		Smycken s1 = new Smycken("Ring", 2, true);
		värdesaker.add(s1);
		
		Aktier a1 = new Aktier("ABC", 10, 150.50);
		värdesaker.add(a1);
		
		Apparater ap1 = new Apparater("TV", 10000, 10);
		värdesaker.add(ap1);
		
		Smycken s2 = new Smycken("Halsband", 5, false);
		värdesaker.add(s2);
		
		Aktier a2 = new Aktier("Telia", 50, 250);
		värdesaker.add(a2);
		
		Apparater ap2 = new Apparater("Radio", 1000, 5);
		värdesaker.add(ap2);
		
		Smycken s3 = new Smycken("Örhänge", 3, true);
		värdesaker.add(s3);
		
		for(Värdesak v : värdesaker) {
			System.out.println(v);
		}
		
	}

}
