public class Sertar {
	private int lungime;
	private int latime;
	private int inaltime;

	public Sertar(int lungime, int latime, int inaltime) {
		if (lungime < 0 || lungime > 100)
			this.lungime = 40;

		else
			this.lungime = lungime;
		if (latime < 0 || latime > 100)
			this.latime = 40;
		
		else
			this.latime = latime;
		if (inaltime < 0 || inaltime > 100)
			this.inaltime = 18;
		
		else
			this.inaltime = inaltime;
	}

	public void DisplaySertar() {
		System.out.println("Sertar = Lungime: " + this.lungime + " Latime: " + this.latime + " Inaltime: " + this.inaltime);
	}

}