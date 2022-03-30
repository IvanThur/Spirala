package spirala;

import java.util.HashMap;

public class DoljeDesno {

	public static void DoljeDesno(int[][] spirala, HashMap<String, Integer> h) {
		while (true) {

			Metode.lijevo(spirala, h);
			Metode.gore(spirala, h);
			Metode.desno(spirala, h);
			Metode.dolje(spirala, h);

			if (h.get("k") >= h.get("max")) {
				break;
			}
		}
		Metode.ispis(spirala, h);

	}

	public static void DoljeDesnoSat(int[][] spirala, HashMap<String, Integer> h) {
		while (true) {

			Metode.goreSat(spirala, h);
			Metode.lijevoSat(spirala, h);
			Metode.doljeSat(spirala, h);
			Metode.desnoSat(spirala, h);

			if (h.get("k") >= h.get("max")) {
				break;
			}
		}
		Metode.ispis(spirala, h);

	}

}
