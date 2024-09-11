package lampu;

public class Lampu implements InterfaceLampu{
	int statusLampu;
	public void hidupkan() {
		if (statusLampu == KEADAAN_MATI) {
			statusLampu = KEADAAN_HIDUP;
			System.out.println("Hidupkan Lampu!--> Lampu Hidup");
		} else {
			System.out.println("Hidupkan Lampu!--> Lampu sudah hidup");
		}
	}
	public void matikan() {
		if (statusLampu == KEADAAN_HIDUP) {
			statusLampu = KEADAAN_MATI;
			System.out.println("Matikan lampu --> Lampu Mati");
		} else {
			System.out.println("Matikan lampu --> Lampu sudah mati");
		}
	}
}
