package zadaci_01_08_2015;

import java.util.Scanner;

public class MakazeKamenPapir {

	public static void main(String[] args) {
		/*
		 Napisati program koji igra sa protivnikom rock-paper-scissors. (papir-bunar-makaze ili tako nekako po naški)
		 Program nasumièno generiše brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze.
		 Program pita korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik pobijedio,
		 da li je raèunar pobijedio ili je bilo neriješeno.
		 */
		Scanner input = new Scanner(System.in);
		
		int broj = (int)(Math.random()*3);              // generisanje nasumicnog broja 0, 1 ili 2
		
		String [] mkp = {"Makaze", "Kamen", "Papir"};   // string koji sadrzi makaze, kamen i papir
				
		System.out.println("Unesite broj 0, 1 ili 2");
		System.out.print("(Makaze=0, Kamen=1, Papir=2): ");
				
		int MKP = input.nextInt();                      // unos brojeva 0, 1 ili 2
		while(MKP < 0 || MKP > 2) {                     // dok unos ne odgovara
			System.out.print("Unesite broj 0, 1 ili 2 ponovo: ");
			MKP = input.nextInt();                      // unos se vrsi ponovo
		}
		for(int i=0; i<mkp.length; i++) {               // petlja koja prolazi kroz string koji sadrzi makaze, kamen i papir
		}
		System.out.println();
		if (broj==0 && MKP==0 || broj==1 && MKP==1 || broj==2 && MKP==2){  // prvi uslov, rezultat nerijesen
			System.out.print("Kompjuter je dobio: " + mkp[broj] + "\nVi ste dobili: " + mkp[MKP] + "\nRezultat je nerijesen!");
		}
		if (broj==0 && MKP==2 || broj==1 && MKP==0 || broj==2 && MKP==1){  // drugi uslov, kompjuter pobjednik
			System.out.print("Kompjuter je dobio: " + mkp[broj] + "\nVi ste dobili: " + mkp[MKP] + "\nKompjuter je pobjednik!");
		}
		if (broj==1 && MKP==2 || broj==0 && MKP==1 || broj==2 && MKP==0){  // treci uslov, igrac pobjednik
			System.out.print("Kompjuter je dobio: " + mkp[broj] + " a vi ste dobili: " + mkp[MKP] + "\nVi ste pobjednik!");
		}
		input.close();
	}

}
