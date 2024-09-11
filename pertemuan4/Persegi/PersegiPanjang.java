package Persegi;

public class PersegiPanjang {
	int panjang, lebar;
	
	public PersegiPanjang(int panjang,int lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	public void info() {
		System.out.println("Panjang persegi panjang: " + panjang);
		System.out.println("Lebar persegi panjang: " + lebar);
	}
}
