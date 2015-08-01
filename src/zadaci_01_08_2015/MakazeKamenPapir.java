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
		
		int broj = (int)(Math.random()*3);              // generisanje nasumicnog broja 0, 1 ili 2
		
		Scanner input = new Scanner(System.in);
				
		System.out.print("Unesite broj 0, 1 ili 2: ");
				
		int MKP = input.nextInt();                      // unos brojeva 0, 1 ili 2
				
				                                       // kombinacije brojeva 0, 1, i 2 gdje su makaze=0, kamen=1 i papir=2, 
		if (broj==0 && MKP==0 || broj==1 && MKP==1 || broj==2 && MKP==2){  // prvi uslov, rezultat nerijesen
			System.out.print("Kompjuter je dobio: " + broj + " a vi ste dobili: " + MKP + "\nRezultat je nerijesen!");
		}
		if (broj==0 && MKP==2 || broj==1 && MKP==0 || broj==2 && MKP==1){  // drugi uslov, kompjuter pobjednik
			System.out.print("Kompjuter je dobio: " + broj + " a vi ste dobili: " + MKP + "\nKompjuter je pobjednik!");
		}
		if (broj==1 && MKP==2 || broj==0 && MKP==1 || broj==2 && MKP==0){  // treci uslov, igrac pobjednik
			System.out.print("Kompjuter je dobio: " + broj + " a vi ste dobili: " + MKP + "\nVi ste pobjednik!");
		}
		input.close();
	}

}
