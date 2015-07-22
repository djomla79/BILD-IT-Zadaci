package zadaci_20_07_2015;

public class Nasumicni100Brojeva {

	public static void main(String[] args) {
		/*
		 Napišite program koji generiše 100 nasumiènih cijelih brojeva
		 izmeðu 0 i 9 te ispisuje koliko se puta koji broj ponovio.
		 */
		// niz brojeva od 0 do 9
		int[] niz=new int[10];
		// petlja koja ubacuje 100 nasumicnih brojeva
		// u niz od 0 do 9 i broji koliko se koji puta broj ponovio
		for(int i=1; i<=100; i++) {
			int broj=(int)(Math.random()*10);
				niz[broj]++;
			}
		for(int i=0; i<niz.length; i++) {
		// ispis
		System.out.println("Broj " + i + " se ponovio " + niz[i] + " puta.");
		}
	}
}
