public class Birou {
	private int lungime;
	private int latime;
	private int inaltime;

	Sertar s1;
	Sertar s2;

	public Birou(int lungime, int latime, int inaltime, Sertar s1, Sertar s2) {

		if (lungime < 0 || lungime > 200)
			this.lungime = 120;
		
		else
			this.lungime = lungime;
		if (latime < 0 || latime > 100)
			this.latime = 70;
		
		else
			this.latime = latime;
		if (inaltime < 0 || inaltime > 100)
			this.inaltime = 60;
		
		else
			this.inaltime = inaltime;

		this.s1 = s1;
		this.s2 = s2;
	}

	public void DisplayBirou() {
		System.out.println("Birou = Lungime: " + this.lungime + " Latime: " + this.latime + " Inaltime: " + this.inaltime);
		s1.DisplaySertar();
		s2.DisplaySertar();
	}
	
}