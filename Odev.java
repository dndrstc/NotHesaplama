import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Matematik Notunuz: ");
		int matematik = scanner.nextInt();
		System.out.print("Fizik Notunuz: ");
		int fizik = scanner.nextInt();
		System.out.print("Kimya Notunuz: ");
		int kimya = scanner.nextInt();
		System.out.print("Türkçe Notunuz: ");
		int turkce = scanner.nextInt();
		System.out.print("Tarih Notunuz: ");
		int tarih = scanner.nextInt();
		System.out.print("Müzik Notunuz: ");
		int muzik = scanner.nextInt();
		
		double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;
		System.out.print("Ortalama: " + ortalama + "(" + (ortalama >= 60 ? "Sınıfı Geçti." : "Sınıfta Kaldı.") + ")");
		
		
		
	}
}
