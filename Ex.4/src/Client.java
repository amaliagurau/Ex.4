public class Client {

	public static void main(String[] args) {
		Sertar s1 = new Sertar(40, 80, 8);
		Sertar s2 = new Sertar(66, 90, 15);
		
		Birou b = new Birou (130, 75, 40, s1, s2);
		b.DisplayBirou();
	}

}