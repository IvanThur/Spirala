package spirala;

import java.util.HashMap;

public class DoljeLijevo {
	
	public static void DoljeLijevo(int[][] spirala, HashMap<String, Integer> h) {
		while (true) {

			Metode.gore(spirala, h);
			Metode.desno(spirala, h);
			Metode.dolje(spirala, h);
			Metode.lijevo(spirala, h);

			if (h.get("k") >= h.get("max")) {
				break;
			}
		}
		Metode.ispis(spirala, h);

	}

	public static void DoljeLijevoSat(int[][] spirala, HashMap<String, Integer> h) {
		while (true) {

			Metode.desnoSat(spirala, h);
			Metode.goreSat(spirala, h);
			Metode.lijevoSat(spirala, h);
			Metode.doljeSat(spirala, h);
			

			if (h.get("k") >= h.get("max")) {
				break;
			}
		}
		Metode.ispis(spirala, h);
		
	}

}
