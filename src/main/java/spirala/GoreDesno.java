package spirala;

import java.util.HashMap;

public class GoreDesno {

	public static void GoreDesno(int[][] spirala, HashMap<String, Integer> h) {
		while (true) {

			Metode.dolje(spirala, h);
			Metode.lijevo(spirala, h);
			Metode.gore(spirala, h);
			Metode.desno(spirala, h);

			if (h.get("k") >= h.get("max")) {
				break;
			}
		}
		Metode.ispis(spirala, h);
		
	}

	public static void GoreDesnoSat(int[][] spirala, HashMap<String, Integer> h) {
		while (true) {

			Metode.lijevoSat(spirala, h);
			Metode.doljeSat(spirala, h);
			Metode.desnoSat(spirala, h);
			Metode.goreSat(spirala, h);

			if (h.get("k") >= h.get("max")) {
				break;
			}
		}
		Metode.ispis(spirala, h);
		
	}

}
