package lampu;

public class LampuBeraksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampu lampukamar = new Lampu();
		
		System.out.println("Status lampu saat ini: Mati");
		
		lampukamar.hidupkan();
		lampukamar.matikan();
		lampukamar.matikan();
		lampukamar.hidupkan();
		lampukamar.hidupkan();
	}

}
