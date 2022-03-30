package spirala;

import java.util.Scanner;

public class Unos {
	
	public static int unesiInt( Scanner ulaz, String poruka) {
		int i=0;
		while(true) {
			System.out.print(poruka + ": ");
			i = Integer.parseInt(ulaz.nextLine());
			if(i<1 || i>5) {
				System.out.println("Broj mora biti od 1 do 5");
				continue;
			}
			return i;
		}
	}
	
	

}
