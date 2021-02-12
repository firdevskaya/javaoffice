package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciÝsleri {

	public static void main(String[] args) {

		ArrayList<OgrenciOlusturma> ogrenciler = new ArrayList<>();

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("Hangi islemi gerceklestirmek istersiniz? \n1-) Ogrenci Kaydet"
					+ "\n2-) Ogrenci Goruntuleme\n3-) Ogrenci Sil\n4-) Cikis");
			int islem = input.nextInt();
			if (islem == 1) {
				System.out.println("Ogrenci ismini giriniz");

				String isim = input.nextLine();
				input.nextLine();
				System.out.println("Ogrenci soyadini giriniz");
				String soyisim = input.nextLine();
				System.out.println("Ogrenci numarasini giriniz");
				int numara = input.nextInt();
				System.out.println("Ogrenci ortalmasini giriniz");
				double ortalama = input.nextDouble();

				OgrenciOlusturma ogrenci = new OgrenciOlusturma(numara, isim, soyisim, ortalama);

				ogrenciler.add(ogrenci);
			} else if (islem == 2) {
				if (ogrenciler.isEmpty()) {
					System.out.println("Suan listede kayitli ogrenci bulunmamaktadir.\n____________");
				}
				for (OgrenciOlusturma ogrenci : ogrenciler) {
					System.out.println("Ogrenci Adi: " + ogrenci.getAdi() + "\nOgrenci Soyadi:" + ogrenci.getSoyAdi()
							+ "\nOgrenci No:" + ogrenci.getNumarasi() + "Ogrenci Not ortalamasý:"
							+ ogrenci.getOrtalama());
				}
			} else if (islem == 3) {
				System.out.println("Silmek istediginiz ogrenci numarasini giriniz");
				int numara = input.nextInt();
				OgrenciOlusturma ogrenciSil = null;

				for (OgrenciOlusturma ogrenci : ogrenciler) {

					if (ogrenci.getNumarasi() == numara) {
						ogrenciSil = ogrenci;

					}

				}
				ogrenciler.remove(ogrenciSil);
			} else if (islem == 4) {
				System.out.println("Program sonlandirilmistir.");
				break;
			}
		}
		input.close();

	}
}
