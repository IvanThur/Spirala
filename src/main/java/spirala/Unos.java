package spirala;

import java.util.Scanner;

public class Unos {
	
	public static int unesiInt( Scanner ulaz) {
		int i=0;
		while(true) {
			
			i = Integer.parseInt(ulaz.nextLine());
			if(i<1 || i>5) {
				System.out.println("Broj mora biti od 1 do 5");
				continue;
			}
			return i;
		}
	}
	
	

}
